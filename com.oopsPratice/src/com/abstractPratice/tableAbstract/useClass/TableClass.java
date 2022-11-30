package com.abstractPratice.tableAbstract.useClass;

public class TableClass {
	String metrial, shape, color;

	 public TableClass(String metrial, String shape, String color) {
		 this.metrial=metrial;
		 this.shape=shape;
		 this.color=color;
	 }

	void produce() {
		 System.out.println("This Table is created by using Hand!!!");
	 }

	 void tableSwitchOn() {
		 System.out.println("This table also has lights!!!");
	 }
}
