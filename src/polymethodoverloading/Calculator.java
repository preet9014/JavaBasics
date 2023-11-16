package polymethodoverloading;

public class Calculator {
    //parameter - 3

    public void add(){

    }

    public int add(int a){
        return a;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }


    public void add(String s, int b){
     //
    }










    public double add(double a, double b){
        return a+b;
    }

    public String add(String a,String b){
        return a+b;
    }
}
