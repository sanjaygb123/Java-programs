package Day01;

import java.util.Scanner;

public class Leap_year_or_not {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//enter year
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		
		//check if the year is a leap year
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+ " ia a laep year");
		}else {
			System.out.println(year + " is not leap year");
		}
		
		sc.close();
	}

}
