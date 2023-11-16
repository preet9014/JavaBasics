package polymethodoverloading;

public class PolyExample {
    public static void main(String s[]){
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(5,5));
        System.out.println(calculator.add(5,5, 5));
        System.out.println(calculator.add(5.5,10.5));
        System.out.println(calculator.add("Hello","Boss"));
        calculator.add("jogn",15);

    }
}
