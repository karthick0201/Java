package Diwali_Questions;

import java.util.Scanner;

public class MaximumSum_Adjacent_8 {

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

		findMaximumSum(A, n);

	}

	private static void findMaximumSum(int[] A, int n) {

		int k = 2, k2;
		int sum;
		int maxSum = 0; // or Integer.MIN_VALUE
		for (int i = 0; i < n; i++) {
			k2 = i + k;
			while (k2 < n) {
				sum = A[i];
				if (maxSum < sum) {
					maxSum = sum;
				}

				for (int j = k2; j < n; j = j + k) {
					sum += A[j];
					if (maxSum < sum) {
						maxSum = sum;
					}
				}
				k2++;
			}
		}
		System.out.println("OutPUt: " + maxSum);

	}

}
