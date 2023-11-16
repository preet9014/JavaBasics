package abstraction;

import java.util.Calendar;

abstract class Parking {

    /**
     * Constructor of the class
     *
     * @param vehicle
     */
    Parking(String vehicle) {
        System.out.println("Your Vehicle Type is: " + vehicle);
    }

    /**
     * Abstract method
     */
    abstract public void getRates();

    /**
     * Implemented methods inside of the Abstract class
     *
     * @param plateNumber
     */
    public void getPermit(String plateNumber) {
        System.out.println("The Plate Number is: " + plateNumber);
        Calendar c = Calendar.getInstance();
        System.out.println("Dated" + c.getTime());

    }


}

