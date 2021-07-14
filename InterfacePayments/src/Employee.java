
public abstract class Employee implements Payable {
	public String name;
	
	public Employee(String name2) {
		name = name2;
	}
	public String getName() { return name;	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Name: %s ", name);
	}
	
}
