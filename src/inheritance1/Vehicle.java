package inheritance1;

public class Vehicle {
    //Super class
    private String brand;
    private String model;

    //Constructor
    public Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    //Getter method
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void displayInfo(){
        System.out.println("Brand :"+ brand);
        System.out.println("Model :"+ model);
    }

}
