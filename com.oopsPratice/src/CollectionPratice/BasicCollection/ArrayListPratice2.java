package CollectionPratice.BasicCollection;
import java.util.*;

public class ArrayListPratice2 {
public static void main(String[] args) {
	MethodsPratice mp=new MethodsPratice();
	mp.methodPratice();
}

}

class MethodsPratice {
	void methodPratice() {
		/* ARRAY LIST CREATION: */
		List list=new ArrayList();
		
		//1. ADD()
		list.add("kat");
		list.add("sneha");
		list.add("iman");
		list.add("bharath");
		list.add("jagadesh");
		
		//PRINT STATEMENT:
		System.out.println("List : " + list);
		
		//2. size()
				System.out.println("SIZE : " + list.size());
		//3. contains()
				System.out.println("Contains : " + list.contains("Hello"));
		//4. isEmpty():
				System.out.println("isEmpty : " + list.isEmpty());
		//5. subList():
				List subList=list.subList(1, 3);
				System.out.println("Sub List : " + subList);
		//6. get():
				System.out.println("Get() : " + list.get(0));
		//7. remove(): 
				System.out.println("Before : " + list  );
				System.out.println("Remove(INDEX) : " + list.remove(2));
				System.out.println("Remove(object) : " + list.remove("jagadesh"));
				System.out.println("AFTER : " + list);
		//8. addAll();
				List list2=new ArrayList();
				list2.addAll(list);
				System.out.println("List 2 : " + list2);
		//9. retainAll():
		//10. removeAll()
		//11. clear()
				
	}
}
