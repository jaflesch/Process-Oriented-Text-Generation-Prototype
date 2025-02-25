package de.hpi.bpt.hypergraph.abs;

import java.util.*;

/**
 * Notification mechanism of edge updates to graph
 *
 * @param <E> Edge type employed in the graph
 * @param <V> Vertex type employed in the graph
 * @author Artem Polyvyanyy
 */
public abstract class AbstractGraphNotifier<E extends IHyperEdge<V>, V extends IVertex> extends GObject {

    protected Map<V, Set<E>> vertices = new Hashtable<V, Set<E>>();
    protected Map<E, Set<V>> edges = new Hashtable<E, Set<V>>();

    /**
     * Index vertex in the edge
     *
     * @param e Edge
     * @param v Vertex
     */
    protected void addIndex(E e, V v) {
        if (e == null || v == null) return;
        if (!this.edges.containsKey(e))
            this.edges.put(e, new HashSet<V>());

        this.edges.get(e).add(v);

        if (!this.vertices.containsKey(v))
            this.vertices.put(v, new HashSet<E>());

        this.vertices.get(v).add(e);
    }

    /**
     * Index collection of vertices in the edge
     *
     * @param e  Edge
     * @param vs Collection of vertices
     */
    protected void addIndex(E e, Collection<V> vs) {
        if (e == null || vs == null) return;
        Iterator<V> i = vs.iterator();
        while (i.hasNext()) {
            this.addIndex(e, i.next());
        }
    }

    /**
     * Remove vertex index from the edge
     *
     * @param e Edge
     * @param v Vertex
     */
    protected void removeIndex(E e, V v) {
        if (e == null || v == null) return;
        if (this.edges.containsKey(e)) {
            this.edges.get(e).remove(v);

            if (this.edges.get(e).size() == 0)
                this.edges.remove(e);
        }

        if (this.vertices.containsKey(v)) {
            this.vertices.get(v).remove(e);

            if (this.vertices.get(v).size() == 0)
                this.vertices.remove(v);
        }
    }

    /**
     * Remove vertex index for collection of vertices from the edge
     *
     * @param e  Edge
     * @param vs Collection of vertices
     */
    protected void removeIndex(E e, Collection<V> vs) {
        if (e == null || vs == null) return;
        Iterator<V> i = vs.iterator();
        while (i.hasNext()) {
            this.removeIndex(e, i.next());
        }
    }
}
