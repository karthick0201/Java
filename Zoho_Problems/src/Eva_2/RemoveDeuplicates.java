package Eva_2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDeuplicates {

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
				int count=0;
				for(int i=0;i<n;i++) {
					if(A[i]!=cv) {
						for(int j=i+1;j<n;j++) {
							if(A[i]==A[j]) {
								A[j]=cv;
								count++;
							}
						}
					}
				}
				//PRINT STATEMENT:
				for(int i=0;i<n;i++) {
					if(A[i]!=cv) {
						System.out.print(A[i] + ", ");						
					}
				}
				for(int i=0;i<count;i++) {
					System.out.print("_");
					if(i!=count-1) {
						System.out.print(", ");
					}
				}
	}

}
