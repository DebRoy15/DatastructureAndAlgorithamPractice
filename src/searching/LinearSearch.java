package searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 10, 40, 10, 60 };

		System.out.println("Enter the value you want to search");
		int value = scan.nextInt();

        // for linear search
		boolean result = search(arr, value);
		if (result) {
			System.out.println("value found");
		} else {
			System.out.println("value not found");
		}
		
		//linear search, print occurrences index of an item in array
		int [] result1 = search1(arr, value);
		
		for (int x : result1) 
            System.out.print(x + " "); 
	}

	private static int[] search1(int[] arr, int value) {

		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == value) {
				list.add(i);
			}
			else {
				list.add(-1);
			}
		}
		
		int[] ans = new int[list.size()]; 
		 // ArrayList to Array Conversion 
        for (int i =0; i < list.size(); i++) 
            ans[i] = list.get(i); 
		
		return ans;
	}

	private static boolean search(int[] arr, int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return true;
			}
		}
		return false;
	}
}
