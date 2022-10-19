package Task_5;

import java.util.Scanner;

/*=========================================================
4. You are given an n x n 2D matrix representing an image, rotate the
image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify
the input 2D matrix directly. DO NOT allocate another 2D matrix and do
the rotation.
Example 1:
1 2 3 7 4 1
4 5 6 ==== 8 5 2
7 8 9 9 6 3
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:
5 1 9 11 15 13 2 5
2 4 8 10 14 3 4 1
13 3 6 7 === 12 6 8 9
15 14 12 16 16 7 10 11
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
Constraints:
n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
=========================================================*/
public class Rotation_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//INPUT:
		System.out.print("Enter Row : ");
		int n=in.nextInt();
		System.out.print("Enter Col : ");
		int m=in.nextInt();
		int A[][] = new int[n][m];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=in.nextInt();
				
			}
		}
		
		//ALGORITHM
		for(int j=0;j<m;j++) {
			for(int i=n-1;i>=0;i--) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
