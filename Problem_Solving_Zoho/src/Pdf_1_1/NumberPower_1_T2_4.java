package Pdf_1_1;

import java.util.Scanner;

public class NumberPower_1_T2_4 {
/*--------------------------------------------------------------------------------------------------------
 * TASK 2 :
 * NUMBER 4 : 
 * 		Two numbers are entered through the keyboard. Write a program to find
		the value of one number raised to the power of another. (Do not use Java builtin method).

*---------------------------------------------------------------------------------------------------------*/
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1 = in.nextInt();
		System.out.println("Enter N2 : ");
		int n2 = in.nextInt();
		int ans=1;
		//ALGORITHM
		for(int i=0;i<n2;i++) {
			ans=ans*n1;
		}
		System.out.println("Ans : " + ans);
	}
}
