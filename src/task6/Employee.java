package task6;

public class Employee {
	
	private int id;
	private String firstName;
	private int salary;


	public void setId(int id) {
		this.id = id;
	}
	public int getid() {
		return id;
	}
	public void setName1(String name) {
		this.firstName = name;
	}
	public String getName1() {
		return firstName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	 public int getAnnualSalary() {
	       return salary * 12;
	   }
	public int raiseSalary(int percent) {
		salary=salary*12; // Annual salary calculation
		salary = salary + salary * percent/100;
		return salary;
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName1("Chandra Shekar");
		emp.setSalary(1000);
		System.out.println("Empmploye id-> "+emp.getid()+" Name->"+emp.getName1()+" Monthly salary-> "+emp.getSalary());
		System.out.println("Annual Salary: " + emp.getAnnualSalary());
		System.out.println("Increased slary by 10 percent-> "+emp.raiseSalary(10));
	}

}



