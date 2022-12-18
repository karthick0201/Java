package CollectionPratice.SetPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*****************************************************
 * SET DOESN'T CONTAIN DUPLICATE VALUES:
 * 1. -WE CAN CONVERT LIST TO SET, SET IS REMOVED DUPLICATE VALUES
 * 
*****************************************************/
public class SetPratice1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,5,6,33,56,2,3,2,56,33);
		System.out.println(list);
		//PASSING LIST DATA INTO SET OBJECT 
		//--> IT REMOVES DUPLICATE VALUES
		Set<Integer> s=new HashSet<Integer>(list);
		System.out.println("List : " + list);
		System.out.println("Set : " + s);
		
		
		
	}
}

