package recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
	 public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        pdi(n);
	    }
	
	    public static void pdi(int n){
	        if(n==0){
	            return;
	        }
	        System.out.println(n);
	        pdi(n-1);
	        System.out.println(n);
	    }
}

