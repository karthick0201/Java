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
public class DemoCombinationQue2 {

	public static void printkeypad(int num,String output,String option[]){
		if(num == 0){
			System.out.println(output);
			return;
		}
		int n1 = num%10;//last index of the num
		String s1 = option[n1];
		for(int i=0;i<s1.length();i++){
			printkeypad(num/10,s1.charAt(i)+output,option);
		}
	}
	public static void main(String[] args) {
		String output ="";
		String A[] = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printkeypad(num,output,A);	
	}
}
