import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class EmployeeList extends Salesman{

	public EmployeeList(String phoneNum, String salesmanID, String salesmanPass) {
		super(phoneNum, salesmanID, salesmanPass);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "Employee List Input.txt";
		
		throws IOException {
			String str = "World";
			BufferedWriter writer = new BufferedWriter(new FileWriter("Employee List Input.txt", true));
			writer.append(' ');
			writer.append(str);
			
			
			writer.close
			
			
		}
		
		
		
		
		
	
		
		
		/*
	FileOutputStream fstream = new FileOutputStream("Employee List Input.txt");
	DataOutputStream outputFile = new DataOutputStream(fstream);
	outputFile.writeUTF(salesmanID);
	
	ArrayList<Salesman> SalesmanList = new ArrayList<Salesman>();
	SalesmanList.add(new Salesman("305-111-111", "John", "pass"));
	
	Scanner keyboard = new Scanner(System.in);
	
	//12salesmanID = outputFile.write("Employee List Input.txt");
	salesmanPass = keyboard.nextLine();
	phoneNum = keyboard.nextLine();
	
	
	
//	for(int i=0; i < SalesmanList.size(); i++) {
	
		//SalesmanList.add(new Salesman(salesmanID, salesmanPass, phoneNum));
	//}
	
	
	*/
	

//System.out.println(SalesmanList);
		
		
	}

}
