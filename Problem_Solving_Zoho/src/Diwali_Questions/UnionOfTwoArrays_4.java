package Diwali_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class UnionOfTwoArrays_4 { //Uncompleted 

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1=in.nextInt();
		System.out.println("Enter N2 : ");
		int n2=in.nextInt();
		int A[] = new int[n1];
		int B[] = new int[n2];
		int C[] = new int[n1+n2];
		
		System.out.println("Enter N1 Elements : ");
		for(int i=0;i<n1;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter N2 Elements : ");
		for(int i=0;i<n2;i++) {
			B[i]=in.nextInt();
		}
		
		//ALGORITHM:
		
		int i=0,j=0,k=-1;
		
		while(i<n1 && j<n2) {
			if(A[i]==B[j]) {
				if(C[k]!=A[i]) {
					C[++k]=A[i];
					//i++; j++; //k++;
				}
				i++; j++;
				System.out.println("A[i]==B[j] Coming");
				
			}
			else if(A[i]<B[j]) {
				//try {
				if((C[k]!=A[i]) && (k != -1)) {
					C[++k]=A[i];
					//i++; //k++;
				}
				i++;
				System.out.println("A[i]<B[j] Coming");
				//}catch(Exception e) {
					//System.out.println("Something wrong!!!");
				//}
				
			}
			else if(A[i]>B[j]) {
				if(C[k]!=A[i]) {
					C[++k]=B[j];
					//j++; //k++;
				}
				 j++;
				 System.out.println("A[i]>B[j] Coming");
				
			}
			System.out.println("While COndition : " + Arrays.toString(C));
		}
		
		while(i<n1) {
			if(C[k]!=A[i]) {
				C[++k] = A[i];
				//i++; //k++;
			}
			i++;
			System.out.println("While COndition i<n1 : " + Arrays.toString(C));
		}
		while(j<n2) {
			if(C[k]!=B[j]) {
				C[++k] = B[j];
				//j++; //k++;
			}
			j++;
			System.out.println("While COndition j<n2 : " + Arrays.toString(C));
		}
		//PRINT STATEMENT:
		for(int p=0;p<k;p++) {
			System.out.print(C[p] + " ");
		}
		
	}

}
