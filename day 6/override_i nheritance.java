class animal
{
 void speak()
 {
  System.out.println(" Inside the Animal class ");
 }
}
class dog extends animal
{
 void speak()
 {
 System.out.println(" Inside the dog class ");
 }
} 
class cat extends animal
{
 void speak()
 {
 System.out.println(" Inside the cat class ");
 }
}
class override
{
 public static void main(String args[])
 {
  cat c = new cat();
  c.speak();
  dog d = new dog();
  d.speak();
 }
}