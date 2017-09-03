package myPack;
import java.util.*;

public class Multiple {
	
	void mult(int x)
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(x+"*"+i+"=" +x*i);
		}
	}

	public static void main(String[] args) {
		
		Scanner digi= new Scanner(System.in);
		System.out.println("The number is: ");
		int a=digi.nextInt();
		Multiple ml=new Multiple();
		ml.mult(a);
		
	}

}
