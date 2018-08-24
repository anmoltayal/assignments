import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int a,i,count=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number : ");
  a=sc.nextInt();
  for(i=2;i<a;i++)
  {
   if(a%i==0)
   {
    count=count+1;
   }
  }
  if(count>0)
  {
   System.out.println("it is not prime number");
  }
  else if(count ==0)
   {
   System.out.println("it is prime number");
   }
  
 }
}