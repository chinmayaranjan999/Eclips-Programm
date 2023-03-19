package chinmaya123.chinmaya123;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleExample {

	public static void main(String[] args) {

 
		WebDriverManager.chromedriver().setup();
		System.setProperty("Webdriver.chrome.driver", "  ");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    driver.get("");
		
		Select sel = new Select(driver.findElement(By.xpath("")));
		sel.selectByVisibleText(" ");
		
		String date = "";
		String Year = "";
		String Month = "";
		
		while(true)
		{
			String mon_year = driver.findElement(By.xpath("")).getText();
			
			String arr[]= mon_year.split(" ");
			String mon = arr[0];
			String year = arr[1];
			
			if(mon.equals(month)  && year.equals(year))
			break;
			else
			{
				driver.findElement(By.xpath("   ")).click();
				
			}
				
			Thread.sleep(2000);
			
			List<WebElement> ele = driver.findElements(By.xpath(" "));
			System.out.println(ele.size());
			
			for(WebElement dat : ele)
			{
				String dt = dat.getText();
				if(dt.equals(date))
					
					dat.click();
				break;
			}
			
		}
		
		
	}

}
