import java.util.Scanner;
class maximum
{
	public static void main(String args[])
	{
		String s1;
		String s2;
		System.out.println("enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		Integer x=Integer.valueOf(s1);
		Integer y=Integer.valueOf(s2);
		Integer z=x>y?x:y;
		System.out.println("maximum no. is: "+z);
	}
}