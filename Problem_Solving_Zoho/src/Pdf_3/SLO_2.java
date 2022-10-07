package Pdf_3;

import java.util.Stack;

import Implementation.Stac;

public class SLO_2 {

	public static void main(String[] args) { // WEBSITE REFER REFER
		String sen="bcabc";
		SLO_2 rd = new SLO_2();
		String result = rd.removeDuplicateLetters(sen);
        System.out.println(result);
	}
	// track the lastIndex of character presence
	public  String removeDuplicateLetters(String s) {
		int[] lastIndex = new int[26];
		for (int i = 0; i < s.length(); i++) {
			lastIndex[s.charAt(i) - 'a'] = i; 
		}
		// keep track seen
		boolean[] seen = new boolean[26]; 
		Stac st = new Stac();

		for (int i = 0; i < s.length(); i++) {
			int curr = s.charAt(i) - 'a';
			if (seen[curr])
				continue; // if seen continue as we need to pick one char only
			while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]) {
				seen[st.pop()] = false; // pop out and mark unseen
			}
			st.push(curr); // add into stack
			seen[curr] = true; // mark seen
		}

		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty())
			sb.append((char) (st.pop() + 'a'));
		return sb.reverse().toString();
	}

}
