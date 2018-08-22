import java.util.Scanner;
class Biggest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter three numbers :");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(a>b && a>c)
			System.out.println("Biggest of three number is :"+a);
		else if (b>a && b>c)
			System.out.println("Biggest of three number is :"+b);
		else if(c>a && c>b)
			System.out.println("Biggest of three number is :"+c);
	}
}
			