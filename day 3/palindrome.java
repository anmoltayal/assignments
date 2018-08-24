import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
 {
  int a,b,temp,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  a=sc.nextInt();
  temp=a;
  while(a>0)
  {
    b=a%10;
	sum=sum*10+b;
	a=a/10;
  }
  if(temp==sum)
  {
   System.out.println(temp+" is a palindrome number");
  }
  else
  {
   System.out.println("No it is not a palindrome number");
  }
 }
}