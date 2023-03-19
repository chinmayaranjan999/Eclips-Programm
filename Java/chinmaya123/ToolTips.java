package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTips {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.get("https://jqueryui.com/tooltip/");
		
//		WebElement ele = driver.findElement(By.xpath("//a[text()='ThemeRoller']"));
//		
//		String TooltipText = ele.getAttribute("title");
//		System.out.println(TooltipText);
		
		// By Using Keys Class
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		String Tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Contact Sales")).sendKeys(Tab);
		
		
	}

}
