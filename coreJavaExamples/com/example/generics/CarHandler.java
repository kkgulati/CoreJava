package com.example.generics;


public class CarHandler {
	
	public static void main(String[] args) {
		
		Car car=new Car();
		Santro santro=new Santro();
		BMW bmw=new BMW();
		
		
		//CarMechanic<Car> mechanic1=new CarMechanic<Car>(car);
		//mechanic1.run();
		
		//Car car1=mechanic1.returnCar();
		

		CarMechanic<Santro> mechanic2=new CarMechanic<Santro>(santro);
		mechanic2.run();
		
		Santro car2=(Santro)mechanic2.returnCar();

		CarMechanic<BMW> mechanic3=new CarMechanic<BMW>(bmw);
		mechanic3.run();
		
		BMW car3=mechanic3.returnCar();
		
	
	}

}
