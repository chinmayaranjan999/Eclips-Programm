package chinmaya123.chinmaya123;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardIntraction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.SHIFT).perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.CONTROL).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.BACK_SPACE).perform();  // here keys is a class.
		
		
		
		
		
	}

}
