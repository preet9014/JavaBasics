package polymethodoverriding;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    public void climb(){
        System.out.println("Climbing on tree");
    }
}
