import java.util.Scanner;

class remove
{
   public static void main(String args[])
   {
       String st, stnew;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter the string : ");
       st = sc.nextLine();
       
       stnew = st.replaceAll("[aeiouAEIOU]","");
	   
       System.out.println("the string after removing all vowels is : ");
              
       System.out.print(stnew);
   }
}