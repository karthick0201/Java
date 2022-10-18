package Eva_1;

import java.util.Scanner;

public class UniqueThreeDigits_4 {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int count = 0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					if(i!=k && j!=k && j!=i) {
						int result = ((((i)*10)+j)*10)+k;
						System.out.println(result);
						count++;
					}	
				}
			}
		}
		System.out.println("Total number of the three-digit number is "+count);
		
	}
	

}


