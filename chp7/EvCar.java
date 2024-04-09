public class EvCar extends Car {
	int charge = 100;
	
	EvCar(){
        super(2024, "Tesla", "Model X"); // S,3,X,Y
	}
	
	int getCharge(){
		return this.charge;
	}
	void charge(){
		this.charge = 100;
        System.out.println("You charged your car.");
	}
}
