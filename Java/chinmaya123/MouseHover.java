package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
	WebElement ele=	driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement element = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).moveToElement(element).click().build().perform();
		
		
		
		
	}

}
