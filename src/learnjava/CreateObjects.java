/**
 *
 */
package learnjava;

/**
 * @author csingh
 *
 */
public class CreateObjects {

    /**
     * @param args
     * By using this method we can call any constructor we want to call (no argument or parameterized constructors).
     */
    public String tree = "created object";

    public static void main(String[] args) {
        CreateObjects Obj = new CreateObjects();
        System.out.println(Obj.tree);
    }

}
