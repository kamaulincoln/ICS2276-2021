package employees;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	public BasePlusCommissionEmployee(String name, String iDNumber,
			double grossSales, double commissionRate, double baseSalary) {
		super(name, iDNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public double earnings() {
		return super.earnings() + baseSalary;
	}
	@Override
	public String toString() {
		return super.toString() + "\nBase salary: "+ baseSalary;
		//String.format("Employee name: %s %nEarnings %.2f",getName(),earnings());
	}
}
