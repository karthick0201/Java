package com.abstractPratice.tableAbstract.useClass;

public class TableClassDemo {

	public static void main(String[] args) {
		String metrial="wood", shape="circle", color="white";
		
		TableClass woodTable=new TableClass(metrial, shape, color);
		TableClass steelTable=new TableClass("steel", "rect", "red");
		TableClass plasticTable=new TableClass("plastic", "square", "green");
		
		woodTable.tableSwitchOn();
		steelTable.tableSwitchOn();
		plasticTable.tableSwitchOn();
		/*
		 * SPECIAL TABLE:
		 * --> In this spacial table, we trun on swich, 1. lights on + fan run...
		 * */
		TableClass spacialTable=new TableClass("steel", "rect", "red");
		spacialTable.tableSwitchOn();
		/*OutPut Will be : 
		 * This table also has lights!!!
		 * 
		 * output is wrong... becuase special table , will do one more extra feacture, we create object like this, it was a problem
		 * thats why we use abstract method.... 
		 * 
		 * 
		 * */
		/****DISADVANTAGES*****/
		/*
		New feature or something add pandrom naa, 
		code change pandra mathi irukum..
		'OO' main concept aayee compile code change pannakoodathu,
		old code ku problem illama, new create pannailam, athukaga thaa namma ipdi use pandrom
		
		--> flexbility
		--> 
		
		*/
	}

}
