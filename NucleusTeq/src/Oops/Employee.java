package Oops;

//Write a Java program to illustrate the concept of Encapsulation.

    class Employee {
	
	private String name;
	private long Emp_Id;
	private String password;
	private long salary;
	private String Phone;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(long emp_Id) {
		Emp_Id = emp_Id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	

}
