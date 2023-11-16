/**
 *
 */
package returningobjects;

/**
 * @author csingh
 * Base is the return type when returning an object in a method
 */
public class Base {
    int age;
    String name;

    /**
     * Constructor of the Base class
     * @param age
     * @param name
     */
    Base(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Returns the object of the Base class
     * @return instance of the Base class
     */

    public Base getData() {
        Base objbase = new Base(30, "John");
        return objbase;
    }

}
