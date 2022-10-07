package Pdf_1_1;

import java.util.Scanner;

public class ReadsFloatingPointNum_1_T2_2 {

/*-------------------------------------------------------------------------------------------------------------------
	2(L2).Write a Java program that reads a floating-point number and prints
	
	"zero" if the number is zero. Otherwise, print "positive" or "negative". 
	Add "small" if the absolute value of the number is less than 1, or "large" if it
	exceeds 1,000,000.
 ------------------------------------------------------------------------------------------------------------------- */
	static double psv(double a) {
		return -a;
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input value: ");
	        double val = in.nextDouble();

	        if (val>0)
	        {
	            if (val < 1)
	            {
	                System.out.println("Positive small");
	            }
	            else if (val > 1000000)
	            {
	                System.out.println("Positive large");
	            }
	            else
	            {
	                System.out.println("Positive");
	            }
	        }
	        else if (val < 0)
	        {
	            if (Math.abs(val) < 1)
	            {
	                System.out.println("Negative small");
	            }
	            else if (psv(val) > 1000000)
	            {
	                System.out.println("Negative large");
	            }
	            else
	            {
	                System.out.println("Negative");
	            }
	        }
	        else
	        {
	            System.out.println("Zero");
	        }

	}
}
