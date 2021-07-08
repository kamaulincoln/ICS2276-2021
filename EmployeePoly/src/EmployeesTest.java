

public class EmployeesTest {

	public static void main(String[] args) {
		CommissionEmployee e1 = new CommissionEmployee("James",
				"3154331",100000,0.1);
		BasePlusCommissionEmployee e2 = new BasePlusCommissionEmployee("Judy",
				"3013353",50000,0.07, 50000);
		SalariedEmployee e3 = new SalariedEmployee("Jill", 60000.0);
		HourlyEmployee e4 = new HourlyEmployee("Jack", 1000, 50);
		/*System.out.printf("%ne1 is %s",e1);
		System.out.printf("%ne2 is %s",e2);
		System.out.printf("%ne3 is %s",e3);
		System.out.printf("%ne4 is %s",e4);*/
		
		Employee employees[] = new Employee[4];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;
		
		double totalPay = 0.0;
		
		for(Employee e: employees) {
			System.out.println("\nEmployee: "+e.toString());
			if(e instanceof SalariedEmployee) {
				//((SalariedEmployee) e).setSalary(1.1*((SalariedEmployee) e).getSalary());
				//e.setSalary.(1.1*e.getSalary());
				SalariedEmployee emp = (SalariedEmployee) e;
				emp.setSalary(1.1*emp.getSalary());
			}
			System.out.println("Employee (new): "+ e.toString());
			
			totalPay += e.earnings();
		}
		System.out.println("Total pay = "+totalPay);
		System.out.println();
		
		//Get type name for objects
		for(int j = 0; j<employees.length; j++) {
			System.out.println("Employee "+(j+1)+" is a "+
					employees[j].getClass().getName());
		}
	}
}
