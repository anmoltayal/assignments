import java.util.Scanner;
class Reverse
{
 public static void main(String args[])
 {
  int a,temp=0,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number to reverse:");
  a=sc.nextInt();
  while(a>0)
  {
   b=a%10;
   temp=temp*10+b;
   a=a/10;
  }
  System.out.println("the reversed number is "+temp);
 }
}