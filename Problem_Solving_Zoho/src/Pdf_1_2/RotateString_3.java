package Pdf_1_2;

import java.util.Scanner;

public class RotateString_3 {

	public static void main(String[] args) {
/*-------------------------------------------------------------------------------------------------------------------------
3) Given two strings a and b. The task is to find if the string 'b' can be obtained
by rotating another string 'a' by exactly 2 places.
Example 1:
Input:
a = amazon
b = azonam

Output: 1

Example 2:  
Input:
a = geeksforgeeks
b = geeksgeeksfor

Output: 0

           Input :   a m a z o n
		  			 n a m a z o
		   Output :  o n a m a z
		   
-----------------------------------------------------------------------------------------------------------------------------*/
		
/*---------------------------------------------------------------------------------------------------------------------------*/
		Scanner in=new Scanner(System.in);
		
		int k=2;
		System.out.print("Enter String 1  : ");
		String Sen1=in.next();
		//String Sen1="mani";
		System.out.print("Enter String 2  :  ");
		String Sen2=in.next();
		//String Sen2="nima";
		char A[]=Sen1.toCharArray();
		int n=A.length;
		
		while(k>0) {
			//System.out.println(Arrays.toString(A));
			char temp=A[0];
			for(int i=0;i<n-1;i++) {
				A[i]=A[i+1];
			}
			A[n-1]=temp;
			k--;
		}
		//Checking
		//---------------------
		char B[]=Sen2.toCharArray();
		int n2=B.length;
		int flag=0;
		for(int i=0;i<n;i++) {
			if(A[i]!=B[i]) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}
/*-----------------TYPE - 2 ------------------------------------------------------------------------------------		
		Scanner in=new Scanner(System.in);
		
		int k=2;
		System.out.print("Enter String 1  : ");
		String Sen1=in.next();
		//String Sen1="mani";
		System.out.print("Enter String 2  :  ");
		String Sen2=in.next();
		//String Sen2="nima";
		char A[]=Sen1.toCharArray();
		int n=A.length;
		
		while(k>0) {
			//System.out.println(Arrays.toString(A));
			char temp=A[n-1];
			for(int i=n-1;i>0;i--) {
				A[i]=A[i-1];
			}
			A[0]=temp;
			k--;
			//System.out.println(Arrays.toString(A));
		}
		//System.out.println(Arrays.toString(A));
		String Sen3=String.valueOf(A);
		//System.out.println("Check sen3 : " + Sen3);
		//System.out.println("Check  sen 2: " + Sen2);
		//Checking
		
		
		if(Sen3.equals(Sen2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
-------------------------------------------------------------------------------------------------------*/
	}

}
