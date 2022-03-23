
class Selection {
	// selection sort for integers
	public void selectionSort(int[] arr) {
		// pass over the array n times
		for (int i = 0; i < arr.length - 1; i++) {
			// select current minimum
			int jMin = i;
			// pass through the remainder of the array
			for (int j = i+1; j < arr.length; j++) {
				// if the integer is smaller than the current minimum
				// set the current minimum to the current integer
				if (arr[j] < arr[jMin]) jMin = j;
			}
			// if the new current minimum isn't the current integer
			// swap the current integer with the current minimum
			if (jMin != i) {
				int temp = arr[i];
				arr[i] = arr[jMin];
				arr[jMin] = temp;
			}
		}
	}

	// selection sort for string length
	public void selectionSort_len(String[] arr) {
		// pass over the array n times
		for (int i = 0; i < arr.length - 1; i++) {
			// select current minimum
			int jMin = i;
			// pass through the remainder of the array
			for (int j = i+1; j < arr.length; j++) {
				// if the string is shorter than the current minimum
				// set the current minimum to the current string
				if (arr[j].length() < arr[jMin].length()) jMin = j;
			}
			// if the new current minimum isn't the current string
			// swap the current string with the current minimum
			if (jMin != i) {
				String temp = arr[i];
				arr[i] = arr[jMin];
				arr[jMin] = temp;
			}
		}
	}

	// selection sort for alphabetical sorting; 1st letter only
	public void selectionSort_abc(String[] arr) {
		// pass over the array n times
		for (int i = 0; i < arr.length - 1; i++) {
			// select current minimum
			int jMin = i;
			// pass through the remainder of the array
			for (int j = i+1; j < arr.length; j++) {
				// if the 1st letter is smaller than the current minimum
				// set the current minimum to the current string
				if (arr[j].charAt(0) < arr[jMin].charAt(0)) jMin = j;
			}
			// if the new current minimum isn't the current string
			// swap the current string with the current minimum
			if (jMin != i) {
				String temp = arr[i];
				arr[i] = arr[jMin];
				arr[jMin] = temp;
			}
		}
	}

	// test selectionSort algorithm
	public static void main(String[] args) {
		Selection s = new Selection();

		// create array of integers & sort
		int[] intArr = {3, 5, 2, 7, 8, 1, 4, 6, 9};
		s.selectionSort(intArr);
		for (int i = 0; i < intArr.length; i++) System.out.println(" intArr["+i+"]: " + intArr[i]);
		System.out.println("\n");

		// create array of strings & sort
		String[] strArr1 = {"st", "string", "s", "stri", "strin", "str"};
		s.selectionSort_len(strArr1);
		for (int i = 0; i < strArr1.length; i++) System.out.println(" strArr1["+i+"]: " + strArr1[i]);
		System.out.println("\n");

		// create array of strings & sort
		String[] strArr2 = {"alligator", "car", "saturday", "bus", "fish"};
		s.selectionSort_abc(strArr2);
		for (int i = 0; i < strArr2.length; i++) System.out.println(" strArr2["+i+"]: " + strArr2[i]);
		System.out.println("\n");
	}
}
