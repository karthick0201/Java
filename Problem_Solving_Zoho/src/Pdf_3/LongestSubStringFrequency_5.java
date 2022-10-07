package Pdf_3;

import java.util.Scanner;

public class LongestSubStringFrequency_5 {

	public static void main(String[] args) {//COMPLETED
		Scanner in=new Scanner(System.in);
/*---------------------------------------------------------------------------------------------------------
 * 5) Given a string s and an integer k, return the length of the longest substring ofssuch that the
frequency of each character in this substring is greater than or equal tok.

Input: s = "aaabb", k = 3

Output: 3

Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.

Input: s = "ababbc", k = 2

Output: 5

Explanation: The longest substring is "ababb", as 'a' is repeated 2

				times and 'b' is repeated 3 times
-----------------------------------------------------------------------------------------------------------
*/
				//INPUT : 
				System.out.println("Enter String : ");
				String sen=in.next(); 
				System.out.println("Enter K Value : ");
				int key=in.nextInt();
				
				char A[] = sen.toCharArray();
				int n=A.length;
				
				//ALGORITHM
					int tcount=0;
					int count=1; 
					for(int i=0;i<n;i++) {
						if(A[i]!='0') {
							for(int j=i+1;j<n;j++) {
								if(A[i]==A[j]) {
									count++;
									A[j]='0';
								}
							}
							if(count>=key) {
								tcount += count;
								count=1;
							}					
						}
					}
					System.out.println("COUNT : " + tcount);
					
				
				 


	}

}
