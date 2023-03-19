package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		//driver.get("https://www.javatpoint.com/features-of-testng");
		
		//driver.get("http://mrbool.com/");
		
		//  Mousehover
		
		//Actions action = new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Single Videos')]")).click();
		
		//Drag and drop
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		//action2.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(( By.xpath("//div[@id='droppable']")).release().build().perform();
		
		 action2.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

		 
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("  "))).build().perform();
//		
//		Actions acti = new Actions(driver);
//		acti.clickAndHold(driver.findElement(By.xpath("  "))).moveToElement(driver.findElement(By.xpath(" "))).relese().build().perform();
		 
		 
	}

}
