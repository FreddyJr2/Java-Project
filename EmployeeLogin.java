import java.util.Scanner;

public class EmployeeLogin extends Salesman {

	public EmployeeLogin(String phoneNum, String salesmanID, String salesmanPass) {
		super(phoneNum, salesmanID, salesmanPass);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String empID;
		String empPass;
		
		Salesman Freddy = new Salesman("305-000-000", "Freddy", "password");
		Administrator John = new Administrator("John", "password2");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your user name and password.");
		
		empID = input.nextLine();
		empPass = input.nextLine();
		
		if(empID.equals(Freddy.getSalesmanID()) && empPass.equals(Freddy.getSalesmanPass())) {
			System.out.println("Welcome " + Freddy.getSalesmanID());
			
		}else if(empID.equals(John.getAdminID()) && empPass.equals(John.getAdminPass())) {
			System.out.println("Welcome admin " + John.getAdminID());
		}else {
			System.out.println("Access denied");
		}
		
		System.out.println(Freddy);
		
		
		
	}

	
}


