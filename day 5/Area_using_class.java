import java.util.Scanner;
class Rectangle
{
	static float length,breadth,area;
	public void CalculateArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle : ");
		length=sc.nextFloat();
		System.out.print("Enter the breadth of the rectangle :  ");
		breadth=sc.nextFloat();
		area=length*breadth;
		System.out.print("the area of the rectangle is "+area);
	}
	public static void main(String args[])
	{
		Rectangle rec = new Rectangle();
		rec.CalculateArea();
	}
}