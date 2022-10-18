package Eva_2;

import java.util.Arrays;
import java.util.Scanner;

public class DualSort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT 
		System.out.println("Enter n Value : ");
		int n=in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Elements: ");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		//System.out.println(Arrays.toString(A));
		//SORT ALGORITHM
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(A[i]>A[j]) {
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(A));
		//2nd Sort:
		for(int i=0,j=n-1;i<j;i++,j--) {
			System.out.print(A[i]+ " ");
			System.out.print(A[j] + " ");
		}
		if(n%2==1) {
			System.out.println(A[n/2]);
		}
		
		
		
		//PRINT STATEMENT:
		//System.out.println(Arrays.toString(A));

	}

}
