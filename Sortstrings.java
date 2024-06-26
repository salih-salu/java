import java.util.*;
class Sortstrings
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array:");
  int n=sc.nextInt();
    sc.nextLine();
  String[] arr=new String[n];

  System.out.println("Enter the elements:");
  for(i=0;i<arr.length;i++)
  {
  arr[i]=sc.nextLine();
  }
  System.out.println("Array elements are:");
  for(i=0;i<arr.length;i++)
  {
   System.out.println(arr[i]);
   }
   System.out.println("Array elements after sorting:");
   Arrays.sort(arr);
   System.out.println(Arrays.toString(arr));
   }
   }
