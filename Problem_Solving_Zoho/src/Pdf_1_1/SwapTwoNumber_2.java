package Pdf_1_1;

import java.util.Scanner;

public class SwapTwoNumber_2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter Number to Swap : ");
		int number = in.nextInt();
		System.out.println("Before Swap : " + number);
		int n2=0;
		while(number>0) {
			int temp=number%10;
			n2=(n2*10)+temp;
			number=number/10;
		}
		System.out.println("After Swap : " + n2);
		

	}

}
