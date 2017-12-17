
public class Employee {

	private String empID;
	private String empPass;
	private String phoneNum;
	
	
	public Employee(String empID, String empPass, String phoneNum) {
		super();
		this.empID = empID;
		this.empPass = empPass;
		this.phoneNum = phoneNum;
	}
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
	
}
