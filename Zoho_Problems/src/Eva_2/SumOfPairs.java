package Eva_2;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPairs {

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
		
		System.out.println("Enter K value : ");
		int k=in.nextInt();
		//ALGORITHM
		//common value:
		int max=A[0];
		
		for(int i=1;i<n;i++) {
			if(max<A[i]) {
				max=A[i];
			}
		}
		int cv=max+1;
		//REMOVE DUPLICATE
		for(int i=0;i<n;i++) {
			if(A[i]!=cv) {
				for(int j=i+1;j<n;j++) {
					if(A[i]==A[j]) {
						A[j]=cv;
					}
				}
			}
		}
		int count=0;
		//SUM OF PAIR:
		for(int i=0;i<n-1;i++) {
			if(A[i]!=cv) {
				for(int j=i+1;j<n;j++) {
				if(A[j]!=cv) {
					int sum=A[i]+A[j];
					if(sum==k) {
						count++;
						System.out.println("(" + A[i] +"," + A[j] + ")");
					}

				}
				}
			}
		}
		System.out.println("Pair COunt : " + count);
	
	}

}
