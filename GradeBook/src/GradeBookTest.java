import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		double[] marks = { 98.0, 85.5, 99.3, 12.4, 43.6,
				22.2, 70.2, 29.4, 12.0};
		GradeBook cp2 = new GradeBook("Computer Programming II",
				marks);
		//cp2.display();
		String unit2 = "Electromagnetics I";
		double[] marks2 = new double[5];
		Scanner in = new Scanner(System.in);
		System.out.printf("%nEnter the marks for %d students",marks2.length);
		for(int i = 0; i<marks2.length; i++) {
			marks2[i] = in.nextDouble();
		}
		GradeBook em1 = new GradeBook(unit2,marks2);
		//em1.display();
		
		GradeBook[] units = new GradeBook[2];
		units[0] = cp2;
		units[1] = em1;
		
		for(GradeBook g: units) {
			g.display();
		}
		
	}

}
