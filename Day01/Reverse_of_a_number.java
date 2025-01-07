package Day01;

import java.util.Scanner;

public class Reverse_of_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Enter the number
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int ReversedNumber =0;
		int OriginalNumber = number;
		
		while (number!=0) {
			int digit =number %10; //get last digit
			ReversedNumber =ReversedNumber *10 +digit; //append digit to reversed number
			number /=10; //remove last digit from the number
			
		}
		
		//result
		System.out.println("The reverse of "+ OriginalNumber + "is: " + ReversedNumber);
		
		sc.close();

	}

}
