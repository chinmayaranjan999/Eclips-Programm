package chinmaya123.chinmaya123;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInOut {

	public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver", "path");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String zoom = "document.body.style.zoom='20%'";
//		js.executeScript(zoom);
		js.executeScript("document.body.style.zoom='80%'");
		
		
		
		
		
		
		
	}

}
