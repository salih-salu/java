import java.util.*;
class Transpose
{
 public static void main(String args[])
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter the number of rows:");
  int n1=ob.nextInt();
  System.out.println("Enter the number of columns:");
  int n2=ob.nextInt();
  int a[][]=new int[n1][n2];
  int b[][]=new int[n2][n1];
  
  System.out.println("Enter the first matrix:");
 
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
    a[i][j]=ob.nextInt();
    }
   }
   System.out.println("The matrix is:");
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
   
  System.out.print(a[i][j]+"\t");
  }
  System.out.println();
  }
  System.out.println("The transpose of matrix is:");
  for(int i=0;i<n2;i++)
  {
    for(int j=0;j<n1;j++)
    {
   
  System.out.print(b[j][i]+"\t");
  }
  System.out.println();
  }
  for(i=0;i<n1;i++)
  {
   for(j=0;j<n2;j++)
   {
  if(a[i]==b[j])
  {
  System.out.println("symmetric");
  }
  else
  {
  System.out.println("Not symmetric");
  }
  }
  }
}
