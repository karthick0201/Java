package Eva_1;

import java.util.Scanner;
public class Remove_Vowels_6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT
		System.out.print("Enter the String : ");
		String sen=in.next();
		char A[]=sen.toCharArray();
		int n=A.length;
		//ALGORITHM
		int count=0;
		for(int i=0;i<n;i++) {
			if(!(A[i]=='a' || A[i]=='e' || A[i]=='i' || A[i]=='o' || A[i]=='u') || (A[i]=='A' || A[i]=='E' || A[i]=='I' || A[i]=='O' || A[i]=='U')) {
				if(count>1) {
					for(int j=i-count;j<i;j++) {
						System.out.print(A[j] + " ");
					}
					count=0;
				}
				System.out.print(A[i] + " ");
			}
			else {
				count++;
				if(i==n-1) {
					if(count>1) {
						for(int j=i-count+2;j<=i;j++) {
							System.out.print(A[j] + " ");
						}
						count=0;
					}
				}
			}
		}

	}

}
