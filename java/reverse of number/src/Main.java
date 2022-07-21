import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
        {
            System.out.println("enter the number:");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("reverse of  the number is:");
            int n1=n;
            int l,sum=0;
            while(n>0)
            {
                l=n%10;
                sum=sum*10+l;
                n=n/10;
            }
            System.out.println("reverse of "+n1+" is "+sum);
        }
}