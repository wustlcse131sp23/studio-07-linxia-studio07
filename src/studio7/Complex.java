package studio7;

public class Complex {
	
	private double real;
	private double imaginary;
	
	public Complex(double r, double i) {
		real = r;
		imaginary = i;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public String toString() {
		return real + "+" + imaginary + "i"; 
	}
	
	public Complex add(Complex c) {
		Complex c2 = new Complex(real + c.getReal(),imaginary + c.getImaginary());
		return c2;
	}
	
	public Complex multiply(Complex c) {
		double r = real*c.getReal()-imaginary*c.getImaginary();
		double i = real*c.getImaginary() + imaginary*c.getReal();
		Complex c2 = new Complex(r,i);
		return c2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2,3);
		Complex c2 = new Complex(2,-4);
		System.out.println(c1);
		System.out.println(c1.add(c2));
		System.out.println(c1.multiply(c2));

	}

}
