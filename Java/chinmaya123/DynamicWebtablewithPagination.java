package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtablewithPagination {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.manage().deleteAllCookies();

driver.manage().window().maximize();

driver.get("https://www.opencart.com/");

driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']//a[text()='Login']")).click();

WebElement element = driver.findElement(By.id("input-email"));
		
	element.clear();
	element.sendKeys("chinmayaranjan93@gmail.com");
	
	WebElement ele = driver.findElement(By.id("input-password"));
	ele.clear();
	ele.sendKeys("linku164");
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
	
	// Find exact word
	
	String Text = driver.findElement(By.xpath("")).getText();
	System.out.println(Text); // Full Text
	
	//Index of()
	//substring()
	
	
	
	
	}

}
