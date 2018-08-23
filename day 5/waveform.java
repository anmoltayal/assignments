import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Waveform
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  {
   int length;
   Wave ob=new Wave();
   System.out.println("Enter length");
   length=sc.nextInt();
   int[] a=new int[length];
    
   for(int i=0;i<length;i++)
   {
    System.out.println("Enter values"+(i+1));
	a[i]=sc.nextInt();
   }
   Arrays.sort(a); 
   for(int i=0;i<length-1;i=i+2)
   {
	   ob.swap(a,i,i+1);
   }
    System.out.println("After operation ");
   for(int i=0;i<length;i++)
   {
    System.out.println(a[i]);
   }    
  }
 }
 void swap(int a[],int b,int c)
   {
	    int temp= a[b];
		a[b]=a[c];
		a[c]=temp;
   }
}