package polymorphism;

public class Fire1 {

    public Fire1() {
    }

    public static void main(String[] args) {

        Login[] login = new Login[4];
        //
        Login log=new SuccessLogin("username1", "password1");
        log.homeScreen();
        //



        login[0] = new SuccessLogin("username1", "password1");
        login[1] = new SuccessLogin("username2", "password2");
        login[2] = new FailureLogin("username3", "password3");
        login[3] = new FailureLogin("username4", "password4");

        for (int i = 0; i < login.length; i++) {
            login[i].homeScreen();

        }
    }

}
