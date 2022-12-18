package CollectionPratice.SortingInterfacePratice;

import java.util.Arrays;

public class ComparablePratice1 {
	public static void main(String[] args) {
		ComparableStringPratice csp = new ComparableStringPratice();
		csp.stringSortPratice();
	}
}

class ComparableStringPratice {
	void stringSortPratice() {
		//STANDARD DISTRANORY SORT:
		
		String names[] = { "kat", "sneha", "iman", "bharath", "rajesh", "jagadesh", "yogesh", "vignesh" };
		int numbers[] = {66,55,88,35,26,7};
		Arrays.sort(numbers);
		// NUMBERS sORT
		System.out.println(Arrays.toString(numbers));
		//sTRING sORT:
		System.out.println("BEFORE SORT : " + Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("AFTER SORT : " + Arrays.toString(names));
		
		//
	}

	

}
