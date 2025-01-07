package Day01;

import java.util.Scanner;

public class Greatest_of_3_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//enter the 3 Numbers
		System.out.println("Enter the 1st Number");
		int num1 =sc.nextInt();
		
		System.out.println("Enter the 2nd Number");
		int num2 =sc.nextInt();
		
		System.out.println("Enter the 3rd Number");
		int num3 =sc.nextInt();
		
		
		//find greatest
		int greatest;
		if(num1 >= num2 && num1 >=num3) {
			greatest =num1;
		}else if(num2 >= num1 && num2 >=num3) {
			greatest = num2;
		}else {
			greatest =num3;
		}
		
		System.out.println("The greatest is: "+greatest);
		
		sc.close();

	}

}
