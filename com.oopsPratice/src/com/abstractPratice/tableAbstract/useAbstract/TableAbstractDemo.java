package com.abstractPratice.tableAbstract.useAbstract;

abstract class TableAbstract {
	String metrial,shape,color;
	
	abstract void produce();
	abstract void tableSwitchOn();
	
}

class WoodTable extends TableAbstract {

	@Override
	void produce() {
		 System.out.println("This Table is created by using Hand!!!");
	}

	@Override
	void tableSwitchOn() {
		System.out.println("This table also has lights!!!");
	}
	
}
class SteelTable extends TableAbstract{
	@Override
	void produce() {
		 System.out.println("This Table is created by using Hand!!!");
	}

	@Override
	void tableSwitchOn() {
		System.out.println("This table also has lights!!!");
	}
}
class SpacialTable extends TableAbstract{
	@Override
	void produce() {
		 System.out.println("This Table is created by using Hand!!!");
	}

	@Override
	void tableSwitchOn() {
		System.out.println("This table also has lights!!! ");
		System.out.println("and Fan!!!");
	}
}

public class TableAbstractDemo{
	public static void main(String[] args) {
		TableAbstract woodTable=new WoodTable();
		TableAbstract spicalTable = new SpacialTable();
		System.out.println("Wood Table : \n------------");
		woodTable.produce();
		woodTable.tableSwitchOn();
		System.out.println("Special Table : \n------------");
		spicalTable.produce();
		spicalTable.tableSwitchOn();
		/*ADVANTAGES*//*
		1. IF WE ADD EXTRA FEACTUR, WE DIDNT TOUCH OLD CODE...
		2. EXTRENDS THAT CLASS AND WOTRE ON MY WILL.
		SO ITS has flexibility, maintablility
		
		*/
		
	}
}
