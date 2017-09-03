package myPack;

import java.util.*;

public class Acad1 {

	public static void main(String[] args) {
		
		Scanner digi= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=digi.nextInt();
		System.out.println();
		System.out.println("Enter the second number");
		int b=digi.nextInt();
		System.out.println();
		int sum=a+b;
		System.out.println("The sum of the two numbers is: "+sum);
	}

}
