package Pdf_1_2;

public class Pangram_2 {

	public static void main(String[] args) {
		
/*----------------------------------------------------------------------------------------------------------------------
		 2) Given a string check if it is Pangram or not. A pangram is a sentence
containing every letter in the English Alphabet.

Example 1:

Input:
S = Bawds jog, flick quartz, vex nymph

Output: 1

Example 2:

Input:
S = sdfs

Output: 0
-------------------------------------------------------------------------------------------------------------------------*/
		
		String Sentence = "AbcdEfghijklmnopqrstuvwxyz";
		
		
		String Sen2 = "abcdefghijklmnopqrstuvwxyz";
		char A[] = Sentence.toCharArray();
		char B[] = Sen2.toCharArray();
		int n1=A.length;
		int n2=B.length;
		//ALGORITHM:
		
		for(int i=0;i<n1;i++) {
			
			int temp=(int)A[i];
			
			//CAPTIAL TO SMALL
			if(A[i]>='A' && A[i]<='Z') {
				temp=temp+32;
				A[i]=(char)temp;
			}
			
			//char ctemp=(char)temp;
			for(int j=0;j<n2;j++) {
				if(temp==B[j]) {
					B[j]=0;
					break;
				}
					
			}
		}
		//Result:
		
		boolean flag=true;
		
		for(int i=0;i<n2;i++) {
			if(B[i] !=0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Panagaram");
		}
		else {
			System.out.println("Not panagram");
		}

	}

}
