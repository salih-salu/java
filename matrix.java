import java.util.*;
class matrix
{
 public static void main(String args[])
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter the number of rows:");
  int n1=ob.nextInt();
  System.out.println("Enter the number of columns:");
  int n2=ob.nextInt();
  int a[][]=new int[n1][n2];
  int b[][]=new int[n1][n2];
  int c[][]=new int[n1][n2];
  System.out.println("Enter the first matrix:");
 
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
    a[i][j]=ob.nextInt();
    }
   }
    System.out.println("Enter the second matrix:");
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
    b[i][j]=ob.nextInt();
    }
  }
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
    c[i][j]=a[i][j]+b[i][j];
    }
  }
 
  System.out.println("The sum matrix is:");
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
   
  System.out.print(c[i][j]+"\t");
  }
  System.out.println();
  }
}
}
