import java.util.Scanner;
import java.lang.Math;
class Armstrong 
{
    public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        double  num, number, temp, sum = 0,n=0;
		System.out.print("Enter the number :");
		num=sc.nextDouble();
        number = num;
		 while (number != 0)
		{
        number =number/ 10;
        ++n;
		}
		number = num;
        while (number != 0)
        {
            temp = number % 10;
            sum = sum + (Math.pow(temp,n));
            number =number/ 10;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
		
    }
}