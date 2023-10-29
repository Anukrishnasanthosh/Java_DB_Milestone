package assesment_Java;

import java.util.Scanner;
public class Power
{
    public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
        int base=sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp=sc.nextInt();
        int r= calculatePower(base, exp);
        System.out.println("Result: "+ r);
}
public static int calculatePower(int base,int exp) 
{
    if(exp==0) 
    {
     return 1;
    } 
    else if(exp>0) 
    {
     return base*calculatePower(base,exp-1);
    } 
    else 
    {
     return 1/(base*calculatePower(base,-exp-1));
    }
}
}



