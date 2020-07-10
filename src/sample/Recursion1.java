package sample;

public class Recursion1 {

	public static void main(String[] args) throws Exception {
      System.out.println(Recursion1.factorial(5));
      System.out.println(Recursion1.fibonacci(10));
	}
	
	//method for factorial
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return (num *factorial(num-1));
		}
	}
	
	//method for fibonacci Series
	public static int fibonacci(int num) throws Exception {
	    if(num<1) {
	    	throw new Exception("value should not be less then 1");
	    }
		else if(num == 1 || num == 2) {
			return num-1;
		}
		else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}

}
