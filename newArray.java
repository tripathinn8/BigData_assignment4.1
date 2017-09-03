package myPack; 
import java.util.*;

public class newArray {

	public static void main(String[] args) {
		int[] x= {2,1,9,99,5,7};
		int temp;
		int n=x.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n;j++)
			{
				if(x[i]<x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
		}
		for (int p=0;p<n;p++)
		{
System.out.println("The descending order is"+ x[p]);
		}
	}

}
