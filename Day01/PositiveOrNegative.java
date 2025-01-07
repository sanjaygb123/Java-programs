package Day01;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//Enter the number
		System.out.println("enter the number");
		double number = sc.nextDouble();
		
		
		//Check no is positive, negative or zero.
		if(number>0) {
			System.out.println(number+ " is Positive.");
		}else if (number<0) {
			System.out.println(number+ " is Negative");
		}else {
			System.out.println("The number is Zero");
		}
		
		sc.close();

	}

}
