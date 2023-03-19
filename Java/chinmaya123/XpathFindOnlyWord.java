package chinmaya123.chinmaya123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFindOnlyWord {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'50% - 80% off | Styles for Women')]"));
		String text = element.getText();
		
		System.out.println(text);
		
		//text.indexof()
		//text.Substring()
		
		String word = text.substring(text.indexOf("-")+1,text.indexOf("off")-1);
		System.out.println(word);
		
		
	}

}
