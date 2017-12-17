import java.util.Scanner;

public class EmployeeLogin {

	private static boolean accessGranted;
	private static boolean adminAccess;
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empUsername;
		String empPass;
		
		Employee Freddy = new Employee("Freddy Ramirez", "password", "305-000-0000");
		Administrator John = new Administrator("John Smith", "Smith");
		input = new Scanner(System.in);
		
		empUsername = input.nextLine();
		empPass = input.nextLine();
		
		if(empUsername.equals(Freddy.getEmpID()) && empPass.equals(Freddy.getEmpPass())){
			System.out.println("Welcome " + Freddy.getEmpID());
			accessGranted = true;
			adminAccess = false;
		}else if(empUsername.equals(John.getAdminID()) && empPass.equals(John.getAdminPass())){
			System.out.println("Welcome admin " + John.getAdminID());
			adminAccess = true;
			accessGranted = false;
		}else{
			System.out.println("Access denied.");
		}
		
	}

}
