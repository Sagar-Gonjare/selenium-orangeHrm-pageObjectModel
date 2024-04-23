package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {
	@AfterMethod
	public void afterEveryMethod() {
		//WebDriverFactory.getDriver().quit();
	}
	@BeforeMethod
	public void beforeEveryMethod(){
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverFactory.setDriver(driver);
		WebDriverFactory.getDriver().manage().window().maximize();
		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
	
	
	}
}
