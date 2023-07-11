package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="input-email")
	WebElement emailfield;
	
	@FindBy(id="input-password")
	WebElement passwordfield;
	
	@FindBy(css="input[value='Login']")
	WebElement loginBtnfield;

	public WebElement getemailField() {

		return emailfield;
	}
	
	public WebElement getpasswordField() {
		
		return passwordfield;
	}
	
	public WebElement getloginBtnField() {
		
		return loginBtnfield;
	}

}
