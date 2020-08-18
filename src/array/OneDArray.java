package array;

public class OneDArray {

	int arr[];

	// Constructor
	public OneDArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// print the Array
	public void traverceArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Insert value in the Array
	public void insertion(int location, int value) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("value inserted " + value + " at location " + location);
			} else {
				System.out.println("This cell is already occupied by another values");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Accessing the Array
	public void access(int location) {
		try {
			System.out.println("value of location " + location + " is " + arr[location]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Searching value in Array
	public void search(int value) {
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == value) {
					System.out.println("Value " + value + " found in the index at " + i);
					break;
				} else {
					if (i == arr.length - 1)
						System.out.println("Value not found 404");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Deleting value from array
	public void delete(int value) {
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == value) {
					arr[i] = Integer.MIN_VALUE;
					System.out.println("Value have been deleted and now value is " + arr[i]);
					break;
				} else {
					if (i == arr.length - 1)
						System.out.println("Value not found 404");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}// end of the class