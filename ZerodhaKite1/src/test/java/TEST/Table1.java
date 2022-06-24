package TEST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;

public class Table1 {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize =column.size();
		System.out.println(columnsize);
		
		List<WebElement> rows =driver.findElements(By.xpath("//table//tbody//tr"));
		int rowsize =rows.size();
		
		
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table//tbody//tr//th[4]"));
	     
		for (int i =0 ; i<currentPrice.size() ;i++ )
		{
			WebElement price =currentPrice.get(i);
			String currentPriceValue =price.getText();
			System.out.println(currentPriceValue);
			
			
		}
	
	
	}

}
