package Diwali_Questions;

import java.util.Arrays;
import java.util.Scanner;


/*2. Given a sorted array arr[] of distinct integers. Sort the array into
a wave-like array(In Place). In other words, arrange the elements into a
sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexico graphically smallest
one.
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after sorting it in wave form are 2 1 4 3 5.
Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after sorting it in wave form are 4 2 8 7 10
9.
Your Task:
The task is to complete the function convertToWave(), which converts the
given array to a wave array.
NOTE: The given array is sorted in ascending order, and you don't need
to return anything to make changes in the original array itself.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ n ≤ 10^6 0 ≤ arr[i] ≤10^7
 * 
 */
public class Wave_2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		//INPUT:
		System.out.println("ENter n Value: ");
		int n=in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		
		//ALGORITHM
		
		for(int i=0,j=i+1;j<n;i=i+2,j=j+2) {
			int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
		}
		System.out.println(Arrays.toString(A));

	}

}
