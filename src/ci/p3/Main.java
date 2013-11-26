package ci.p3;

import org.antlr.runtime.RecognitionException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    File inputFile = new File("input.txt");
        try {
            SymbolraetselSolvent solvent = new SymbolraetselSolvent(inputFile);
            solvent.start();
        } catch (IOException e) {
            System.err.println("Check your input file.");
            e.printStackTrace();
        } catch (RecognitionException e) {
            System.err.println("Check what you are doing.");
            e.printStackTrace();
        }
    }
}
