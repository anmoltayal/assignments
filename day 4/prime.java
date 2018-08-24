import java.util.Scanner;
class Primenum
{
 public static void main(String args[])
 {
  int number,count=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number:");
  number=sc.nextInt();
  for(int i=2;i<number;i++)
	{ 
		for(int j=2;j<number;j++) 
		{
			if(j%i==0)
			{
				count=count+1;
			}
			if (count ==0)
			{
				System.out.println(j);
			}
		}
	}	
 }
}