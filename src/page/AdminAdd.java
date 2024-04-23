package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.WebDriverFactory;

public class AdminAdd {
	
	@FindBy(xpath =" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	WebElement userRoleCombo;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	WebElement empName;
	
	@FindBy( xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement userName;
	
	@FindBy(xpath =" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	WebElement statusCombo;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement confirmPass;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement saveBtn;
	
	public AdminAdd() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public AdminAdd addAdmin() {
		Select role =new Select(userRoleCombo);
		role.selectByIndex(0);
		
		empName.sendKeys("Odis  Adalwin");
		userName.sendKeys("sampleqw");
		
		Select status = new Select (statusCombo);
		status.deselectByIndex(0);
		
		pass.sendKeys("sample@123");
		confirmPass.sendKeys("sample@123");
		saveBtn.click();
		
		return this;
	}
	
}
