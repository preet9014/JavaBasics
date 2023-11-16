package polymorphism;

public class FailureLogin extends Login {

    /**
     * Constructor of the FailureLogin class
     *
     * @param uname
     * @param pass
     */
    public FailureLogin(String uname, String pass) {
        super(uname, pass);
    }

    public void homeScreen() {
        setlogin();
        System.out.println("Faliure Login");
    }

}
