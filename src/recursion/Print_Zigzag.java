package recursion;

import java.util.Scanner;

public class Print_Zigzag {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		pzz(n);
		scan.close();
	}

	public static void pzz(int n) {
		if (n == 0) {
			return;
		}

		System.out.print(n + " ");
		pzz(n - 1);
		System.out.print(n + " ");
		pzz(n - 1);
		System.out.print(n + " ");
		
	}

}
