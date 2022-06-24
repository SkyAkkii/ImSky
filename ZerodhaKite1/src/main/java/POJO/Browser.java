package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openBrowser(String url) { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\petka\\OneDrive\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();// upcastingChrome driver class to webdriver
    driver.get(url);//method of webdriver interface
    driver.manage().window().maximize();
		return driver;
	}

	

}
