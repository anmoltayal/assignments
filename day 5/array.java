import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Array
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  {
   int length;
   System.out.println("Enter length of the Array");
   len=sc.nextInt();
   int[] a=new int[length];
   for(int i=0;i<length;i++)
   {
    System.out.println("Enter values"+(i+1));
	a[i]=sc.nextInt();
   }
   Arrays.sort(a);
   sc.close();
   System.out.println("After Sorting the Array ");
   for(int i=0;i<len;i++)
   {
    System.out.println(a[i]);
   }
   System.out.println("Second Highest Element of the Array is : "+a[a.length-2]);
   
  }
 }
}