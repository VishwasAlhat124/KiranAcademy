import java.util.Scanner;

public class Instagram {
	
	Scanner sc = new Scanner(System.in);
	String Uname = "vish124";
	String Upass = "Vish@124";
	
	void checkLogin() {                       // Login Check operation
		
	System.out.println("Enter Username: " );
	String Un1 = sc.nextLine();
	
	System.out.println("Enter Password: ");
	String Up2 = sc.nextLine();
	
	if (Uname.equals(Un1) && Upass.equals(Up2)) {
		System.out.println("Logged in Sucessfully..!");
	
	}
	else {
		System.out.println("Ivalid credentials...!");
	}
		
	}

}
