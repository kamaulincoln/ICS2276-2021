
public class GradeBook {
	private String unit;
        private double[] grade;
	 
	public GradeBook(String unit, double[] grade) {
		this.unit = unit;
		this.grade = grade;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double[] getGrade() {
		return grade;
	}
	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	public double getMaximum() {
		double max = grade[0];
		for(int i=1;i<grade.length;i++) {
			if(grade[i]>max) {
				max = grade[i];
			}
		}		
		return max;
	}
	public double getMin(){
		double min = grade[0];
		for (int i= grade.length -1; i>=0; i--) {
			if(grade[i]<min) {
				min= grade [i];
			}
			}
		return min;
		}
	
	public double getAverage() {
		double total = 0.0;
		//Enhanced for loop.
		/*for(int i=0;i<grade.length;i++) {
			total+=grade[i];
		}*/
		for(double i: grade) {
			total += i;
		}
		return total/grade.length;
	}
	public void display() {
		System.out.printf("%nUnit name: %s "
				+ "%nThe maximum value is %.2f"+
				"%nThe minimum value is %.2f"+
				"%nThe average is %.2f",
				unit, this.getMaximum(), 
				this.getMin(), this.getAverage());
		
	}

}
