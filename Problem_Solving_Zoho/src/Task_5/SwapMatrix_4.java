package Task_5;

import java.util.Arrays;
import java.util.Scanner;

public class SwapMatrix_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT: 
//		System.out.print("Enter N value : ");
//		int n=in.nextInt();
//		int A[][] = new int[n][n];
//		System.out.print("Enter N Elements :  ");
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				A[i][j]=in.nextInt();
//			}
//		}
		int n=3;
		int A[][] = { {1,2,3},{4,5,6},{7,8,9}};
		
		
		//ALGORITHM
			int k=0; int rK=0;
			while(k<n){

				for(int i=n-1,j=0;i>=0 && j<n; --i,++j){
					int temp=A[i][rK];
					A[i][rK] = A[k][j];
					A[k][j] = temp;
					System.out.println(A[i][rK] + " "+ temp);
					System.out.println("-------------------------------");
					for(int ii=0;ii<n;ii++){
						for(int jj=0;jj<n;jj++){
							System.out.print(A[ii][jj] + " ");
						}
						System.out.println();
					}
					System.out.println("-------------------------------");
				}
				k++; rK++;
			}
		//PRINT STATEMENT:
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}

}
