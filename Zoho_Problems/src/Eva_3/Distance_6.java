package Eva_3;

import java.util.Scanner;

public class Distance_6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Word-1 : ");
		String word1=in.nextLine();
//		String word1="tamil english maths science social";
		//            0		6       14     20      28
		System.out.println("Enter Word-2 : ");
		String word2=in.nextLine();
//		String word2="tamil";
		System.out.println("Enter Word-3 : ");
		String word3=in.nextLine();
//		String word3="social";
		
		System.out.println("----------------------");
		
		int indexNum1=findIndex(word1,word2,word1.length(),word2.length());
		System.out.println("indexNum-1 : " + indexNum1);
		int indexNum2=findIndex(word1,word3,word1.length(),word2.length());
		System.out.println("IndexNum-2 : " + indexNum2);
		
		if(indexNum1<0 && indexNum2<0) {
			System.out.println("Output : -1");
		}else {
			findSpaceCount(word1,indexNum1,indexNum2,word1.length());
		}
		
		
		
		
	}

	private static void findSpaceCount(String word1, int indexNum1, int indexNum2, int n) {
		char A[]=word1.toCharArray();
		int spaceCount=0;
		for(int i=indexNum1;i<indexNum2;i++) {
			if(A[i]==' ') {
				spaceCount++;
			}
		}
		System.out.println("Output : " + (spaceCount-1));
	}

	private static int findIndex(String word1, String word2, int n1, int n2) {
		char A[] = word1.toCharArray();
		char B[] = word2.toCharArray();
		int bTotalCount=n2;
		int count=0;
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(A[i+j]==B[j]) {
					count++;
					if(count==bTotalCount) {
						return i;
					}
				}else {
					count=0;
				}
			}
		}
		
		return -1;
	}
}
