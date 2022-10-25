package Diwali_Questions;

import java.util.Scanner;


	/*5. Given an array containing N integers and an integer K., Your task is
	to find the length of the longest Sub-Array with the sum of the elements
	equal to the given value K.
	Input :
	A[] = {10, 5, 2, 7, 1, 9}
	K = 15
	Output : 4
	Explanation: The sub-array is {5, 2, 7, 1}.
	Input :
	A[] = {-1, 2, 3}
	K = 6
	Output : 0
	Explanation: There is no such sub-array with sum 6.
	Your Task:
	This is a function problem. The input is already taken care of by the
	driver code. You only need to complete the function lenOfLongSubarr()
	that takes an array (A), sizeOfArray (n), sum (K)and returns the
	required length of the longest Sub-Array. The driver code takes care of
	the printing.
	Expected Time Complexity: O(N).
	Expected Auxiliary Space: O(N).
	Constraints:
	1<=N<=10^5
	-105<=A[i], K<=10^5
*/
public class LengthOfLongestSubArray_5 {

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
		System.out.println("Enter K value: "); 
		int k=in.nextInt();
		//ALGORITHM

		int sum;
		int count;
		int maxCount=0;
		for(int i=0;i<n;i++) {
			sum=A[i];
			//FOR SINGLE VALUE CONDITION
			if(sum==k) {
				count=1;
				if(maxCount<count) {
					maxCount=count;
				}
			}
			for(int j=i+1;j<n;j++) {
				
				sum += A[j];
				if(sum==k) {
					count=j-i+1;
					if(maxCount<count) {
						maxCount=count;
					}
				}
			}
			
		}
		System.out.println("Length of The sub-array COunt : " + maxCount);
	}

}
