package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=account/edit&member_token=f5d50403aca0afbaf998da47b9cd8397");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chinmayaranjan93@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("linku164");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='panel panel-default']//a[@href='#collapse-menu0']")).click();
		driver.findElement(By.xpath("//a[@data-original-title='Edit your account details']")).click();
		
		Select sel = new Select(driver.findElement(By.xpath("input-country")));
		sel.selectByIndex(4);  // American Samoa
		
		
	}

}
