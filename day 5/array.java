import java.util.Scanner;
import java.util.Arrays;

class Ar
{
	public void Second_largest()
	{
		Scanner sc= new Scanner(System.in);
		int x=10,temp;
		System.out.println("enter the no of elements :");
		x=sc.nextInt();
		int[] arr= new int[x];
		for(int i=0;i<=x;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=x;i++)
		{
			for(int j=i+1;j<=x;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.print("second last element of the array is "+arr[x-2]);
	}
	public static void main(String args[])
	{
		Ar a=new Ar();
		a.Second_largest();
	}
}