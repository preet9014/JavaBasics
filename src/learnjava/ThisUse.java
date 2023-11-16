package learnjava;

/**
 * Java code for using 'this' keyword to refer current class instance variables
 */

public class ThisUse {

    String username;

    /**
     * Parameterized constructor
     *
     * @param username
     */

    ThisUse(String username) {
        this.username = username;
        System.out.println(username);
    }

    public static void main(String[] args) {
        ThisUse obj = new ThisUse("Charanjit");

    }

}
