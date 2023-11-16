/**
 *
 */
package superwithvariable;

/**
 * @author csingh
 * Child class extends Base class
 */
public class Child extends Base {

    String car = "Mercedes";

    public void showCar() {
        /**
         * Invokes the car of the base class with the help of Super
         */
        System.out.println(super.car);

    }

}
