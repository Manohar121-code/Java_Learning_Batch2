package part3.collections.ArrayList;

public class Employee {
	private int empId;
	private String empName;
	private int phone;
	private String email;

	public Employee(int empId, String empName, int phone, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phone = phone;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phone=" + phone + ", email=" + email + "]";
	}

}
