package chinmaya123.chinmaya123;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickDrpdwn {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		Select mnth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		mnth.selectByIndex(11);
		
		Select yr = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yr.selectByValue("2021");
		
		// Date selection
		
		String Date = "15";
		
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//td"));
		
		for(WebElement ele: alldates)
		{
			String dt=ele.getText();
			if(dt.equals(Date))
			{
				ele.click();
				break;
			}
		}
		
		
		
		
		
	}

}
