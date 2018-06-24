package Model;

import Util.HelperMethods;

import java.util.*;

/**
 * @author sergaben on 07/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Method implements HelperMethods {
    private String bodyMethod;
    private int cyclomaticComplexity;
    private LinkedHashMap<String,Integer> operatorsOccurencesInMethod = new LinkedHashMap<>();
    private LinkedHashMap<String,Integer> uniqueOperatorsInMethod = new LinkedHashMap<>();
    private ArrayList<String> operandsOccurencesInMethod = new ArrayList<>();
    private Set<String> uniqueOperandsInMethod = new HashSet<>();


    public Method(String bodyMethod, LinkedHashMap<String,Integer> operatorsInMethod, LinkedHashMap<String,Integer> uniqueOperators, ArrayList<String> operandsIdentifiers, Set<String> uniqueOperands){
        this.bodyMethod = bodyMethod;
        iterateThroughCollectionAndAddTo(operatorsInMethod,operatorsOccurencesInMethod);
        iterateThroughCollectionAndAddTo(uniqueOperators,uniqueOperatorsInMethod);
        this.operandsOccurencesInMethod.addAll(operandsIdentifiers);
        this.uniqueOperandsInMethod = uniqueOperands;
//        iterateThroughCollection(operandsIdentifiers,operandsOccurencesInMethod);
    }


    public Method(String bodyMethod, LinkedHashMap<String,Integer> operatorsInMethod, LinkedHashMap<String,Integer> uniqueOperators, ArrayList<String> operandsIdentifiers){
        this.bodyMethod = bodyMethod;
        iterateThroughCollectionAndAddTo(operatorsInMethod,operatorsOccurencesInMethod);
        iterateThroughCollectionAndAddTo(uniqueOperators,uniqueOperatorsInMethod);
        this.operandsOccurencesInMethod.addAll(operandsIdentifiers);
//        iterateThroughCollection(operandsIdentifiers,operandsOccurencesInMethod);
    }

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

    public ArrayList<String> getOperandsOccurencesInMethod() {
        return operandsOccurencesInMethod;
    }

    public Set<String> getUniqueOperandsInMethod() {
        return uniqueOperandsInMethod;
    }
}
