package Day01;

import java.util.Scanner;

public class Sum_of_digits_of_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//enter the number
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int sum=0;
		
		//use a loop to extract digits and calculated the sum
		int temp = Math.abs(number); // to handle negative numbers
		while(temp>0) {
			sum+=temp%10; //add last digit of the sum
			temp /=10; //remove the last digit
		}
		
		//result
		System.out.println("The sum of the digits of " + number + " is: "+ sum);
		sc.close();
	}
	
}
