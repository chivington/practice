
class Selection {
	// selection sort for integers
	public void selectionSort(int[] arr) {
		// pass over the array n-1 times
		for (int j = 0; j < arr.length - 1; j++) {
			int iMin = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[i] < arr[iMin]) iMin = i;
			}
			if (iMin != j) {
				int temp = arr[j];
				arr[j] = arr[iMin];
				arr[iMin] = temp;
			}
		}
	}

	// selection sort for string length
	public void selectionSort(String[] arr) {
		// pass over the array n-1 times
		for (int j = 0; j < arr.length - 1; j++) {
			int iMin = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[i].length() < arr[iMin].length()) iMin = i;
			}
			if (iMin != j) {
				String temp = arr[j];
				arr[j] = arr[iMin];
				arr[iMin] = temp;
			}
		}
	}

	// test selectionSort algorithm
	public static void main(String[] args) {
		Selection b = new Selection();

		// create array of integers
		int[] intArr = {3, 5, 2, 7, 8, 1, 4, 6, 9};
		b.selectionSort(intArr);
		for (int i = 0; i < intArr.length; i++) System.out.println(" intArr["+i+"]: " + intArr[i]);
		System.out.println("\n");

		// create array of strings
		String[] strArr = {"st", "string", "s", "stri", "strin", "str"};
		b.selectionSort(strArr);
		for (int i = 0; i < strArr.length; i++) System.out.println(" strArr["+i+"]: " + strArr[i]);
		System.out.println("\n");
	}
}
