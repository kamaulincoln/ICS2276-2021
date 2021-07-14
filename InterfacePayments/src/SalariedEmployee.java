
public class SalariedEmployee extends Employee {
	double salary;
	public SalariedEmployee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	public double getSalary() {	return salary; }
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double getPayableAmount() {
		return salary;
	}
	@Override //Overrides class Employee
	public String toString() {
		return String.format("%s %nEarnings %,.2f",
				super.toString(),getPayableAmount());
	}
}
