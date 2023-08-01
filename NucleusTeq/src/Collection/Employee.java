package Collection;

public class Employee implements Comparable<Employee> {

	public Employee(int emp_Id, String name, String phone) {
		// TODO Auto-generated constructor stub
		
		this.emp_Id = emp_Id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int compareTo(Employee o) { 
		// TODO Auto-generated method stub
		
		return this.emp_Id-o.emp_Id;
	}

	private int emp_Id;
	private String name;
	private String phone;

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", phone=" + phone + "]";
	}

}
