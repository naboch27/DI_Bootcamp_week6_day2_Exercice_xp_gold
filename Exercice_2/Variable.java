/**
 * Variable
 */
public class Variable {

    int mySecretNumber = 10;

    public void displaySecret() {
        // write your code here
        int mySecretNumber = 45;

        System.out.println("Local Variable : " + mySecretNumber);
    }

    /**
     * 
     */
    public static void main(String[] args) {
        Variable notSoPrivate = new Variable();
        System.out.println("Reference variable accessing instance variable : " + notSoPrivate.mySecretNumber);
        notSoPrivate.displaySecret();
    }

}