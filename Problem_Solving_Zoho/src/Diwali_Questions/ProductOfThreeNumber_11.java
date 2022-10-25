package Diwali_Questions;

import java.util.Scanner;
	
	/*11.The hiring team aims to find 3 candidates who are great collectively.
	Each candidate has his or her ability expressed as an integer. 3
	candidates are great collectively if product of their abilities is
	maximum. Given abilities of N candidates in an array arr[], find the
	maximum collective ability from the given pool of candidates.
	Input:
	N = 5
	Arr[] = {10, 3, 5, 6, 20}
	Output: 1200
	Explanation:
	Multiplication of 10, 6 and 20 is 1200.
	Input:
	N = 5
	Arr[] = {-10, -3, -5, -6, -20}
	Output: -90
	Explanation:
	Multiplication of -3, -5 and -6 is -90.
	Your Task:
	You don't need to read input or print anything. Your task is to complete
	the function maxProduct() which takes the array of integers arr[] and n
	NibilaAmutha                                                         L2 Task  
	as input parameters and returns the maximum product.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	Constraints:
	3 ≤ N ≤ 107
	-105 ≤ Arr[i] ≤ 105*/
public class ProductOfThreeNumber_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// INPUT:
		System.out.println("ENter n Value: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");

		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		int result=findProductOfThreeNumber(A,n);
		System.out.println("Ability Level : " + result);
	}

	private static int findProductOfThreeNumber(int[] A, int n) {
		int flag=0;
		int x,y,z;
		int product;
		int maxProduct=A[0] * A[1] * A[2];;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					product=A[i] * A[j] * A[k];
					if(maxProduct<product) {
						maxProduct=product;
					}
				}
			}
		}
		return maxProduct;
	}

}
