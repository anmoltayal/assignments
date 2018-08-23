import java.util.Scanner;
class Rectangle
{
    
    public static void main(String args[])
    {  
       int n1,n2;
       System.out.println("Enter length and breath of rectangle");
       Scanner sc = new Scanner(System.in);
       n1=sc.nextInt();
       n2=sc.nextInt();
       Rect a = new Rect();
 
    System.out.println("Area is " +a.ar(n1,n2));
    }
    static int ar(int n1,int n2)
    {
      int n3;
      n3=n1*n2;
      return num3;
}
}