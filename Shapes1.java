package mypack;
import graphics.Shapes1;
import java.util.*;
class Shapes1
{
  public static void main(String args[])
  {
    Shapes1 obj = new Shapes1();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length:");
    int l=sc.nextInt();
    System.out.println("enter breadth:");
    int b=sc.nextInt();
    System.out.println("Area of rectangle:"+obj.Rect_area(l,b));
    System.out.println("enter length of square:");
    int s=sc.nextInt();
    System.out.println("Area of square:"+obj.Square_area(s));
    System.out.println("enter base length:");
    float base=sc.nextFloat();
    System.out.println("enter heigth:");
    float h=sc.nextFloat();
    System.out.println("Area of triangle:"+obj.Tri_area(base,h));
    System.out.println("enter radius:");
    double r=sc.nextDouble();
    System.out.println("Area of circle:"+obj.Circ_area(r));
  }
}   
