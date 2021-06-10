
public class ComplexTest {
	public static void main(String[] args) {
		Complex z1 = new Complex(1,1); //Instantiate an object
		Complex z2 = new Complex(3,4);
		Complex z3 = z1.add(z2); //;z3 = (2+3)+i(1+4)=5+5i
		System.out.printf("z1 is %s",z1.toString());
		System.out.printf("%nz2 is %s %nz3 is %s", z2,z3);
		z2.setImag(-4);
		System.out.printf("%nz2 is now %s",z2);
		Complex z4 = z1.multiply(z2);
		System.out.printf("%nz4 is %s",z4);
		System.out.printf("%nMagnitude for z1 is %f %nAngle(z1) = %f"
				,z1.magnitude(),z1.angle());
		z1.displayPolar();
		Complex z5 = new Complex(5.0);
		z5.displayPolar();
		
	}
}
