package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	@FindBy(xpath="//input[@type='text']")private WebElement username;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@class='text-light forgot-link']") private WebElement forget;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signUp;
	@FindBy(xpath="(//span[@class='su-message'])[1]")private WebElement error;
	
	
	public ZerodhaLoginPage(WebDriver obj) {
		PageFactory.initElements(obj, this);
	}
	public void enterUsername(String user) {
		username.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forget.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	public String getText() {
		String text = error.getText();
		return text;
	}
	
	
	
	
	
}
