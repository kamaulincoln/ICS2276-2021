

public class CommissionEmployee extends Employee{

	private String IDNumber; 
	protected double grossSales;
	protected double commissionRate;
	public CommissionEmployee(String name, String iDNumber, double grossSales, double commissionRate) {
		super(name);
		IDNumber = iDNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public String getIDNumber() { return IDNumber;	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	public double getGrossSales() {	return grossSales;	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {	return commissionRate;	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public double earnings() {
		return grossSales*commissionRate;
	}
	@Override //Overrides class Employee
	public String toString() {
		return String.format("%s %nEarnings %.2f",
				super.toString(),earnings());
	}

}
