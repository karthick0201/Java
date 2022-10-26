package Diwali_Questions;

import java.util.Scanner;

public class FindMissingNumber_15 { // Math Formula Sum

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// INPUT::
		System.out.println("ENter n Value: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");
		int elementSum=0;
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
			elementSum += A[i];
		}
		
		int missingNumber = findMissingNumber(n,elementSum);
		System.out.println("Missing Number : " + missingNumber);

	}

	private static int findMissingNumber(int n, int elementSum) {
		
		/* 
		 * n sum = n*(n+1)/2;
		 */
		int totalSum=n*(n+1)/2;
		
		return totalSum-elementSum;
	}

}
