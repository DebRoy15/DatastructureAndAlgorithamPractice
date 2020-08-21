package array;


public class BinarySearch {
	
	public static void main(String[] args) {
			
		int arr[] = {2, 7, 8, 10, 18, 25, 39};
		int value = 18;
		int n = arr.length;
		int ans = binarySeaching(arr, 0, n-1, value );
		System.out.println("Value found in the index of "+ans);
	}

	private static int binarySeaching(int[] arr, int l, int r, int x) {
		if(r>=1) {
			int mid = l +(r-1)/2;
			
			if(arr[mid]==x)
				return mid;
			
			if(arr[mid]>x)
				return binarySeaching(arr, l, mid-1, x);
			
			return binarySeaching(arr, mid+1, r, x);
		}
		
		return -1;
		
	}

}
