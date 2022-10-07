package Pdf_3;

import java.util.Scanner;

public class StringRepetition_1 {  //COMPLETED
/*----------------------------------------------------------------------------------------------------------
1) Strings Repetition : //
 
You just need to take a string and a integer as an input and repeat the string upto the count given
as in integer.

Sample Test Case :

Hello
2

Output :
HelloHello
 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String sen=in.nextLine();
		System.out.println("Enter N Value : ");
		int n=in.nextInt();
		
		//ALGORITHM 
		for(int i=0;i<n;i++) {
			System.out.print(sen);
		}
		
	}

}
