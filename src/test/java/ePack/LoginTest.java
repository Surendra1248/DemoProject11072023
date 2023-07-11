package ePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import objectRepository.MyAccountPage;

public class LoginTest {
	WebDriver driver;
	@Test
	public void login() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPage lp= new LoginPage(driver);
		lp.getemailField().sendKeys("phaniatw2@gmail.com");
		lp.getpasswordField().sendKeys("atw@123");
		lp.getloginBtnField().click();
		
		MyAccountPage map = new MyAccountPage(driver);
		Assert.assertTrue(map.geteditaccinfoField().isDisplayed());
	}
	@AfterMethod
	public void closure() {
		driver.quit();
	}

}
