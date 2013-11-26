package ci.p32;

/**
 * @author moritzspindelhirn
 * @todo Documentation
 * @category ci.p32
 */
public class Main {
    public static void main(String[] args) {
        ConstraintSolvent solvent = new ConstraintSolvent("DONALD", "GERALD", "ROBERT");
        solvent.solveConstraints();
    }
}
