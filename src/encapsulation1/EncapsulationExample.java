package encapsulation1;

public class EncapsulationExample {
    public static void main(String s[]){

        Student student1=new Student("John",29,5);

        //Accessing and displaying information using public method
        student1.displayInfo();

        //Individually accessing the age, name and gpa
        System.out.println(student1.getAge());

        System.out.println(student1.getName());

        System.out.println(student1.getGpa());

    }
}
