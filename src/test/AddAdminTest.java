package test;

import org.testng.annotations.Test;

import page.LoginPage;

public class AddAdminTest {
	
	@Test
	public void addAdmin(){
		LoginPage lp= new LoginPage();
		lp.loginSuccess("Admin", "admin123")
		.admin().addAdmin();
		
	}

}
