import java.util.Scanner;
class Complex {
	
    public double  real;
    public double imag;

    public Complex(double real,double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String args[])
	{
	    double a,b,x,y;
	    System.out.println("Enter 2 value for first part");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter 2 value for other part");
		x=sc.nextInt();
		y=sc.nextInt();
        Complex m1 = new Complex(a,b);
        Complex m2 = new Complex(x,y);
        Complex temp;

        temp = add(m1, m2);

        System.out.println("Sum of real no is = "+temp.real);
		System.out.println("Sum of imag no is = "+temp.imag+"i");
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0, 0);

        temp.real = m1.real + m2.real;
        temp.imag = m1.imag + m2.imag;

        return(temp);
    }
}