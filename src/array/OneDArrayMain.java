package array;

public class OneDArrayMain {

	public static void main(String[] args) {

		System.out.println("Creating a blank array with size 10......");
		OneDArray oneDArr = new OneDArray(6);
		
		System.out.println("Printing the Array...");
		oneDArr.traverceArray();
		System.out.println("\n--------------------");
		
		System.out.println("Inseting value in the Array");
		oneDArr.insertion(0, 10);
		oneDArr.insertion(1, 20);
		oneDArr.insertion(2, 30);
		oneDArr.insertion(3, 40);
		oneDArr.insertion(4, 50);
		oneDArr.insertion(5, 60);
		oneDArr.insertion(2, 100);// checking the occupied cell
		oneDArr.insertion(8, 70);// checking the Exception
		System.out.println("\n--------------------");
		oneDArr.access(3);
		System.out.println("\n--------------------");
		oneDArr.search(90);
		System.out.println("\n--------------------");
		oneDArr.search(40);
		System.out.println("\n--------------------");
		oneDArr.delete(20);
		System.out.println("\n--------------------");
	}

}
