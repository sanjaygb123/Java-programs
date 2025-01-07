package Day01;

import java.util.Scanner;

public class Prime_Number_within_a_given_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int upperLimit =sc.nextInt();
		
		System.out.println("Prime number is upto " + upperLimit+ ":");
		
		for(int i=2; i<=upperLimit; i++) {
			if(isPrime(i)) {
				System.out.println(i+ " ");
			}
		}
		sc.close();

	}
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(num);i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

}
