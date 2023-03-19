package chinmaya123.chinmaya123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String date="5";
		String month="January";
		String Year="2023";
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		//String Mon_Year = driver.findElement(By.xpath("//td[text()='Dec 2022']")).getText();
		//System.out.println(Mon_Year);
		
		while(true)
		{
			String Mon_Year = driver.findElement(By.xpath("//td[text()='Dec 2022']")).getText();

			String arr[] = Mon_Year.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equals(month) && yr.equals(Year))
			break;
			
			else
			{
				driver.findElement(By.xpath("//td[@class='next']//button")).click();
			}
		}
		Thread.sleep(5000);
		
		// Date selection
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement w:dates)
		{
			String dt=w.getText();
			if(dt.equals(date))
			
				w.click();
				break;
			
		}
		
		
		
		
		
	}

}
