/**
 *
 */
package polymorphism;

/**
 * @author csingh
 *
 */
public class SuccessLogin extends Login {

    /**
     * Constructor of the SuccessLogin class
     * @param uname
     * @param pass
     */
    public SuccessLogin(String uname, String pass) {

        super(uname, pass);
    }

    public void homeScreen() {
        setlogin();
        System.out.println("Successful login");
    }

}
