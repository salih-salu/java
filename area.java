import java.util.*;
class areaa
{
 void area(int x)
 {
  System.out.println("area of circle is "+3.14*x*x+" sq.cm");
 }
 void area(int x,int y)
 {
  System.out.println("area of rectangle is "+x*y+" sq.cm");
 }
 void area(double x)
 {
  System.out.println("area of square is: "+x*x+" sq.cm");
  }
 }
 
 class area
 {
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  areaa obj=new areaa();
  System.out.println("Enter the radius of the circle:");
  int r=sc.nextInt();
  obj.area(r);
  
  System.out.println("Enter the length of rectangle:");
  int l=sc.nextInt();
  System.out.println("Enter the breadth of rectangle:");
  int b=sc.nextInt();
  obj.area(l,b);
  
  System.out.println("Enter the side of square:");
  double s=sc.nextDouble();
  obj.area(s);
  }
}
