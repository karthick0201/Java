package Task_5;

import java.util.Scanner;


/*=========================================================
2. Given a string containing digits from 2-9 inclusive, return all
possible letter combinations that the number could represent. Return the
answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is
given below. Note that 1 does not map to any letters.
1 2 3
abc def
Nibila Amutha
4 5 6
ghi jkl mno
7 8 9
prqs tuv wxyz
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:
Input: digits = ""
Output: []
Example 3:
Input: digits = "2"
Output: ["a","b","c"]
Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9']
=========================================================
*/
public class PossibleLetterCombinations_2 {

	public static void main(String[] args) {
		
		int top=0;
		/**/
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		if(s.equals("")){
			System.out.println("[]");
		}else {	
			int num=Integer.valueOf(s);
			if(s.length()==1 && s != "1") {
				String c=findString(Integer.valueOf(s));
				for(int i=0;i<c.length();i++) {
					System.out.print(c.charAt(i) + ", ");
				}
			}else {
				String temp[]=new String[s.length()];
				while(num>0) {
					int t1=num%10;
					String c = findString(t1);
					temp[top++]=c;
					num=num/10;
				}
				findCombi(temp);
			}
		}
		scanner.close();
	}
	private static void findCombi(String[] temp) {
		int n=temp.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				char[] A = temp[i].toCharArray();
				char[] B = temp[j].toCharArray();
				combination(A,B);
			}
		}
		System.out.print("]");
	}
	private static void combination(char[] a, char[] b) {
		System.out.print("[");
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<b.length;j++) {
    		   System.out.print("\""+b[j]+""+a[i]+"\" ,");
    	   }
    	   System.out.print(" ");
       }
	}
	static String findString(int num) {
		
		switch(num) {
		case 1:
			  return "";
		case 2:
			return "abc";
		case 3:
			return "def";
		case 4:
			return "ghi";
		case 5:
			return "jkl";
		case 6:
			return "mno";
		case 7:
			return "prqs";
		case 8:
			return "tuv";
		case 9:
			return "wxyz";
			default:
				return "";
		}
	}

}
