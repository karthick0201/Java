package com.abstractPratice.shapeAbstract;

abstract class Shape {
	
	abstract void rotate();
	abstract void playMusic();
}

class Circle extends ShapeDemo {
	void rotate() {
		System.out.println("Rotate method from Circle Class");
	}
	void playMusic() {
		System.out.println("Music form Circle Class");
	}
	
}

class Triangle extends ShapeDemo{
	void rotate() {
		System.out.println("Rotate method from Triange Class");
	}
	void playMusic() {
		System.out.println("Music form Triange Class");
	}
}

class Square extends ShapeDemo{
	void rotate() {
		System.out.println("Rotate method from Square Class");
	}
	void playMusic() {
		System.out.println("Music form Square Class");
	}
}
class Amoeba{
	int x;
	int y; 
	void rotate() {
		System.out.println("Rotate method from Amoeba Class");
		System.out.println("Rotate code!!!");
	}
	void playMusic() {
		System.out.println("Music form Circle Class");
		System.out.println("Playing Differnet Song");
	}
}

class ShapeDemo{
	public static void main(String[] args) {
		Amoeba amoeba = new Amoeba();
		amoeba.rotate();
		amoeba.playMusic();
	}
}

/*
 * If he says, one shape class and create objects circle,Amoeba,Triangle, etc., 
 * But if we did like that, one call that method only, not override use...
 * all objects behave same like together, but ameoba was behave different way so, if we do his idea, it will 
 * lead to misconfution, so Every class has his own state and behavior... Create like that is correct....
 * 
 * */
