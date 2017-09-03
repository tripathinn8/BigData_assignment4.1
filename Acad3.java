package myPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Acad3 {

	void num()
	{
		int a,b;
		Scanner digi= new Scanner(System.in);
		System.out.println("First number is: ");
		a=digi.nextInt();
		System.out.println();
		System.out.println("Second number is: ");
		b=digi.nextInt();
		for(int i=a; i<b;i++)
		{
			if(i%2==0)
			{
				System.out.println("The number "+i+ " is even");
			}
			else
			{
				System.out.println("The number "+i+ " is odd");
			}
		}
	}
	
	public static void main(String[] args) {
		Acad3 ac=new Acad3();
		ac.num();		
	
	}

}
