package chinmaya123.chinmaya123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captureonly70 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Up to 70% off | Shoes & handbags')]"));
		System.out.println(ele.getText());
		
		//indexof()
		//substring()

		//String word = text.substring(text.indexOf("-")+1,text.indexOf("off")-1);
		String word = text.substring(text.indexOf("to")+1,text.indexOf("off")-1);
		
				//Up to 70% off | Shoes & handbags
		System.out.println(word);
		
		
		
	}

}
