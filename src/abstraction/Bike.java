package abstraction;

public class Bike extends Parking {

    Bike(String vehicle) {
        super(vehicle);
    }

    @Override
    public void getRates() {
        System.out.println("$2/hr");
    }

}
