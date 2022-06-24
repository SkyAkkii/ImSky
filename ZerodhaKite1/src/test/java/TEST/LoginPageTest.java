package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.BaseTest;
import POJO.Browser1;
import POM.ZerodhaLoginPage;
import UTILITY.ExcelSheet;
import UTILITY.Report;



public class LoginPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		reports = Report.createReport();
		
	}
	
	@BeforeMethod
	public void Browser() {
		driver = Browser1.openBrowser();
		
	}
	
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException {
		test = reports.createTest("loginWithValidCredentialsTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String user = ExcelSheet.getData("AP", 0, 1);
		String pass = ExcelSheet.getData("AP", 1, 1);
		zerodhaLoginPage.enterUsername(user);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
	}
	@Test
		public void forgetPasswordLinkTest() {
		 test = reports.createTest("forgetPasswordLinkTest");
		 ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		 zerodhaLoginPage.clickOnForgot();
//		 String text = zerodhaLoginPage.getText();
//			String expectedtext = "User ID should be minimum 6 characters.";
//			Assert.assertEquals(text, expectedtext);
	}
	@Test(dependsOnMethods = {"clickOnLoginWithoutDataTest"})
	public void signupLinkTest() {
		test = reports.createTest("forgetPasswordLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();
	}
	@Test
	
	public void clickOnLoginWithoutDataTest() throws EncryptedDocumentException, IOException {
		test = reports.createTest("clickOnLoginWithoutDataTest");
		ZerodhaLoginPage zerodhaLoginPage =new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnLogin();
		String text = zerodhaLoginPage.getText();
		String expectedText = "User ID should be minimum 6";
		//Assert.assertEquals(text, expectedText);// Hard Assert
		SoftAssert softAssert = new SoftAssert ();
		softAssert.assertEquals(text, expectedText);
		
		String user = ExcelSheet.getData("AP", 0, 1);
		String pass = ExcelSheet.getData("AP", 1, 1);
		zerodhaLoginPage.enterUsername(user);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		
		softAssert.assertAll();
	}
	@AfterMethod
	public void closeBrowser (ITestResult result) {
		
		if (result.getStatus()== ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}else if (result.getStatus()== ITestResult.SUCCESS) {
			test.log(Status.SKIP, result.getName());
		}
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
		
	}
	
}
