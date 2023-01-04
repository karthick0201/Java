package Eva_3;

import java.util.Scanner;

public class PalindromeSubstring_3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String word=in.next();
		PalindromeSubstring(word,word.length());
//		String w="aba";
//		System.out.println(checkPalindrome(w.toCharArray(),0,2));
	}

	private static void PalindromeSubstring(String word, int n) {
		char A[] = word.toCharArray();
		boolean left;
		boolean right;
		for(int i=3;i<n;i++) {
			//find left side of program
			//sent --> start index, end index 
			 left =checkPalindrome(A,0,i-1);
			 right=checkPalindrome(A,i,n-1);
			 int checkCount=0;
			 if(left==true && right==true) {
				 System.out.println("true");
				 checkCount++;
				 break;
				 
			 }
			 if(checkCount==0) {
				 System.out.println("False");
			 }
		}
		
	}

	private static boolean checkPalindrome(char[] A, int s, int e) {
		
		int flag=0;
		for(int p=s,q=e;p<q;p++,q--) {
			if(A[p]!=A[q]) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
