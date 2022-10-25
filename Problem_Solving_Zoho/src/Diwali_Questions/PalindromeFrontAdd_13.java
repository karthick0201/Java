package Diwali_Questions;

import java.util.Scanner;

	/*13. You are given a string s. You can convert s to a palindrome by
	adding characters in front of it.
	Return the shortest palindrome you can find by performing this
	transformation.
	Input: s = "aacecaaa"
	Output: "aaacecaaa"
	Input: s = "abcd"
	Output: "dcbabcd"------------------
*/
public class PalindromeFrontAdd_13 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String : ");
		//String s="aacecaaa";
		String s=in.next();
		int index=1;
		int check=0;
		while(checkPalindrome(s) == false) {
			s=s.charAt(index) + s;
			index += 2;
		}
	
		System.out.println("Longest Palindrome : " + s);
	}

	private static boolean checkPalindrome(String s) {

		int n=s.length();
		int flag=0;
		for(int i=0,j=n-1;i<j;i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
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
