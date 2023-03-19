package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebtable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rows = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody//tr")).size();
		System.out.println("Rows  in table are: "+rows);
		
		int cols = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody//th")).size();
		System.out.println("cols in table are:  "+cols);
		
		
		
	}

}
