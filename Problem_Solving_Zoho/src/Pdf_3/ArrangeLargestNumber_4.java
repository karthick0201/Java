package Pdf_3;
import java.util.*;
public class ArrangeLargestNumber_4 {// COMPLETED!!!
/*---------------------------------------------------------------------------------------------------------
4) Given a list of non-negative integers nums, arrange them such that they form the largest number
and return it. Since the result may be very large, so you need to return a string instead of an
integer.

Input: nums = [10,2]

Output: "210"

Input: nums = [3,30,34,5,9]

Output: "9534330"
-----------------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			System.out.println("Enter N : ");
			int n = in.nextInt();
			
			String[] number = new String[n];
			System.out.println("Enter Elements : ");
			for(int i=0;i<n;i++) {
				number[i] = in.next();	
			}
			findLargestNumber(number,n);
			in.close();
		}
		
		public static void findLargestNumber(String A[],int n) {
			
			//THIS METHOD IS NOT WORKING :
			/*int AB=0;
			int BA=0;	
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					AB = (A[i]*10)+A[j];
					System.out.println(AB);
					BA = (A[j]*10)+A[i];
					System.out.println(AB); 
					if(AB<BA) {
						int temp=A[i];
						A[i]=A[j];
						A[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(A));
			*/
		    String sentence="";
//			System.out.println(str);
		  String ab = "";
		  String ba ="";
		  String temp;
		  for(int i=0;i<n;i++) {
			  for(int j=i+1;j<n;j++) {
				  ab = A[i] + A[j];
				  ba = A[j] + A[i];
				  if(Integer.parseInt(ab)<Integer.parseInt(ba)) {
					  temp = A[i];
					  A[i] = A[j];
					  A[j] = temp;
				  }
			  }
			  sentence =sentence + A[i];
		  }
		  System.out.println(sentence);
		}
	

	}


