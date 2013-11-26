package ci.p32;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author moritzspindelhirn
 * @todo Documentation
 * @category ci.p32
 */
public class ConstraintSolvent {

    protected String word1;

    protected String word2;

    protected String resWord;

    protected char[] char1;

    protected char[] char2;

    protected char[] char3;

    protected HashMap<Character, IntegerVariable> variables;

    public ConstraintSolvent(String word1, String word2, String resWord) {
        // set words
        this.word1 = word1;
        this.word2 = word2;
        this.resWord = resWord;

        // initialize variable HashMap
        variables = new HashMap<Character, IntegerVariable>();

        // add all int vars
        char1 = new char[word1.length()];
        initializeWord(word1, char1);
        char2 = new char[word2.length()];
        initializeWord(word2, char2);
        char3 = new char[resWord.length()];
        initializeWord(resWord, char3);
    }

    protected void initializeWord(String word, char[] charArray) {
        word.getChars(0, word.length(), charArray, 0);
        for(char character : charArray) {
            if(!variables.containsKey(character)) {
                variables.put(character, Choco.makeIntVar(String.valueOf(character), 0, 9, Options.V_ENUM));
            }
        }
    }

    public void solveConstraints() {
        // initialize model
        Model model = new CPModel();
        // initialize carry storage
        List<IntegerVariable> carries = new ArrayList<IntegerVariable>();

        for(int i = word1.length() - 1 ; i >= 0 ; i--) {
            // initialize new carry var
            String carryName = String.format("carry%d", i);
            IntegerVariable carry = Choco.makeIntVar(carryName, 0, 1);

            // get chars from each word
            char word1Char = word1.charAt(i);
            char word2Char = word2.charAt(i);
            char resWordChar = resWord.charAt(i);

            // debug print
            System.out.println(String.format("%s + %s = %s", word1Char, word2Char, resWordChar));

            // simple sum
            IntegerExpressionVariable wordSum = Choco.plus(variables.get(word1Char), variables.get(word2Char));

            // if a carry var is in the list use it for this calculation
            if(carries.size() > 0) {
                // add last carry
                IntegerVariable lastCarry = carries.get(carries.size() - 1);
                wordSum = Choco.plus(lastCarry, wordSum);
            }

            // add constraint for : (last carry +) word 1 char + word 2 char = result word character + new carry
            model.addConstraint(Choco.eq(wordSum, Choco.plus(variables.get(resWordChar), Choco.mult(10, carry))));

            // add new carry to storage
            carries.add(carry);
        }

        // build up int var array
        IntegerVariable[] varArray = new IntegerVariable[variables.size()];
        int j = 0;
        for(IntegerVariable intVar : variables.values()) {
            varArray[j++] = intVar;
        }
        model.addConstraint(Choco.allDifferent(varArray));

        // solve it!
        Solver s = new CPSolver();
        s.read(model);
        s.solve();

        // print result
        System.out.print("\n\n\n");
        printResult(s);
    }

    protected void printResult(Solver s) {
        printWordResult(char1, s);
        printWordResult(char2, s);
        printWordResult(char3, s);
    }

    protected void printWordResult(char[] charArray, Solver s) {
        StringBuilder builder = new StringBuilder();
        builder.append("Result for word: ");
        builder.append(charArray);
        builder.append("\n");
        for(char character : charArray) {
            builder.append(String.format("%s = %d\n", character, s.getVar(variables.get(character)).getVal()));
        }
        builder.append("+++++++++++++++++\n");

        System.out.print(builder.toString());
    }
}
