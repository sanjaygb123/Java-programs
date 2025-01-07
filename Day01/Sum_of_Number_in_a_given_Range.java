package Day01;

import java.util.Scanner;

public class Sum_of_Number_in_a_given_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start of the range: ");
		int start =sc.nextInt();
		
		System.out.println("Enter the end of the range: ");
		int end = sc.nextInt();
		
		if(start > end) {
			System.out.println("Invalid range! start should be less than or equal to end.");
			
		}else {
			int sum = 0;
			for(int i = start; i <= end; i++) {
				sum += i;
				
		}
		System.out.println("The sum of number from " + start + " to " + end + " is: " + sum);

	}
sc.close();
}
}