package test;

import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest {
	
	@Test
	public void loginSuccess() {
		LoginPage lp= new LoginPage();
		lp.loginSuccess("Admin", "admin123");
	}

}
