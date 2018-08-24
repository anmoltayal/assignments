import java.util.Scanner;
class Complex 
{
	static int x,y;
	public void Display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the real part : ");
		x=sc.nextInt();
		System.out.print("Enter the Imaginary part : ");
		y=sc.nextInt();
		System.out.print(x+"+"+y+"i");
		}
		public static void main(String args[])
		{
			Complex c=new Complex();
			c.Display();
		}
}