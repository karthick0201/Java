package Eva_1;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		
		/*Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int rows = 0;
		int num = 1;
		
		while (rows<n) {
			int column = rows + 1;
			
			while (column>0) {
				System.out.print(num++);
				column--;
				if (rows>0 && column>0) {
					System.out.print("*");
				}
			}
			
			System.out.println();			
			rows++;
		}
		
		rows = n;
		while (rows>0) {
			int column = rows;
			num = ((rows*(rows-1))/2)+1;
			
			while (column>0) {
				System.out.print(num++);
				column--;
				if (rows>0 && column>0) {
					System.out.print("*");
				}
			}
			System.out.println();			
			rows--;
		}*/
		
		//Method -2:
		int n=4;
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				if(!(i==1 || i==(n-1))) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
