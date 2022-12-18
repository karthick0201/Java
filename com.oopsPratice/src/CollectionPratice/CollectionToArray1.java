package CollectionPratice;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,4,6,7,4,33,8,7,9,33);
		
		//.toArray(); --> Object class object
		Object[] a = list.toArray();
		System.out.println(a);
		for(Object b:a) {
			System.out.println((int) b);
		}
	}
}
