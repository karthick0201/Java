package Pdf_1_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssendingOrder_5 {

	public static void main(String[] args) {
/*------------------------------------------------------------------------------------------------------------------------
5) Given an array of size N containing only 0s, 1s, and 2s; sort the array in
ascending order.
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Example 2:
Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1
-----------------------------------------------------------------------------------------------------------------------------------*/
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = in.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		
//		int A[] = {0,2,0,1,2};
//		int n = A.length;
		int flag=0;
		for(int k=0;k<n;k++) {
			if(!(A[k]==0 || A[k]==1 || A[k]==2)) {
//				flag++;
//				break;
				System.out.println("Invaild Number");
			}else {
				for(int i=0;i<n-1;i++) {
					for(int j=i+1;j<n;j++) {
						if(A[i]>A[j]) {
							
							int temp=A[i];
							A[i]=A[j];
							A[j]=temp;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(A));

	}

}
