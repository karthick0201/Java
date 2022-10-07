package Pdf_1_1;

import java.util.Scanner;

public class OddNaturalSum_1_T2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*-------------------------------------------------------------------------------------------------------------------
 3(L1).Write a program in Java to display the n terms of odd natural number
and their sum.

Input number of terms is: 5

Expected Output :

The odd numbers are :
1
3
5
7
9

The Sum of odd Natural Number up to 5 terms is: 25
 ------------------------------------------------------------------------------------------------------------------- */
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Count : " );
		int count=in.nextInt();
		int Num=1;
		//ALGORITHM:
		for(int i=1;i<=count;i++,Num+=2) {
			System.out.println(Num);
		}
	}

}
