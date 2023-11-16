package abstraction;

public class Fire {

    public static void main(String[] args) {

        /**
         * 	Reference of the Abstract is created for both the Car and Bike classes
         * 	Cannot create the Object of the Abstract class e.g. Parking obj=new Parking();
         */


        Parking Objcar = new Car("Jeep");
        Objcar.getRates();
        Objcar.getPermit("L5TYUN");

        Parking Objbike = new Bike("Mountain");
        Objbike.getRates();
        Objbike.getPermit("None");


		/*
		
		Car ObjC=new Car("Jeep");
		ObjC.getRates();
		ObjC.getPermit("L5TYUN");
				
		
		Bike ObjB=new Bike("Mountain");
		ObjB.getRates();
		ObjB.getPermit("None");
		*/

    }

}
