package Eva_3;

import java.util.Scanner;

public class StringProceding_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String : ");
		String word = in.next();

		findOccurences(word, word.length());
	}

	private static void findOccurences(String word, int n) {
		String temp="";
		char A[] = word.toCharArray();
		int count;
		for (int i = 0; i < n; i++) {
			count = 1;
			if (A[i] != '0') {
				for (int j = i + 1; j < n; j++) {
					if (A[i] == A[j]) {
						A[j] = '0';
						count++;
					}
				}
				System.out.println(A[i] + " --> " + count);
				temp = temp + A[i]+count;
				
			}

		}
		System.out.println(temp);
	}
}
