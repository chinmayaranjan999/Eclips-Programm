package chinmaya123.chinmaya123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		//4.0.8  selenium version in pom.xml
		//--headless
		//--headless=new
		//--headless=chrome
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
