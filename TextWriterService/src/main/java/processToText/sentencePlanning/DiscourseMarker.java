package processToText.sentencePlanning;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import processToText.dataModel.dsynt.DSynTConditionSentence;
import processToText.dataModel.dsynt.DSynTMainSentence;
import processToText.dataModel.dsynt.DSynTSentence;
import processToText.textPlanning.IntermediateToDSynTConverter;

import java.util.ArrayList;

public class DiscourseMarker {

    public final ArrayList<String> SEQ_CONNECTIVES = new ArrayList<String>() {{
        add("then");
        add("afterwards");
        add("subsequently");
    }};

    public ArrayList<DSynTSentence> insertSequenceConnectives(ArrayList<DSynTSentence> textPlan) {
        int index = 0;
        int indexConnectors = 0;
        boolean inserted = false;
        for (DSynTSentence s : textPlan) {
            if (s.getClass().toString().equals("class DSynTConditionSentence")) {
                DSynTConditionSentence condS = (DSynTConditionSentence) s;
                if (condS.getExecutableFragment().sen_hasConnective == false && index > 0 && condS.getConditionFragment().sen_headPosition == false) {
                    Element verb = condS.getVerb();
                    Document doc = condS.getDSynT();
                    // Insert sequence connective
//					if (index == textPlan.size()-1) {
//						IntermediateToDSynTConverter.insertConnective(doc, verb, "finally");
//					} else {
                    IntermediateToDSynTConverter.insertConnective(doc, verb, SEQ_CONNECTIVES.get(indexConnectors));
                    inserted = true;
//					}
                }
            }
            if (s.getClass().toString().equals("class DSynTMainSentence")) {
                DSynTMainSentence mainS = (DSynTMainSentence) s;
                if (mainS.getExecutableFragment().sen_hasConnective == false && index > 0 && mainS.getExecutableFragment().sen_hasBullet == false) {
                    Element verb = mainS.getVerb();
                    Document doc = mainS.getDSynT();

//					// Insert sequence connective
//					if (index == textPlan.size()-1) {
//						IntermediateToDSynTConverter.insertConnective(doc, verb, "finally");
//					} else {
                    IntermediateToDSynTConverter.insertConnective(doc, verb, SEQ_CONNECTIVES.get(indexConnectors));
                    inserted = true;
//					}
                }
            }

            // Adjust indices
            index++;
            if (inserted == true) {
                indexConnectors++;
                if (indexConnectors == SEQ_CONNECTIVES.size()) {
                    indexConnectors = 0;
                }
                inserted = false;
            }
        }
        return textPlan;
    }

}
