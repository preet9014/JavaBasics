package testnow;

public class ExampleArray {

    public static void main(String s[]){

        //Declare an array of integer
        int[] myArray;

        //Allocate memory for 5 integers
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;


        //Access elements of array one by one
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);



        //Access all the elements of an array using loop
        for (int i=0; i< myArray.length;i++){
            System.out.println("Elements at index"+ i +" : "+ myArray[i]);
            System.out.println("Elements at index"+ myArray[i]);
        }


        /*
        Common Error
        System.out.println(myArray[5]);
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	    at testnow.ExampleArray.main(ExampleArray.java:20)
         */

    }


}
