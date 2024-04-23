package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {
	
	
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement userName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	//@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	//@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement errorMsg;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span")
	WebElement requiredErrorMsg;
	
	public LoginPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public HomePage loginSuccess(String strUserName , String strPassword) {
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginBtn.click();
		
		//Assert.assertEquals(HomePage.dashboard.isDisplayed(), true);
		return new HomePage();
		
	}
	public LoginPage blankUsernamePassword() {
		userName.clear();
		password.clear();
		loginBtn.click();
		Assert.assertEquals(requiredErrorMsg.isDisplayed(), true);
		return this;
	}
	public LoginPage wrongUsernameOrPassword(String strUserName , String strPassword) {
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginBtn.click();
		Assert.assertEquals(errorMsg.isDisplayed(), true);
		return this;
	}
}
