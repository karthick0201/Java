package Pdf_2;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum_4 {

	public static void main(String[] args) {
		/*
----------------------------------------------------------------------------------------------
4.Given an array A[] and a number x, check for pair in A[] with sum as x.

Input {1, 2, 4, 3, 5, 6}

SUM : 5 

Output : 2 (1, 4) & (2, 3)
----------------------------------------------------------------------------------------------
		 * */
		Scanner in=new Scanner(System.in);
		
		//ALGORITHM	
		System.out.println("Enter N : "); 
		int n=in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Values");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter K value : ");
		int key=in.nextInt();
		
		  //FIND MAX
		int max=A[0];
		for(int i=1;i<n;i++) {
			if(max<A[i]) {
				max=A[i];
			}
		}
		//COMMON VALUE: 
		int cv=max+1;
		//REMOVE DUPLICATE :
		for(int i=0;i<n;i++) {
			if(A[i]!=cv) {
				for(int j=i+1;j<n;j++) {
					if(A[i]==A[j]) {
						A[j]=cv;
					}		
				}
			}
		}
		//SUM OF PAIR
		int pairCount=0;
		for(int i=0;i<n;i++) {
			if(A[i]!=cv) {
				for(int j=i+1;j<n;j++) {
				if(A[j]!=cv) {
					if((A[i]+A[j])==key) {
						pairCount++;
						System.out.println("( " + A[i] + ',' + A[j] + " ) ,");
					}
				}
				}				
			}
		}
		System.out.print("Total Count : " + pairCount);
		//System.out.println(Arrays.toString(A));
		

	}

}
