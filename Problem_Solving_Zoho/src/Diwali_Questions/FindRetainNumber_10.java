package Diwali_Questions;

import java.util.Scanner;

	/*10. Given two arrays A and B contains integers of size N and M, the task
	is to find numbers which are present in the first array, but not present
	in the second array.
	Input: N = 6, M = 5
	A[] = {1, 2, 3, 4, 5, 10}
	B[] = {2, 3, 1, 0, 5}
	Output: 4 10
	NibilaAmutha                                                         L2 Task  
	Explanation: 4 and 10 are present in first array, but not in second
	array.
	Input: N = 5, M = 5
	A[] = {4, 3, 5, 9, 11}
	B[] = {4, 9, 3, 11, 10}
	Output: 5
	Explanation: Second array does not contain element 5.
	Your Task: This is a function problem. You don't need to take any input,
	as it is already accomplished by the driver code. You just need to
	complete the function findMissing() that takes array A, array B, integer
	N, and integer M as parameters and returns an array that contains the
	missing elements and the order of the elements should be the same as
	they are in array A.
	Expected Time Complexity: O(N+M).
	Expected Auxiliary Space: O(M).
	Constraints:
	1 ≤ N, M ≤ 106
	-106 ≤ A[i], B[i] ≤ 106*/
public class FindRetainNumber_10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1=in.nextInt();
		System.out.println("Enter N2 : ");
		int n2=in.nextInt();
		int A[] = new int[n1];
		int B[] = new int[n2];
		
		System.out.println("Enter N1 Elements : ");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
			if(max<A[i]) {
				max=A[i];
			}
		}
		System.out.println("Enter N2 Elements : ");
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
			if(max<B[i]) {
				max=B[i];
			}
		}
		int cv=max+1;
		
		findRetanNumber(A,B,n1,n2,cv);

	}

	private static void findRetanNumber(int[] A, int[] B, int n1, int n2, int cv) {
		
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n1;j++) {
				if(B[i]==A[j]) {
					A[j]=cv;
				}
			}
		}
		
		print(A,n1,cv);
		
	}

	private static void print(int[] A, int n1, int cv) {
		for(int i=0;i<n1;i++) {
			if(A[i]!=cv) {
				System.out.print(A[i] + " ");
			}
		}
		
	}

}
