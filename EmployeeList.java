import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class EmployeeList extends Salesman{

	public EmployeeList(String phoneNum, String salesmanID, String salesmanPass) {
		super(phoneNum, salesmanID, salesmanPass);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileOutputStream fstream = new FileOutputStream("Employee List.txt");
	DataOutputStream outputFile = new DataOutputStream(fstream);	
	
	ArrayList<Salesman> SalesmanList = new ArrayList<Salesman>();
	SalesmanList.add(new Salesman("305-111-111", "John", "pass"));
	
	Scanner keyboard = new Scanner(System.in);
	
	
	
	
	for(int i=0; i < SalesmanList.size(); i++) {
	
		SalesmanList.add(new Salesman(salesmanID, salesmanPass, phoneNum));
	}
	
	
	
	

System.out.println(SalesmanList);
		
		
	}

}
