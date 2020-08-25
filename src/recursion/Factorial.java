package recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    System.out.println(factorial(n));
	    
	}
	
	public static int factorial(int n){
	    if(n==1){
	        return 1;
	    }
	   return n * factorial(n-1);
	    
	}
	
}

