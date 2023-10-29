package assesment_Java;
import java.util.Scanner;
public class Binary
{
    public static void main(String[] args) 
{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String b=sc.nextLine();
        int dec=binaryToDecimal(b);
        System.out.println("Decimal Value: "+dec);
}
public static int binaryToDecimal(String binary) 
{
        int deci=0;
        int l=binary.length();
        for(int i=0;i<l;i++) 
	{
            int bit=Character.getNumericValue(binary.charAt(i));
            deci+= bit*Math.pow(2,l-1-i);
        }
        return deci;
}
}
