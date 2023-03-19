package chinmaya123.chinmaya123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActMultipleKeys {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		input1.sendKeys("Jay Puri Jagannath");
	    WebElement input2 =	driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	    
	    
	
		Actions act = new Actions(driver); //here we pass the driver instance.
		
		//ctrl+A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl+c
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//press Tab
		
		act.sendKeys(Keys.TAB);
		act.perform();  //for complete the action we are using perform method.
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();  //perform method internally calling build().perform().
		
		// compare Text
		if(input1.getAttribute("value") .equals (input2.getAttribute("value")))
		
			System.out.println("Text is copied");
		
		else
		
			System.out.println("Text is not copied");
		
	// the return type of build method is action but it will not perform the action
	// build method is create the action.
	// perform method is complete the action
		
	}

}
