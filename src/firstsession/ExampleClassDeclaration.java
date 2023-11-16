package firstsession;

import testnow.Example1;

public class ExampleClassDeclaration {
    /*
    //Default Constructor
    public ExampleClassDeclaration(){
    }

    //Parameterized Constructor
    public ExampleClassDeclaration(String messageMe, int age){

    }
     */


    /*
    Access Identifiers

    1. Public
    2. Private
    3. Protected


    String message; // By default this is public
    public String message1;

    private String message2; // This can be accessed with the class only

    protected String message3;

     */
    private String message="Hello";
    /*
    //Constructor of the class
    public ExampleClassDeclaration(String message){
        this.message=message;
    }

     */

    //method
    public void printMessage(){
        System.out.println("Message:"+ message);
    }


}
