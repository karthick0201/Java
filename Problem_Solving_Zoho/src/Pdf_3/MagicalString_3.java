package Pdf_3;

import java.util.Arrays;
import java.util.Scanner;

public class MagicalString_3 { //COMPLETED
	/*---------------------------------------------------------------------------------------------------------
3) A magical string s consists of only '1' and '2' and obeys the following rules:
● The string s is magical because concatenating the number of contiguous occurrences of
characters '1' and '2' generates the string s itself.

The first few elements of s is s = "122112  1221221121122……". If we group the consecutive 1's
and 2's in s, it will be     "1 22 11 2 1 22 1 22 11 2 11 22 ......" and the occurrences of
1's or 2's in each group are "1  2  2 1 1  2 1  2  2 1  2  2 ......". You can see that the
occurrence sequence is s itself.
1 2 2 1 1 2 1 2 
Given an integer n, return the number of 1's in the first n number in the magical string s.

Input: n = 6
Output: 3

Explanation: The first 6 elements of magical string s is "122112" and it

contains three 1's, so return 3.

Input: n = 1
Output: 1
-----------------------------------------------------------------------------------------------------------
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		A[0]=1;
		A[1]=2;
		A[2]=2;
		//VARIABLES:
		int j=2;
		int val=1,i=3,count = 1;

		//ALGORITHM
		while(i<n) {
			for(int k=A[j];k>0;k--) {
				A[i++] = val;
				if(val==1) {
					count++;
				}
			}
			j++;
			val = val==2? 1 : 2;
		}
		System.out.println(count);
		System.out.println(Arrays.toString(A));
	}

}
