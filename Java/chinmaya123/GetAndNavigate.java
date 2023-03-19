package chinmaya123.chinmaya123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAndNavigate {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.indiapost.gov.in/_layouts/15/DOP.Portal.Tracking/TrackConsignment.aspx");
//		driver.navigate().forward();
//		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
	
	}

}
