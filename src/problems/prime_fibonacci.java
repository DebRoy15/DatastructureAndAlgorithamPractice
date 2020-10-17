package problems;

import java.util.Scanner;

public class prime_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = scan.nextInt();
		if(n%2==0) {
			prime(n);
		}
		else {
		    fibonacci(n);
		}

	}

	private static void fibonacci(int n) {
		int first = 1;
		int second = 2;
		int temp =0;
		
		while(second <= n) {
			if(second>=n) {
				
				break;
			}
			else {
				temp = first;
				first = second;
				second = second +first;
			}
		}
		System.out.println(second);
		
	}

	private static void prime(int n) {
		// TODO Auto-generated method stub
		
	}

}
