package problems;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int step = scan.nextInt();

		getDistance(step);
	}

	private static void getDistance(int step) {
		int x = 0;
		int y = 0;
		int distance = 10;
		char move = 'R';

		while (step > 0) {
			switch (move) {
			case 'R': {
				x += distance;
				move = 'U';
				distance += 10;
				break;
			}
			case 'U': {
				y += distance;
				move = 'L';
				distance += 10;
				break;
			}
			case 'L': {
				x -= distance;
				move = 'D';
				distance += 10;
				break;
			}
			case 'D': {
				y -= distance;
				move = 'A';
				distance += 10;
				break;
			}
			case 'A':{
				x+=distance;
				move='R';
				distance+=10;
				break;
			}

			}
			step--;

		}
		System.out.println(x+", "+y);
	}

}
