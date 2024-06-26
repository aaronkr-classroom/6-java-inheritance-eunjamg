public class Ex803 {

	public static void main(String[] args) {
		Car sf = new Car(); // Santa Fe
		EvCar x = new EvCar(); // Model X
		
		// Drive Santa Fe
		sf.printDetails();
		
		for( int i = 0; i < 6; i++) {
			x.drive();
		}
        System.out.println("You used " + x.getTank() +
        		"L of oil left.");
        System.out.println("You have " + x.getCharge() +
        		"% battery left.");
        System.out.println("You drove " + x.getkm() + "km.");
        
        //Drive Model X
        x.printDetails();
        
        for ( int i = 0; i < 20; i++) {
        	if (x.getCharge() <= 10) {
        		x.charge();
        	}
        	x.drive();
        }
        
        System.out.println("You have " + x.getCharge() + "% battery left.");
        System.out.println("You drove " + x.getCharge() + "km.");
	}

}
