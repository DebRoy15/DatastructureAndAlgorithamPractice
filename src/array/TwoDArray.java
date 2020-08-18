package array;

public class TwoDArray {
	int arr[][] = null;

	// Constructor
	public TwoDArray(int numRows, int numCol) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col > arr[row].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	// traversing through array
	public void traverse() {
		try {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col > arr[row].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Inserting value in the array
	public void insert(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Successfull inserted " + value + " in the array");
			} else {
				System.out.println("The cell is already oucupied");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// accessing value in the array
	public void access(int row, int col) {
		try {
			System.out.println("value is " + arr[row][col]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Searching value in array
	public void search(int value) {
		try {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col > arr[row].length; col++) {
					if (arr[row][col] == value) {
						System.out.println("value found in row " + row + "column " + col);
						return;
					}
				}
			}
			System.out.println("value is not found");

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	// delete a value in array
	public void delete(int value) {
		try {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col > arr[row].length; col++) {
					if (arr[row][col] == value) {
						arr[row][col] = Integer.MIN_VALUE;
						System.out.println("value deleted from row " + row + "column " + col);
						return;
					}
				}
			}
			System.out.println("value is not found");

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
	
	//Delete the entire array
	public void DeleteArr() {
		arr = null;
		System.out.println("The array is successfully deleted ");
	}
}
