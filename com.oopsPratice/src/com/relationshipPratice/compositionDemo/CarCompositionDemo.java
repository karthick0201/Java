package com.relationshipPratice.compositionDemo;

public class CarCompositionDemo {
	public static void main(String[] args) {
		Engine e1=new Engine();
		Car c1=new Car("Bmw",e1);
		c1.move();
		
	}
}

class Engine{
	protected void work() {
		System.out.println("Engine of the car has been started...");
	}
}
class Car{
	private String name;
	private final Engine engine;
	Car(String name,Engine engine){
		this.name=name;
		this.engine=engine;
	}
	void move() {
		engine.work();
		System.out.println("Car is Running...");
	}
}