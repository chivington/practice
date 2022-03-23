
class Bubble {
	// bubble sort for integers
	public void bubbleSort(int[] arr) {
		// pass over the array n-1 times
		for (int i = 1; i < arr.length; i++) {
			// pass over the array n times
			for (int j = 0; j < arr.length-1; j++) {
				// if current integer is greater than the next integer,
				// swap the current and next integer.
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];	// create placeholder for current integer
					arr[j] = arr[j+1];	// move next integer to current position
					arr[j+1] = temp;	// move placeholder to next position
				}
			}
		}
	}

	// bubble sort for string length
	public void bubbleSort(String[] arr) {
		// pass over the array n-1 times
		for (int i = 1; i < arr.length; i++) {
			// pass over the array n times
			for (int j = 0; j < arr.length-1; j++) {
				// if current string is longer than the next string,
				// swap the current and next strings.
				if (arr[j].length() > arr[j+1].length()) {
					String temp = arr[j];	// create placeholder for current string
					arr[j] = arr[j+1];	// move next string to current position
					arr[j+1] = temp;	// move placeholder to next position
				}
			}
		}
	}

	// test bubbleSort algorithm
	public static void main(String[] args) {
		Bubble b = new Bubble();

		// create array of integers
		int[] intArr = {3, 5, 2, 7, 8, 1, 4, 6, 9};
		b.bubbleSort(intArr);
		for (int i = 0; i < intArr.length; i++) System.out.println(" intArr["+i+"]: " + intArr[i]);
		System.out.println("\n");

		// create array of strings
		String[] strArr = {"st", "string", "s", "stri", "strin", "str"};
		b.bubbleSort(strArr);
		for (int i = 0; i < strArr.length; i++) System.out.println(" strArr["+i+"]: " + strArr[i]);
		System.out.println("\n");
	}
}
