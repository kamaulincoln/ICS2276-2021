package employees;

public class CommissionEmployee {
	private String name; 
	private String IDNumber; 
	protected double grossSales;
	protected double commissionRate;
	public CommissionEmployee(String name, String iDNumber, double grossSales, double commissionRate) {
		this.name = name;
		IDNumber = iDNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public String getName() { return name;	}
	public void setName(String name) {
		this.name = name;
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
	@Override //Overrides class object
	public String toString() {
		return String.format("Employee name: %s %nEarnings %.2f",
				name,earnings());
	}

}
