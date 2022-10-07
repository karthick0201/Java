package MethodsProblems_4;

import java.util.Scanner;

public class SmallestNum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Number 1 : ");
		a=in.nextInt();
		System.out.println("Enter Number 2 : ");
		b=in.nextInt();
		System.out.println("Enter Number 3 : ");
		c=in.nextInt();
		
		int smallest = findSmallestNumber(a,b,c);
		System.out.println("Smallest Number : " + smallest);
	}

	private static int findSmallestNumber(int a, int b, int c) {
		int min = 0;
		if(a<b) {
			if(a<c) {
				min=a;
			}
		}
		else {
			if(b<c) {
				min=b;
			}
			else {
				min=c;
			}
		}
		return min;
			
	}

}
