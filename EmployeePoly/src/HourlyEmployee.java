
public class HourlyEmployee extends Employee{
	double hourlyRate;
	double hoursWorked;
	public HourlyEmployee(String name2, double hourlyRate, double hoursWorked) {
		super(name2);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override //Overrides class Employee
	public String toString() {
		return String.format("%s %nEarnings %.2f",
				super.toString(),earnings());
	}
	@Override
	public double earnings() {
		double pay = 0.0;
		if(hoursWorked < 40) {
			pay = hourlyRate*hoursWorked;
		}else {
			pay = 40*hourlyRate+(hoursWorked-40)*1.5*hourlyRate;
		}
		return pay;
	}
	

}
