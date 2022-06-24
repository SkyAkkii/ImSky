package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
	
	@FindBy(xpath ="//input[@type='password']") private WebElement pin;
	@FindBy(xpath ="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath ="//a[@class='text-light forgot-link']")private WebElement forget;
	@FindBy(xpath ="//a[@class='text-light']")private WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String pinNumber,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));//Explicit wait
		wait.until(ExpectedConditions.visibilityOf(pin));//will recheck th element in 500ms
		pin.sendKeys(pinNumber);
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	public void clickOnForget() {
		forget.click();
	}
	public void clickOnSignup() {
		signup.click();
	}
}