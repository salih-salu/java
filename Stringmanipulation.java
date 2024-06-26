import java.util.*;
class Stringmanipulation{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a string:");
     String s1=sc.nextLine();
     String s1lower=s1.toLowerCase();
     System.out.println("lower case:"+s1lower);
     String s1upper=s1.toUpperCase();
     System.out.println("Upper case:"+s1upper);
     System.out.println("substring:"+s1.substring(1,5));
     System.out.println("Length of the string is:"+s1.length());
   }
 }    
