package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POJO.Browser1;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import UTILITY.ExcelSheet;

public class LoginPInTest2Assert {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver =Browser1.openBrowser();
	}
	
	@Test
	public void loginTOZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnLogin();
		
		String userName = ExcelSheet.getData("AP",0, 1);
		String password = ExcelSheet.getData("AP",1, 1);
		zerodhaLoginPage.enterUsername(userName);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		
		Thread.sleep(3000);
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		String pin = ExcelSheet.getData("AP",2, 1);
		System.out.println(pin);
		zerodhaPinpage.enterPin(pin, driver);
		zerodhaPinpage.clickOnContinue();
		
	}

}
