package Pdf_1_2;

import java.util.Scanner;

public class WordSeparate_1 {
/*----------------------------------------------------------------------------------------------------------------------
1) Given a String S, reverse the string without reversing its individual words.
Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much

Output: much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno

Output: mno.pqr
----------------------------------------------------------------------------------------------------------------------------*/
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String Sentence=in.next();
		//String Sentence= "i.like.very.much";
		//String Sen2="";
		
		char[] A=Sentence.toCharArray();
		
		int n=A.length;
		int count =0;
		for(int i=n-1;i>=0;i--) {
			if(A[i]!='.') {
				count++;
			}
			else {
				for(int j=i+1;j<i+count+1;j++) {
					System.out.print(A[j]);
					//Sen2+=A[j];
				}
				System.out.print(".");
				count=0;
			}
		}
		for(int i=0;i<n;i++) {
			if(A[i]!='.') {
				System.out.print(A[i]);
				//Sen2+=A[i];
			}
			else {
				break;
			}
		}

	}

}
