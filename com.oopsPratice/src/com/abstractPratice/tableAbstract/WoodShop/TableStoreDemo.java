package com.abstractPratice.tableAbstract.WoodShop;

public class TableStoreDemo {
	public static void main(String[] args) {
		TableFurnitureStore karthi=new WoodTable();
		System.out.println(karthi.yourCart());
		TableFurnitureStore fan=new SteelTable();
		System.out.println(fan.yourCart());
		
		TableFurnitureStore nobita=new WoodTable(new Doremon());
		System.out.println(nobita.yourCart());
		
		
		
		
		
	}

}
abstract class TableFurnitureStore{
	
	abstract String yourCart();
	
	
}
/*********************************************************/
abstract class Toys extends TableFurnitureStore{
	
}
class Doremon extends Toys{
	private final String toyName="Doremon";
	TableFurnitureStore tfs;
	public Doremon() {
	}
	public Doremon(TableFurnitureStore tfs) {
		this.tfs=tfs;
	}
	String getToyName() {
		
		return toyName;
	}

	@Override
	String yourCart() {
		if(tfs==null) {
			return getToyName();
		}else {
		return getToyName() + " \n" + tfs.yourCart();	
		}
	}
	
}


/*********************************************************/
abstract class Table extends TableFurnitureStore{
	abstract String createTable();
	abstract String tableHasLights();
	
}
class WoodTable extends Table{
	TableFurnitureStore tfs;
	public WoodTable() {
	}
	public WoodTable(TableFurnitureStore tfs) {
		this.tfs=tfs;
	}
	@Override
	String createTable() {
		String a ="Wood Table";
		a = a +" "+ tableHasLights();
		return a;
	}
	@Override
	String tableHasLights() {
		String l="with White light";
		return l;
	}
	
	@Override
	String yourCart() {
		
		if(tfs==null) {
			return createTable();
		}else {
		return createTable() + " \n" + tfs.yourCart();	
		}
	}
	
}
class SteelTable extends Table{
	TableFurnitureStore tfs;
	public SteelTable() {
	}
	public SteelTable(TableFurnitureStore tfs) {
		this.tfs=tfs;
	}
	@Override
	String tableHasLights() {
		String l="with Red light";
		return l;
	}
	@Override
	String createTable() {
		String a ="Steel Table";
		a = a +" "+ tableHasLights();
		return a;
	}
	@Override
	String yourCart() {
		
		if(tfs==null) {
			return createTable();
		}else {
		return createTable() + " \n" + tfs.yourCart();	
		}
		
	}
	
	
	
}


