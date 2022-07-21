import java.util.Scanner;
class Pen
{
  String color;
  String type;
  public void write()
  {
    System.out.println("write something");
  }
  public void print()
  {
    System.out.println(this.color);
    System.out.println(this.type);
  }
  Pen()
  {
    System.out.println("constructor is called");
  }
}
public class Main
{
  public static void main(String[]args)
  {
    Pen p1=new Pen();
    p1.color="red";
    Scanner sc=new Scanner(System.in);

    p1.type="gel";
    p1.write();
    p1.print();
    Pen p2=new Pen();
    p2.color="black";
    p2.type="ball";
    p2.print();
  }
}