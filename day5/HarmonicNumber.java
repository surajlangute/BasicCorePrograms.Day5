package basic.CorePrograms.day5;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		double result = 0;
		
		System.out.println("the Harmonic Series is : ");
		
		for (int i = num ; i > 0; i--) {
			
			result = result + (double) 1 / i ;
			
			System.out.print(result + " , ");
		}

	}
}