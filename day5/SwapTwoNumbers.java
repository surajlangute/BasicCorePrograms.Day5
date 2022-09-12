package basic.CorePrograms.day5;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Value of A : ");
        int A = Input.nextInt();   
        
        System.out.print("Enter The Value of B : ");
        int B = Input.nextInt();   
        
        System.out.println("Before Swaping " +A+ "," +B);
        int temp = A; 				
        A = B;   					
        B = temp;  					
        System.out.println("After Swaping " + A+ "," +B);
	}

}
