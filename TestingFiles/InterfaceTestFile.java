package Util;

import Model.Comment;
import Util.gen.Util.OperatorsBaseListener;
import Util.gen.Util.OperatorsLexer;
import Util.gen.Util.OperatorsParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * @author sergaben on 07/03/2018.
 * @project AnalyseToolDependableSystem
 */
public interface HelperMethods {

    default public void iterateThroughCollectionAndAddTo(HashMap<String,Integer> hashMapIterateThrough, HashMap<String,Integer> hashMapAddTo){
        Iterator it = hashMapIterateThrough.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            String value = pair.getValue().toString();
            hashMapAddTo.put(pair.getKey().toString(),Integer.parseInt(value));
            it.remove();
        }
    }
    default public void iterateThroughLexerFindComments(Comment comment, Lexer lexer){
        String tokenName;
        for(Token token = lexer.nextToken(); token.getType() != Token.EOF ; token = lexer.nextToken()){
            tokenName = OperatorsLexer.VOCABULARY.getSymbolicName(token.getType());
            if(tokenName.equals("LINE_COMMENT")){
                comment.setSingleLineComments(token.getText());
            }else if(tokenName.equals("BLOCKCOMMENT")) {
                comment.setMultiLineComments(token.getText());
            }
        }
    }

    default public ArrayList<Integer> getLinesOfCode(OperatorsParser parser){
        Set<Integer> loc = new HashSet<>();
        ArrayList<Integer> locAndNumberOfTernaryExpression = new ArrayList<>();
        ParseTreeWalker.DEFAULT.walk(new OperatorsBaseListener(){
            @Override
            public void visitTerminal(TerminalNode node){
                if(node.getSymbol().getType() != Token.EOF){
                    loc.add(node.getSymbol().getLine());
                }
            }
        },parser.compilationUnit());
        locAndNumberOfTernaryExpression.add(loc.size());
        locAndNumberOfTernaryExpression.add(parser.getTernaryOperatorsCC());
        return locAndNumberOfTernaryExpression;
    }

}
