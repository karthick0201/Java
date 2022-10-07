package MethodsProblems_4;

public class HolidayCheck {

	public static void main(String[] args) {
		
		Holiday h1=new Holiday("Ayudha Puja",4,"July");
		Holiday h2=new Holiday("Diwali",4,"July");
		Holiday h3=new Holiday("Maha Navami",4,"October");
		Holiday h4=new Holiday("Thiruvalluvar",15,"January");
		Holiday h5=new Holiday("Maha Navami",6,"July");
		Holiday h6=new Holiday("Bday",19,"July");
		Holiday h7=new Holiday("Ashura",9,"August");
		Holiday h8=new Holiday("Christmas",25,"December");
		Holiday h9=new Holiday("Good Friday",15,"April");
		
		boolean check=h1.inSameMonth(h3);
		System.out.println("Same Month : " + check);

		
		//Holiday[] HolidayPack = {h1,h2,h3,h4,h5,h6,h7,h8,h9};
		Holiday[] HolidayPack = {h1,h2,h3};
		double averageDate = Holiday.avgDate(HolidayPack);
		System.out.println("Average Date : " + averageDate);
		
	}

}
