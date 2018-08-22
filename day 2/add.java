import java.util.Scanner;
class Add
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double s,a,b;
	System.out.println("Enter any two numbers :");
	a=sc.nextDouble();
	b=sc.nextDouble();
	s=a+b;
	System.out.println("Sum of numbers is: "+s);
}
}