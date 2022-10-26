package Diwali_Questions;

import java.util.Scanner;

public class GreaterThanItsPreviousElement_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// INPUT::
		System.out.println("ENter n Value: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");

		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		findGreaterPreviousElement(A,n);

	}

	private static void findGreaterPreviousElement(int[] A, int n) {
		System.out.print("Greater than Its Privious Element: ");
		int flag;
		System.out.print(A[0] + " ");
		
		for(int i=1;i<n;i++) {
			flag=0;
			for(int j=0;j<i;j++) {
				if(A[i]<A[j]) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				System.out.print(A[i] + " ");
			}
		}
		
		
	}

}
