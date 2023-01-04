package Eva_3;

import java.util.Scanner;

public class StarProgram_5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter String-1 : ");
		String s1=in.next();
		System.out.println("Enter String-2 : ");
		String s2=in.next();
		
		findStar(s1,s2,s1.length(),s2.length());
		
	}

	private static void findStar(String s1, String s2, int n1, int n2) {
		char A[]=s1.toCharArray();
		char B[]=s2.toCharArray();
		int i=0,j=0;
		
		while(i<n1 && j<n2) {
			if(A[i]==B[j]) {
				i++; 
				j++;
			}else if(B[j] =='*' && ((A[i]>='a' && A[i]<='z') || (A[i]>='A' && A[i]<='Z'))){
				if(A[i+1]==B[j+1]) {
					i++;j++;
				}else {
					i++;
				}
			}else {
				i++;
			}
		}
		
		if(j==n2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}


}
