
package Eva_3;

import java.util.Scanner;

public class ReverseWord_1p2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String word=in.nextLine();
		
		//String word="one two okie std";
		System.out.println("Enter o or e : ");
		char check=in.next().charAt(0);
		int c;
		if(check=='o') {
			c=1;
		}else {
			c=0;
		}
		oddRotate(word,word.length(),check);
		
		
	}

	private static void oddRotate(String word, int n,char check ) {
		
		char A[] = word.toCharArray();
		int count=0;
		int rotateCount;
		boolean boo;
		if(check=='o') {
			rotateCount=0;
			boo=true;
		}else {
			rotateCount=1;
			boo=false;
		}
				//int rotateCount=0;
		for(int i=0;i<n;i++) {
			if(A[i]!=' ') {
				count++;
				
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
		if(boo==true) {
			for(int i=n-1;i>=0;i--) {
				if(A[i]!=' ') {
					System.out.print(A[i]);
				}else {
					break;
				}
				
			}
		}else {
			for(int i=n-1;i>=0;i--) {
				if(A[i]==' ') {
					for(int j=i+1;j<n;j++) {
						System.out.print(A[j]);
					}
					break;
				}
		}
		
			
		}
	
		
	}

	
}
