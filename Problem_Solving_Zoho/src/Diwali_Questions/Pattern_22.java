package Diwali_Questions;
import java.util.Scanner;

/*
Enter N value : 6
				6 6 6 6 6 6 
				6 5 5 5 5 6 
				6 5 4 4 5 6 
				6 5 4 4 5 6 
				6 5 5 5 5 6 
				6 6 6 6 6 6 
 * 
 * 
 */
public class Pattern_22 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		System.out.print("Enter N value : ");
		int n=in.nextInt();
		
		int A[][] = new int[n][n];
		int i=0,j=n-1;
		int p=0,q=n-1;
		printPattern(A,p,q,i,j,n);

	}

	private static void printPattern(int[][] A, int i, int j, int p, int q, int n) {
		int value=n;
		while(i<=j && p<=q) {
			for(int s=i;s<=j;s++) {
				A[p][s]=value;
			}
			p++;
			for(int s=p;s<=q;s++) {
				A[s][j]=value;
			}
			j--;
			for(int s=j;s>=i;s--) {
				A[q][s]=value;
			}q--;
			for(int s=q;s>=p;s--) {
				A[s][i]=value;
			}
			i++;
			value--;
		}
		printArray(A,n);
		
	}

	private static void printArray(int[][] A,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
