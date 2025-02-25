package processToText.dataModel.petri;

import org.jbpt.petri.Marking;
import org.jbpt.petri.NetSystem;
import org.jbpt.petri.Transition;

import java.util.*;

/**
 * Set of finite processes of a net system.
 *
 * @author Artem Polyvyanyy
 */
public class ProcessCover {

    // collection of correct processes
    Collection<Process> correctProcesses = null;
    // collection of unsafe processes
    Collection<Process> unsafeProcesses = null;
    // collection of deadlock processes
    Collection<Process> deadlockProcesses = null;
    // originative net system
    private NetSystem originativeNetSystem = null;
    // process setup
    private ProcessSetup setup = null;

    // main process
    private Process main = null;

    private Stack<Process> stack = null;

    private Marking M = null;

    // Set of covered transitions
    private Set<Transition> coveredTransitions = null;
    private Set<Transition> constructedTransitions = null;

    /**
     * Constructor of a process set.
     * Uses default setup for constructing processes, @see {@link ProcessSetup}.
     *
     * @param sys Originative net system.
     */
    public ProcessCover(NetSystem sys) {
        this(sys, new ProcessSetup());
    }

    /**
     * Constructor of a process set.
     *
     * @param sys   Originative net system.
     * @param setup Setup to use for constructing processes, @see {@link ProcessSetup}.
     */
    public ProcessCover(NetSystem sys, ProcessSetup setup) {
        // originative net system
        this.originativeNetSystem = sys;
        this.correctProcesses = new ArrayList<Process>();
        this.unsafeProcesses = new ArrayList<Process>();
        this.deadlockProcesses = new ArrayList<Process>();
        this.coveredTransitions = new HashSet<Transition>();
        this.constructedTransitions = new HashSet<Transition>();
        this.setup = setup;
        Process ini = new Process(this.originativeNetSystem, this.setup);
        this.main = ini;
        this.stack = new Stack<Process>();
        this.stack.push(this.main);

        this.M = this.originativeNetSystem.getMarking();
        this.construct();
        this.originativeNetSystem.loadMarking(this.M);
    }

    /**
     * Get all constructed processes of the originative net system.
     *
     * @return Collection of processes of the originative net system.
     */
    public Collection<Process> getCorrectProcesses() {
        return this.correctProcesses;
    }

    public Collection<Process> getUnsafeProcesses() {
        return this.unsafeProcesses;
    }

    public Collection<Process> getDeadlockProcesses() {
        return this.deadlockProcesses;
    }

    /**
     * Construct process set.
     */
    private void construct() {
        while (!this.stack.isEmpty()) {
            if (this.coveredTransitions.containsAll(this.originativeNetSystem.getTransitions())) return;

            Process pi = this.stack.pop();
            this.coveredTransitions.addAll(pi.getCoveredTransitions());

            if (!pi.isSafe())
                this.unsafeProcesses.add(pi);
            else if (!pi.isDeadlockFree())
                this.deadlockProcesses.add(pi);
            else {
                Set<Set<Transition>> cosets = pi.getCosetsOfEnabledTransitions();
                Set<Transition> firstCoset = cosets.iterator().next();
                cosets.remove(firstCoset);

                // populate stack
                Marking currentM = pi.getCurrentMarking();
                this.originativeNetSystem.loadMarking(currentM);
                for (Set<Transition> coset : cosets) {
                    Process freshPi = new Process(this.originativeNetSystem, this.setup);
                    boolean modified = false;
                    for (Transition t : coset) {
                        if (!this.coveredTransitions.contains(t)) {
                            freshPi.appendEvent(t);
                            modified = true;
                        }
                    }

                    if (modified)
                        this.stack.push(freshPi);
                }

                // extending the current run
                boolean modified = false;
                for (Transition t : firstCoset) {
                    if (!this.coveredTransitions.contains(t)) {
                        pi.appendEvent(t);
                        modified = true;
                    }
                }

                if (modified)
                    this.stack.push(pi);
                else {
                    //pi.removeTransitions(this.constructedTransitions);
                    this.constructedTransitions.addAll(pi.getCoveredTransitions());
                    this.correctProcesses.add(pi);
                }
            }
        }
    }
}
