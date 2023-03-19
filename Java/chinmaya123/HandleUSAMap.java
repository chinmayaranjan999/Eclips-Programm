package chinmaya123.chinmaya123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleUSAMap {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		//Thread.sleep(5);
		
		String state="FLORIDA";
		
		
		
		
		
		
		
		
	}

}
