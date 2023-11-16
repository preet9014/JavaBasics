/**
 *
 */
package returningobjects;

/**
 * @author csingh
 *
 */
public class ObjectPassing {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Base objbase1 = new Base(29, "Shawn");
        Base objbase2;
        objbase2 = objbase1.getData();

        System.out.println(objbase1.age);
        System.out.println(objbase1.name);

        System.out.println(objbase2.age);
        System.out.println(objbase2.name);
    }





}
