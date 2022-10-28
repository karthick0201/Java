package com.balloons_task;

public class SampleClass {

	public static void main(String[] args) {
		int m=3;
		int n=3;
		char A[][] = {{'.','q','.'},
					  {'.','f','.'},
					  {'a','a','a'},
					};
		
		for(int i=0;i<m;i++) {
			int flag=0;
			for(int j=0;j<n-1;j++) {
				if(A[i][j]!=A[i][j+1]) {
					flag++;
					//break;
				}
			}
			if(flag==0) {
				for(int j=0;j<n;j++) {
					A[i][j]='.';
				}
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}

}
