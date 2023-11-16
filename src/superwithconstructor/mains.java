/**
 *
 */
package superwithconstructor;

/**
 * @author csingh
 *Use of super with constructors: super keyword can also be used to access the parent class constructor.
 * One more important thing is that, ‘’super’ can call both parametric as well as non parametric constructors
 *  depending upon the situation. Following is the code snippet to explain the above concept:
 *
 *  Important Points;
 *  1. Call to super() must be first statement in Derived(Student) Class constructor.
 *  2. If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly, 
 *  you might think that a whole chain of constructors called, all the way back to the constructor of Object. 
 *  This, in fact, is the case. It is called constructor chaining..
 *  3. If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call 
 *  to the no-argument constructor of the superclass. If the superclass does not have a no-argument constructor, you will get 
 *  a compile-time error. Object does have such a constructor, so if Object is the only superclass, there is no problem.??
 *
 */
public class mains {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Child Obj = new Child();

    }

}
