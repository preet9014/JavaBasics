package objectpassing;

public class EPrint {

    /**
     * Method accepts the Object of the class
     *
     * @param obj
     */

    public void getUserData(DataSource obj) {
        System.out.println(obj.name);
        System.out.println(obj.company);
    }
}
