import java.util.Scanner;

public class reverse
{
    public static void main(String[] args)
    {
        System.out.println("enter the string: ");

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(st);
        
        System.out.println("reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}