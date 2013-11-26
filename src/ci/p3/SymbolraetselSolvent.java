package ci.p3;

import antlr.TokenStream;
import ci.antlr.sym.SymbolArithFormer;
import ci.antlr.sym.SymbolraetselLexer;
import ci.antlr.sym.SymbolraetselParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author moritzspindelhirn
 * @todo Documentation
 * @category ci.p3
 */
public class SymbolraetselSolvent {

    protected ANTLRInputStream inputStream;

    protected SymbolraetselLexer lexer;

    protected SymbolraetselParser parser;

    public SymbolraetselSolvent(File inputFile) throws IOException {
        inputStream = new ANTLRInputStream(new FileInputStream(inputFile));
        lexer = new SymbolraetselLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        parser = new SymbolraetselParser(tokenStream);
    }

    public void start() throws RecognitionException {
        CommonTreeNodeStream nodeStream = runBaseParser();
        List<List<String>> tasks = runArithFormer(nodeStream);

        printArithOperations(tasks);
    }

    protected void printArithOperations(List<List<String>> tasks) {
        for(List<String> task : tasks) {
            System.out.println(String.format("%s + %s = %s", task.get(0), task.get(1), task.get(2)));
        }
    }

    protected void printNodeStream(CommonTreeNodeStream baseNodeStream) {
        Object o;
        do {
            o = baseNodeStream.nextElement();
            System.out.println(o);
        } while(!baseNodeStream.isEOF(o));
    }

    protected CommonTreeNodeStream runBaseParser() throws RecognitionException {
        SymbolraetselParser.program_return programReturn = parser.program();

        CommonTree tree = (CommonTree) programReturn.getTree();
        return new CommonTreeNodeStream(tree);
    }

    protected List<List<String>> runArithFormer(CommonTreeNodeStream baseNodeStream) throws RecognitionException {
        SymbolArithFormer arithFormer = new SymbolArithFormer(baseNodeStream);
        arithFormer.prog();

        return arithFormer.tasks;
    }
}
