/**
 *
 */
package superwithmethods;

/**
 * @author csingh
 * Use of super with methods: This is used when we want to call parent class method.
 * So whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword. 
 * This code snippet helps to understand the said usage of super keyword.
 *
 * Important: Super can be used in the class who has extend Base class
 *
 */
public class Mains {

    /**
     * @param args
     */
    public static void main(String[] args) {
        {
            Student s = new Student();

            /**
             * calling display() of Student
             */
            s.display();

        }

    }

}
