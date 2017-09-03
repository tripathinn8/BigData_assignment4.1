package myPack;

public class Sum {
	void sum1(int a,int b)
	{
	System.out.println(a+b);
	}

	void sum1(double a,double b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		Sum x=new Sum();
		x.sum1(2, 3);
		Sum y=new Sum();
		y.sum1(2.3,5.6);
	}

}
