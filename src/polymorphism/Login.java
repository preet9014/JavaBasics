/**
 *
 */
package polymorphism;

/**
 * @author csingh
 * Super Class
 */
public class Login {

    private String uname;
    private String pass;

    /**
     * Constructor of the the Login class
     * @param uname
     * @param pass
     */
    public Login(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }

    public void setlogin() {
        String email = uname;
        String password = pass;
        System.out.println(email + password + "Enter click");
    }

    public void homeScreen() {
        setlogin();
        System.out.println("Login Screen");
    }

}
