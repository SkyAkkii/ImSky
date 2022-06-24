package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {

    public static  WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\petka\\OneDrive\\Desktop\\chromedriver.exe");
	     WebDriver obj =new ChromeDriver();
	     obj.get("https://kite.zerodha.com/");
	     return obj;
    
    
    }
	
	
}
