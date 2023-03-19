package chinmaya123.chinmaya123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURLiTtwoTabs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Jai_Jagannatha");
		// driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //available on selenium 4 onwards
		
		driver.get("https://www.gingersoftware.com/grammarcheck");
		
	
		
		
		
	}

}
