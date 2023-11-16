package superwithvariable;

/**
 * Use of super with variables: This scenario occurs when a derived class and base class has same data members.
 * In that case there is a possibility of ambiguity for the JVM. We can understand it more clearly using this code snippet:
 */

public class Mains {
    public static void main(String[] args) {
        Child Obj = new Child();
        Obj.showCar();
    }

}
