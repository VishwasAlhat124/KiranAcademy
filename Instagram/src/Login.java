
public class Login {
	
	public static void main(String[] args) {
		
		Instagram Insta = new Instagram();
		
		System.out.println("Correct Username is: "+Insta.Uname);
		System.out.println("Correct Password is: "+Insta.Upass);
		
		System.out.println("Cross Check Credentials");
		Insta.checkLogin();
	}

}
