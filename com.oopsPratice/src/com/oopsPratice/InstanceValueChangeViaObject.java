package com.oopsPratice;

/*	CONCULSION -> WE CANT CHANGE VALUE: 
 * --------------------------------
 * If we try change datamember via object only change in particular object value will change...
 * Real class value didnt change...
 * 
 * 
 * */
class ValueChange {
	 int number=30;
	void spellNum() {
		System.out.println("Spell Number!!!");
		System.out.println("Number : " + number);
	}
}
public class InstanceValueChangeViaObject{
	public static void main(String[] args) {
		ValueChange vc=new ValueChange(); //1
		System.out.println("Before CHage(vc) : " + vc.number);
		vc.number=10;
		vc.spellNum();
		ValueChange vc2=new ValueChange();
		System.out.println("After CHage(vc2) : " + vc2.number);
		vc2.spellNum(); 
	}
}

