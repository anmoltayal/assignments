class Staticblock
{
  static 
  {
   System.out.println("Inside The Static");
  }
 public static void main(String args[])
 {
  System.out.println("Inside the main block");       
 }                                         
 static 
  {
   System.out.println("outside the static");
  }
}
