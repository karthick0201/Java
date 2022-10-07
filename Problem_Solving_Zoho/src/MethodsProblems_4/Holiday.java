package MethodsProblems_4;

public class Holiday {
	private String name;
	private int day;
	private String month;
	
	Holiday(String name,int day,String month){
		this.name=name;
		this.day=day;
		this.month=month;
	}
	
	public boolean inSameMonth(Holiday a) {
		
		return a.month.equals(month);
		
	}
	public static double avgDate(Holiday[] hd) {
		int sum=0;  int n=hd.length;
		
		for(Holiday A:hd) {
			sum += A.day;
		}
		double average = sum/n;
		return average;
		
	}
//
//	public static double avgDate(Holiday[] holidayPack) {
//		// TODO Auto-generated method stub
//		return 5;
//	}
}
