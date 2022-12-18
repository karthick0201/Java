package com.abstractPratice.tableAbstract.woodShopTwo;

public class CalculateAmount {
	public static void main(String[] args) {
		TableFurnitureStore karthi=new WoodTable();
		
		
	}

}
abstract class TableFurnitureStore{
	abstract void checkOut();
}
abstract class DecorationToys extends TableFurnitureStore{
	
}
abstract class Toys extends DecorationToys{
	
	
}
class Doremon extends Toys{
	
	void getDoremonToy() {
		System.out.println(" Doremon toy...");
	}

	

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		
	}
	
}

/*********************************************************/
abstract class Table extends TableFurnitureStore{
	abstract void tableHasLights();
}
class WoodTable extends Table{

	void checkOut() {
		System.out.println("Wood Table created!!!");
		tableHasLights();
	}
	@Override
	void tableHasLights() {
		// TODO Auto-generated method stub
		System.out.println("Wood Table has lights too...");
		
	}
	
}
class SteelTable extends Table{

	
	@Override
	void tableHasLights() {
		System.out.println("Wood Table has lights too...");
		
	}
	void checkOut() {
		System.out.println("Steel Table created!!!");
		tableHasLights();
	}
	
}


