package Pdf_1_1;

import java.util.Scanner;

//1 . MULTIPLICATION TABILE

public class MultiplicationTable_1 {

	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter Table : ");
	 int table=in.nextInt();
	 for(int i=1;i<=10;i++) {
		 System.out.println(i +" * "+table+" = "+ i*table);  
	 }

	}

}
