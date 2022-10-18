package Pdf_1_2;

import java.util.Scanner;

public class NegativeIntAtEnd_4 {
/*------------------------------------------------------------------------------------------------------------------------
4) Given an unsorted array arr[] of size N having both negative and positive
integers. The task is place all negative element at the end of array without
changing the order of positive element and negative element.

Example 1:

Input :
N = 8
A[] = {1, -1, 3, 2, -7, -5, 11, 6 }

Output :
1  3  2  11  6  -1  -7  -5

Example 2:

Input :
N=8
A[] = {-5, 7, -3, -4, 9, 10, -1, 11}

Output :
7  9  10  11  -5  -3  -4  -1 
-----------------------------------------------------------------------------------------------------------------------------------*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       System.out.println("Enter N value : ");
	       int n = in.nextInt();
	       int A[] = new int[n];
	       int t=-1;
	       for(int i=0;i<n;i++)
	       {
	    	   A[i]=in.nextInt();
	       }
	       for(int i=0;i<n;i++)
	       {
	    	   if(A[i]>=0)
	    	   {
	    		   t++;
	    		  for(int j=i;j>t;j--)
	    		  {
	    			  int temp = A[j];
	    			  A[j]=A[j-1];
	    			  A[j-1]=temp;
	    		  }
	    	   }
	       }
	       for(int i=0;i<n;i++)
	       {
	    	  System.out.print(A[i]+ " ");
	       }

	}
	
	   
}
