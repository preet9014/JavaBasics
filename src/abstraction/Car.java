package abstraction;

public class Car extends Parking {

    Car(String vehicle) {
        super(vehicle);
    }

    @Override
    public void getRates() {
        System.out.println("$5/hr");
    }

}
