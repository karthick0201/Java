package Task_5;

import java.util.Scanner;

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
