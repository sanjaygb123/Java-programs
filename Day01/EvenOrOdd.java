package Day01;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		//enter the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer");
		int number = sc.nextInt();
		
		//check even or odd
		if(number%2==0) {
			System.out.println(number+ " is even");
		}else {
			System.out.println(number+" is Odd");
		}
		
		sc.close();  //close
	}

}
