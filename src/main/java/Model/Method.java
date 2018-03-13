package Model;

import Util.HelperMethods;

import java.util.LinkedHashMap;

/**
 * @author sergaben on 07/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Method implements HelperMethods {
    private String bodyMethod;
    private int cyclomaticComplexity;
    private LinkedHashMap<String,Integer> operatorsOccurencesInMethod = new LinkedHashMap<>();
    private LinkedHashMap<String,Integer> uniqueOperatorsInMethod = new LinkedHashMap<>();


    public Method(String bodyMethod, LinkedHashMap<String,Integer> operatorsInMethod, LinkedHashMap<String,Integer> uniqueOperators){
        this.bodyMethod = bodyMethod;
        iterateThroughCollectionAndAddTo(operatorsInMethod,operatorsOccurencesInMethod);
        iterateThroughCollectionAndAddTo(uniqueOperators,uniqueOperatorsInMethod);
    }

    public Method(String bodyMethod, LinkedHashMap<String,Integer> operatorsInMethod){
        this.bodyMethod = bodyMethod;
        iterateThroughCollectionAndAddTo(operatorsInMethod,operatorsOccurencesInMethod);
    }

    public Method(String bodyMethod,int cyclomaticComplexity){
        this.bodyMethod = bodyMethod;
        this.cyclomaticComplexity = cyclomaticComplexity;
    }

    public Method(){

    }

    public int getCyclomaticComplexity() { return cyclomaticComplexity; }

    public LinkedHashMap<String, Integer> getUniqueOperatorsInMethod() {
        return uniqueOperatorsInMethod;
    }

    public String getBodyMethod() {
        return bodyMethod;
    }

    public LinkedHashMap<String, Integer> getOperatorsOccurencesInMethod() {
        return operatorsOccurencesInMethod;
    }
}
