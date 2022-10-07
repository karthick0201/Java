package MethodsProblems_4;

import java.util.Scanner;

public class Interest_5 {

/*-------------------------------------------------------------------------------------------------------------------
5. Write a Java method to compute the future investment value at a given interest rate for a
specified number of years.

 Sample data (Monthly compounded) and Output:
 Input the investment amount: 1000
 Input the rate of interest: 10
 Input number of years: 5

			Expected Output:
			
			Years FutureValue
			
			1 1104.71
			2 1220.39
			3 1348.18
			4 1489.35
			5 1645.31
-------------------------------------------------------------------------------------------------------------------------*/
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//float amount=1000;
		//float interest=10;
		float amount=in.nextFloat();
		float interest=in.nextFloat();
		double year=5;
		
		findInterest(amount,interest,year);


	}

	private static void findInterest(double amount, double interest, double year) {
		
		for(int i=1;i<=year;i++) {
			amount=amount+(amount*interest)/100;
			
			
			double result;
			float x ;
			x = (float) Math.pow((1+(interest/1200)), 12*i);
			result = amount * x;

			
			System.out.println("Year : " + i+1 + " Salary : " + amount);
		}
		
	}


	
}
