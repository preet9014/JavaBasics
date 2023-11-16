package encapsulation1;

public class Student {
    //Private data
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;

        //Validate GPA to ensure its within range
        if(gpa>=0.0 && gpa<=4.0) {
            this.gpa = gpa;
        }else{
            System.out.println("Invalid GPA. Setting default GPA to 0.0");
            this.gpa=0.0;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGpa(){
        return gpa;
    }

    public void displayInfo(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        System.out.println("GPA :"+ gpa);
    }
}
