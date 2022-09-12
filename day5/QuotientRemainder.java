package basic.CorePrograms.day5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Dividend : ");
        int dividend = scan.nextInt();
        System.out.print("Enter the Divisor : ");
        int divisor = scan.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient+ " Remainder = " + remainder);

	}

}
