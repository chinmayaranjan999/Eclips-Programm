package chinmaya123.chinmaya123;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");	
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='gLFyf']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
		
		List<WebElement> alllist = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
	    System.out.println("Total number of size are: "+alllist.size());
	   
	   for(WebElement ele : alllist)
	   {
		   if(ele.getText().contains("webdriver"))
		   {
			   ele.click();
			   break;
		   }
	   }
		
	
	}

}
