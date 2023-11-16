package testnow;

import java.sql.Statement;

public class Example1 {

    int y = 20 ; // This instance variable

    static int z=30; // static variable

    public void printValueOfY(){ //non-static method
        System.out.println(y);
    }

    public static void printValueOfZ(){ //static method
        System.out.println(z);
    }

    public static void main(String s[]){
        Example1 objectOfExample1=new Example1(); //Object created

        objectOfExample1.printValueOfY(); //access non-static method with object
        printValueOfZ(); // access static method

    }
}
