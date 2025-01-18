
import java.util.Scanner;

class Digits_Min_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;
		for (int i = 0; i < num; i++) {
			int element = sc.nextInt();
			minElement = Math.min(minElement, element);
			maxElement = Math.max(minElement, element);
		}

		System.out.println("Minimum Number is : " + minElement);
		System.out.print("Maximum Number is : " + maxElement);

		sc.close();

	}

}