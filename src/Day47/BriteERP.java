package Day47;

import java.time.LocalDateTime;

public class BriteERP {
	
	static{
		System.out.println("Lounch browser");
		System.out.println("Navigate to "+TestData.url);
		
		
	}
	public static void enterEmail() {
		System.out.println("Enter email: "+TestData.email );
		
		
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: "+TestData.password);
		
	}
	
	public static void verifyLogin() {
		System.out.println("Expected Name: " + TestData.UserName);
		System.out.println("Actual Name displayed: Viktoriia Lugovska");
		System.out.println("Login Successful - " + LocalDateTime.now());
	}

}
