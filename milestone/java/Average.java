package assesment_Java;

import java.util.*;

public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0;
		 
		System.out.println("enter the no of Elements :");
		int n=sc.nextInt();
		System.out.println("enter the Elements :");
		double a[]=new double[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();  
		
		}
		for(int i=0;i<n;i++)
			
		{
			 total=total+a[i];
		
		}
		double max=a[0];
		double secondMax=0;
		for(int i=0;i<n;i++)
		{
			if (a[i]>max)
			{
				secondMax=max;
				max=a[i];
			}
			
		}
		double snd=(double)secondMax;
		System.out.println("second maximum is: "+snd);
		
	
		System.out.println("average is "+total/n);
		
	}
}
