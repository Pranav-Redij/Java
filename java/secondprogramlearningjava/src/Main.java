//addition of two number
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        System.out.println("enter the two values:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of"+a+" and "+b+" is:"+c);
    }
}