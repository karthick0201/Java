package Diwali_Questions;

import java.util.Scanner;

	/*7. Given an array of distinct elements. Find the third largest element
	in it. Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be
	5 because it is the 3 largest element in the array A.
	Input:
	N = 5
	A[] = {2,4,1,3,5}
	Output: 3
	Input:
	N = 2
	A[] = {10,2}
	Output: -1
	Your Task: Complete the function thirdLargest() which takes the array
	a[] and the size of the array, n, as input parameters and returns the
	third largest element in the array. It return -1 if there are less than
	3 elements in the given array.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	Constraints:
	1 ≤ N ≤ 10^5
	1 ≤ A[i] ≤ 10^5*/

public class ThirdLargest_7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT:
		System.out.println("ENter n Value: ");
		int n=in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Elements : ");
		int min= Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
			if(min>A[i]) {
				min=A[i];
			}
		}
		int k=3;
		//Min-1 is for a common value
		findKLargest(A,n,k,min-1);
		
		

	}

	private static void findKLargest(int[] A, int n, int k, int cv) {
		
		int max;
		int max2=0;
		int index=0;
		while(k>0) {
			max=0;
			for(int i=0;i<n;i++) {
				if(max<A[i]) {
					max=A[i];
					index=i;
				}
			}
			max2=max;
			A[index]=cv;
			k--;
			
		}
		System.out.println("Third Largest Value is : " + max2);
		
	}

}
