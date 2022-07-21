import java.util.Scanner;
public class Main
{
   public static void main(String[]args)
   {
     System.out.println("Enter the 3 numbers:");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     //logic for largest of 3;
     if(a>b) {
         if (a > c) {
             System.out.println(a + " is larges");
         } else {
             System.out.println(c + " is larges");
         }

     }else if(b>c) {
         System.out.println(b + " is larges");
     }else {
         System.out.println(c + " is larges");
     }

   }
   }
