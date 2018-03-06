package Model;

import java.util.HashMap;

/**
 * @author sergaben on 01/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Counter {

    private HashMap<String,Integer> operatorsOccurences = new HashMap<>();

    public Counter(){
    }

    public HashMap<String, Integer> getOperatorsOccurences() {
        return operatorsOccurences;
    }

    // 1. identify the token name to put it into a hashmap
    // 2. add integer of 1 to a hashmap
    // 3. check if the token name is in the hashmap
    // 4. if the token is in the hashmap add one to the integer related to that token
    // 5. if the token is not in the hashmap add it
    // 6. after that add a integer of 1 to the related token
    public void identifyNoOfOperators(String operatorAbreviation) {

        int nOfOccurences = 1;

        if(operatorsOccurences.containsKey(operatorAbreviation)){

            nOfOccurences += operatorsOccurences.get(operatorAbreviation);
            operatorsOccurences.remove(operatorAbreviation);
            operatorsOccurences.put(operatorAbreviation,nOfOccurences);

        }else if(!operatorsOccurences.containsKey(operatorAbreviation)){

            operatorsOccurences.put(operatorAbreviation,1);

        }
    }

}
