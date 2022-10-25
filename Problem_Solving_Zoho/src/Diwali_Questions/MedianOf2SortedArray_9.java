package Diwali_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

	/*9. Given two sorted arrays array1 and array2 of size m and n
	respectively. Find the median of the two sorted arrays.
	Input:
	m = 3, n = 4
	array1[] = {1,5,9}
	array2[] = {2,3,6,7}
	Output: 5
	Explanation: The middle element for {1,2,3,5,6,7,9} is 5
	Input:
	m = 2, n = 4
	array1[] = {4,6}
	array2[] = {1,2,3,5}
	Output: 3.5
	Your Task: The task is to complete the function MedianOfArrays() that
	takes array1 and array2 as input and returns their median.
	Can you solve the problem in expected time complexity?
	Expected Time Complexity: O(min(log n, log m)).
	Expected Auxiliary Space: O((n+m)/2).
	Constraints:
	0 ≤ m,n ≤ 104
	1 ≤ array1[i], array2[i] ≤ 105*/
public class MedianOf2SortedArray_9 { // COMPLETED BUT DO IT IN ARRAY

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1 = in.nextInt();
		System.out.println("Enter N2 : ");
		int n2 = in.nextInt();
		int A[] = new int[n1];
		int B[] = new int[n2];

		System.out.println("Enter N1 Elements : ");

		for (int i = 0; i < n1; i++) {
			A[i] = in.nextInt();
		}
		System.out.println("Enter N2 Elements : ");

		for (int i = 0; i < n2; i++) {
			B[i] = in.nextInt();
		}

		mergeArray(A, B, n1, n2);

	}

	private static void mergeArray(int[] A, int[] B, int n1, int n2) {

		ArrayList<Integer> C = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (A[i] == B[j]) {
				if (C.contains(A[i])==false) {
					C.add(A[i]);
				}
				i++;
				j++;
			} else if (A[i] < B[j]) {
				if (C.contains(A[i])==false) {
					C.add(A[i]);
				}
				i++;
			} else if (A[i] > B[j]) {
				if (C.contains(B[j])==false) {
					C.add(B[j]);
				}
				j++;
			}
		}
		while (i < n1) {
			if (C.contains(A[i])==false) {
				C.add(A[i]);
			}
			i++;
		}
		while (j < n2) {
			if (C.contains(B[j])==false) {
				C.add(B[j]);
			}
			j++;
		}
		
		printMedian(C);

	}

	private static void printMedian(ArrayList<Integer> c) {
		if(c.size()%2==1) {
			System.out.println("Median : " + c.get(c.size()/2));
		}else {
			double n1=c.get(c.size()/2);
			double n2=c.get((c.size()/2)-1);
			double median=(n1+n2)/2;
			System.out.println("Median : " + median);
		}
		
	}

	/* 1 2 3 4 5 6
	 * private static void mergeArray(int[] A, int[] B, int n1, int n2) {
	 * 
	 * int C[]=new int[n1+n2];
	 * 
	 * 
	 * int i=0,j=0,k=-1;
	 * 
	 * while(i<n1 && j<n2) { if(A[i]==B[j]) { if(C[k]!=A[i]) { C[++k]=A[i]; }
	 * i++;j++; } else if(A[i]<B[j]) { if(C[k]!=A[i]) { C[++k]=A[i]; } i++; } else
	 * if(A[i]>B[j]) { if(C[k]!=B[j]) { C[++k]=B[j]; } j++; } } while(i<n1) {
	 * if(C[k]!=A[i]) { C[++k]=A[i]; } i++; } while(j<n2) { if(C[k]!=B[j]) {
	 * C[++k]=B[j]; } j++; }
	 * 
	 * for(int p=0;p<n1+n2;p++) { System.out.print(C[p] + " "); }
	 * 
	 * 
	 * }
	 */

}
