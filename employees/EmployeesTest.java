package employees;

public class EmployeesTest {

	public static void main(String[] args) {
		CommissionEmployee e1 = new CommissionEmployee("James",
				"3154331",100000,0.1);
		BasePlusCommissionEmployee e2 = new BasePlusCommissionEmployee("Judy",
				"3013353",50000,0.07, 50000);
		System.out.printf("%ne1 is %s\n\ne2 is %s",e1,e2);
	}
}
