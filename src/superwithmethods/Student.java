package superwithmethods;

/**
 * Child class
 */

public class Student extends Person {
    void message() {
        System.out.println("This is student class / Child class");
    }

    void display() {
        /**
         * Will invoke or call current class message() method
         */
        message();


        /**
         * Will invoke or call parent class message() method
         */
        super.message();
    }

}
