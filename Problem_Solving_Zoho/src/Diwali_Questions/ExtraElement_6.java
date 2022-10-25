package Diwali_Questions;

import java.util.Scanner;



/*	6.Given two sorted arrays of distinct elements. There is only 1
	difference between the arrays. First array has one element extra added in
	between. Find the index of the extra element.
	Input:
	N = 7
	A[] = {2,4,6,8,9,10,12}
	B[] = {2,4,6,8,10,12}
	Output: 4
	Explanation: In the second array, 9 is missing and it's index in the
	first array is 4.
	Input:
	N = 6
	A[] = {3,5,7,9,11,13}
	B[] = {3,5,7,11,13}
	NibilaAmutha                                                         L2 Task  
	Output: 3
	Your Task: You don't have to take any input. Just complete the provided
	function findExtra() that takes array A[], B[] and size of A[] and return
	the valid index (0 based indexing).
	Expected Time Complexity: O(log N).
	Expected Auxiliary Space: O(1).
	Constraints:
	2<=N<=10^4
	1<=Ai<=10^5*/


public class ExtraElement_6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1=in.nextInt();
		System.out.println("Enter N2 : ");
		int n2=in.nextInt();
		int A[] = new int[n1];
		int B[] = new int[n2];
		
		System.out.println("Enter N1 Elements : ");
		
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter N2 Elements : ");
		
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
		}
		
		findExtraElement(A,B,n1,n2);

	}

	private static void findExtraElement(int[] A, int[] B, int n1, int n2) {
		
		int flag=0;
		int i=0,j=0;
		while(i<n1 && j<n2) {
			if(A[i]==B[j]) {
				i++;
				j++;
			}
			else {
				print(A[i],i);
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			print(A[n1-1],(n1-1));
		}
		
	}

	private static void print(int value, int index) {
		
		System.out.println("In the second array, \""+ value +"\" is missing and it's index in the first array is \""+ index  + "\"");
		
	}

}
