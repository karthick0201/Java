package Pdf_2;

import java.util.Scanner;

public class SumTwoArray_9 {

	public static void main(String[] args) {
		/*
		----------------------------------------------------------------------------------------------
		9. Given 2 huge numbers as separate digits, store them in array and process them and calculate
		the sum of 2 numbers and store the result in an array and print the sum.

		Input: Number of digits:12

		Input-1 : 9 2 8 1 3 5 6 7 3 1 1 6

		Number of digits:9

		Input-2  : 7 8 4 6 2 1 9 9 7
		-------------------------------------------- 
		Output :  9 2 8 9 2 0 2 9 5 1 1 3
		----------------------------------------------------------------------------------------------
				 * */
		Scanner in=new Scanner(System.in);
		
		//INPUT 
		System.out.print("Enter N1 : ");
		int n1=in.nextInt();
		int A[] = new int[n1];
		
		System.out.println("Enter  " + n1 +"  Value : ");
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
		}
		
		System.out.print("Enter N2 : ");
		int n2=in.nextInt();
		int B[] = new int[n2];
		System.out.println("Enter  " + n2 +"  Value : ");
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
		}
	//ALGOIRTHM:
		//ARRAY TO INT --> A[] --> 'a'
		int a=0,b=0;
		for(int i=0;i<n1;i++) {
			a=(a*10)+A[i];
		}
		//ARRAY TO INT --> B[] --> 'b'
		for(int i=0;i<n2;i++) {
			b=(b*10)+B[i];
		}
		//SUM a + b:
		int sum= a+b;
		//find sum count : 
		int s=sum,count=0;
		while(s>0) {
			count++;
			s=s/10;
		}
		//CREATE NEW ARRAY:
		
		int C[]=new int[count];
		
		for(int i=count-1;i>=0;i--) {
			int temp=sum%10;
			C[i]=temp;
			sum=sum/10;
		}
		
		//PRINT STATEMENT:
		for(int i=0;i<count;i++) {
			System.out.print(C[i] + " ");
		}
		
				

	}

}
