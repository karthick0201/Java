package Diwali_Questions;

import java.util.Arrays;
import java.util.Scanner;


	/*4. Union of two arrays can be defined as the common and distinct elements
	in the two arrays. Given two sorted arrays of size n and m respectively,
	find their union.
	Input:
	n = 5, arr1[] = {1, 2, 3, 4, 5}
	m = 3, arr2 [] = {1, 2, 3}
	Output: 1 2 3 4 5
	Explanation:Distinct elements including both the arrays are:1 2 3 4 5
	Input:
	n = 5, arr1[] = {2, 2, 3, 4, 5}
	m = 5, arr2[] = {1, 1, 2, 3, 4}
	Output: 1 2 3 4 5
	Explanation:Distinct elements including both the arrays are: 1 2 3 4 5
	Input:
	n = 5, arr1[] = {1, 1, 1, 1, 1}
	m = 5, arr2[] = {2, 2, 2, 2, 2}
	Output: 1 2
	Explanation: Distinct elements including both the arrays are: 1 2.
	Your Task:
	You do not need to read input or print anything. Complete the function
	findUnion() that takes two arrays arr1[], arr2[], and their size n and m
	as input parameters and returns a list containing the union of the two
	arrays.
	Expected Time Complexity: O(n+m).
	Expected Auxiliary Space: O(n+m).
	Constraints:
	1 <= n, m <= 10^5
	1 <= arr[i], brr[i] <= 10^6
	*/
public class UnionOfTwoArraysM2_4 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1=in.nextInt();
		System.out.println("Enter N2 : ");
		int n2=in.nextInt();
		int A[] = new int[n1];
		int B[] = new int[n2];
		//int C[] = new int[n1+n2];
		
		System.out.println("Enter N1 Elements : ");
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
			if(max<A[i]) {
				max=A[i];
			}
			if(min>A[i]) {
				min=A[i];
			}
		}
		System.out.println("Enter N2 Elements : ");
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
			if(max<B[i]) {
				max=B[i];
			}
			if(min>B[i]) {
				min=B[i];
			}
		}
		
		//ALGORITHM:
		//1.
		//2. 
		int y=-min;
		int C[] = new int[n1+n2+y+1];
		//3.
		//4. hP
		
		for(int i=0;i<n1;i++) {
			C[A[i]+y]++;
		}
		
		for(int i=0;i<n2;i++) {
			C[B[i]+y]++;
		}
		
		
		//5. 
		
		for(int i=0;i<max+y+1;i++) {
			if(C[i]!=0) {
				System.out.print(i-y + " ");
			}
		}

	}

}

/*WHAT MISTAKES I DO:
 * 
 * Careless mistakes
 * Dont do it.
 * new array creation
 * C array n value set 
 * */
