package com.abstractPratice.incubationAbstract;

public class CompositonDemo {
    public static void main(String[] args) {
		Food f=new Rice(new Sambar(new Mutton(new chicken(new Prawn()))));
		System.out.println(f.cost());
		Food f2=new Prawn(new Mutton());
		System.out.println(f2.cost());
		Food f3=new Prawn();
		System.out.println(f3.cost());
	}
}
abstract class Food{
	public abstract int cost();
}
abstract class VegFood extends Food{
	
}
abstract class NonFood extends Food{
	
}
/*************************************/
class Rice extends VegFood{
	Food food;
	public Rice() {
	}
	public Rice(Food food) {
		this.food=food;
		
	}
	@Override
	public int cost() {
		if(food==null)
			return 10;
		else
		return 10+food.cost();
	}
}

class Sambar extends VegFood{
	Food food;
	public Sambar() {
	}
	public Sambar(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food==null)
			return 0;
		else
			return 0+food.cost();
	}
}
/*************************************/
class chicken extends NonFood{
	Food food;
	public chicken() {
	}
	public chicken(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
	  if(food==null)
		  return 50;
	  else
		return 50+food.cost();
	}
}
class Mutton extends NonFood{
	Food food;
	public Mutton() {
	}
	public Mutton(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food==null)
			return 80;
		else
		  return 80+food.cost();
	}
}
class Prawn extends NonFood{
	Food food;
	public Prawn() {
	}
	public Prawn(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
	    if(food==null)
	    	return 40;
		else
		return 40 + food.cost();
	}
}
