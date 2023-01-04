package sample;

import java.util.Arrays;

public class AlphabetChange {
	public static void main(String[] args) {

		String name = "RaJeNDRan";
		changeAlphabet(name, name.length());
		
		char a='5';
		char b='6';
		int o=1;
		int o2=9;
		int aa=(o*10) + o2;
		System.out.println(a-'0' + " : " + aa );
	}

	private static void changeAlphabet(String name, int n) {
		char A[] = name.toCharArray();
		for (int i = 0; i < n; i++) {
			if(A[i] >='a' && A[i]<='z') {
				int temp= (int)A[i] -32;
				A[i]=(char)temp;
			}else {
				int temp= (int)A[i] +32;
				A[i]=(char)temp;
			}
		}
		System.out.println(Arrays.toString(A));
	}
}
