import java.lang.Math;
public class Complex {
	/* This is the code for the class example.
	 * Test it on your computer.
	 * Include the following methods
	 *  conjugagte, divide and reciprocate 
	 * */
	private double real;
	private double imag;
	
	public Complex (double real, double imag) {
		this.real = real;
		this.imag = imag;
		}
	public Complex(double real) {
		this(real,0.0);
	}
	public Complex() {
		this(0.0,0.0);
		
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getReal() {
		return real;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public double getImag() {
		return imag;
	}
	public Complex add(Complex c) {
		//Complex z1 = new Complex(2,1);
		//Complex z2 = new Complex(3,4);
		//Complex z3 = z1.add(z2); ;z3 = (2+3)+i(1+4)=5+5i
		double r,i;
		r = real+c.getReal();
		i = imag+c.getImag();
		Complex ans = new Complex(r,i);
		return ans;
		//return new Complex(real+c.getReal(),imag+c.getImag());
		
	}
	public Complex subtract(Complex c) {
		return new Complex(real-c.getReal(),imag-c.getImag());
	}
	public Complex multiply(Complex c) {
		double r,i;
		r = real*c.getReal()-imag*c.getImag();
		i = real*c.getImag()+imag*c.getReal();
		return new Complex(r,i);
	}
	public double magnitude() {
		return Math.sqrt(real*real+imag*imag);
	}
	public double angle() {
		return Math.toDegrees(Math.atan2(imag , real));
	}
	public String toString() {
		if(imag>=0) {
			return String.format("%f + %fj", real,imag);
		}
		else
			return String.format("%f %fj", real,imag);
		//return String.format("%f %s %fj",(imag>=0?"+":""),
		//		real,imag);
	}
	public void displayPolar() {
		System.out.printf("%nr = %f, theta = %f",magnitude(),angle());
	}
}
