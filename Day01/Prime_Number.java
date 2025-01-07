package Day01;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//Enter the Number
		System.out.println("enter a number");
		int number =sc.nextInt();
		
		//check number is prime
		if(isPrime(number)) {
			System.out.println(number+ " is a prime Number");
		}else {
			System.out.println(number+ " is not a prime number");
		}
		
		sc.close();
		
	}
	
	//method check number is prime
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i =2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
