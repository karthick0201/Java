package Eva_3;

import java.util.Scanner;

public class ReverseWord_1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String word=in.nextLine();
		
		//String word="one two okie std";
		oddRotate(word,word.length());
		
	}

	private static void oddRotate(String word, int n) {
		char A[] = word.toCharArray();
		int count=0,rotateCount=0;
		for(int i=0;i<n;i++) {
			if(A[i]!=' ') {
				count++;
				/*******************************/
				if(i==n-1) {
					rotateCount++;
					if(rotateCount%2==1) {
						for(int j=i-1;j>=i-count;j--) {
							System.out.print(A[j]);
						}
						System.out.print(" ");
					}else {
						for(int j=i-count;j<=i;j++) {
							System.out.print(A[j]);
						}
						System.out.print(" ");
					}
					count=0;
				}
				
				
				/*******************************/
			}else {
				rotateCount++;
				if(rotateCount%2==1) {
					for(int j=i-1;j>=i-count;j--) {
						System.out.print(A[j]);
					}
					System.out.print(" ");
				}else {
					for(int j=i-count;j<i;j++) {
						System.out.print(A[j]);
					}
					System.out.print(" ");
				}
				count=0;
			}
		}
	}

	
}
