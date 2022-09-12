package basic.CorePrograms.day5;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scanner.nextInt();
		
		for (int i = 2; i < n; i++)
		{
			while (n % i == 0)
			{
				n = n / i;

				System.out.println(i);
			}
		}
		if (n != 1) {
			System.out.println(n);
		}

	}
}
