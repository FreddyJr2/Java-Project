
public class Salesman extends Administrator{
	protected static String phoneNum;
	protected static String salesmanID;
	protected static String salesmanPass;

	
	
	public Salesman(String phoneNum, String salesmanID, String salesmanPass) {
		super(salesmanPass, salesmanPass);
		this.phoneNum = phoneNum;
		this.salesmanID = salesmanID;
		this.salesmanPass = salesmanPass;
	}
	
	
	
	public String getSalesmanID() {
		return salesmanID;
	}
	public void setSalesmanID(String salesmanID) {
		this.salesmanID = salesmanID;
	}
	public String getSalesmanPass() {
		return salesmanPass;
	}
	public void setSalesmanPass(String salesmanPass) {
		this.salesmanPass = salesmanPass;
	}
	public String getPhoneNum() {
		
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}



	@Override
	public String toString() {
		return "Salesman [getSalesmanID()=" + salesmanID + ", getSalesmanPass()=" + salesmanPass
				+ ", getPhoneNum()=" + phoneNum + "]\n";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
