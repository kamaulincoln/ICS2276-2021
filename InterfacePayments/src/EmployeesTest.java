public class EmployeesTest {
	public static void main(String[] args) {

		Payable payableObjects[] = new Payable[4];
		payableObjects[0] = new Invoice("001", 5,1000.0);
		payableObjects[1] = new Invoice("002", 10,6000.0);
		payableObjects[2] = new SalariedEmployee("Joshua", 100000);
		payableObjects[3] = new SalariedEmployee("James", 20000);
		
		for(Payable e: payableObjects) {
			System.out.println("\n"+e.toString());
			}
		System.out.println();
		
		//Get type name for objects
		for(int j = 0; j<payableObjects.length; j++) {
			System.out.println("Entity "+(j+1)+" is a "+
					payableObjects[j].getClass().getName());
		}
	}
}
