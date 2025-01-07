package Day01;

import java.util.Scanner;

public class Sum_of_1st_N_Natural_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//enter values
		System.out.println("Enter the positive integer N: ");
		int N=sc.nextInt();
				
				if(N<=0) {
					System.out.println("please enter a positive integer greater then zero.");
				}else {
					//Calculate 1st N natural number
					int sum =(N*(N+1))/2;  //Formula
					System.out.println("The sum of the First " +N + " natural number is: "+ sum);
				}
				
		sc.close();
	}

}
