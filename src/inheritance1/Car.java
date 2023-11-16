package inheritance1;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors){
        super(brand,model);
        this.numberOfDoors=numberOfDoors;
    }

    //Getter method
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void displayCarInfo(){
        super.displayInfo();
        System.out.println("Number of Door:" +numberOfDoors);
    }
}



