package polymethodoverriding;

import polymethodoverloading.Calculator;

public class PolyExample1 {

    public static void main(String s[]){

        Animal myDog=new Dog();
        Animal myCat=new Cat();

        myDog.makeSound();
        myCat.makeSound();


        //-----------------

        Dog dog=new Dog();
        Cat cat=new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.fetch();
        cat.climb();







    }
}
