package Model;

/**
 * @author sergaben on 07/02/2018.
 * @project AnalyseToolDependableSystem
 */
public interface Regex {
    String[] regularExpressions = {"(((public|private|protected|static|final|abstract|synchronized|volatile)(\\s+))(.*\\(.*\\)))|(((public|private|protected|static|final|abstract|synchronized|volatile)(\\s+))(.*\\()(.*\\)\\{))"
            ,"((public|private|class)(\\s+))(.*)(\\{?)"
            ,"((if\\())(.*)(\\))(\\{)"
            ,"(\\})"
            ,"((for\\s\\()|(for\\()).*;.*;.*\\)(\\{?)"
            ,"((for\\s\\()|(for\\()).*:.*\\)(\\{?)"
            ,"(.*)\\s(.*)\\s(=)(.*)(;)"
            ,"(.*).(.*)(;)"
            ,"\\{"
            ,"(try\\{)|(try)"
            ,"((catch\\s\\(.*\\))|(catch\\(.*\\)))(\\{?)"
            ,"System\\.out.*(\\()(.*)(\\))\\s|\\{"};// this expression works for all the methods
}
//TODO - add expression for else if, else, switch, while, do...while,