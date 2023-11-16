/**
 *
 */
package superwithconstructor;

/**
 * @author csingh
 * Child class
 */
public class Child extends Base {
    Child() {
        /**
         * 	Invoke or call parent class constructor
         * 	Call to super() must be first statement in Derived(Student) Class constructor
         */
        super();
        System.out.println("Child class constructor ");

    }
}
