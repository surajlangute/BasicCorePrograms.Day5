package basic.CorePrograms.day5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = scan.nextInt();
		if (n % 2 == 0) {
			System.out.println("Entered Number  " + n+ " is Even");
		} else {
			System.out.println("Entered Number  " + n +" is odd");
		}

	}
}