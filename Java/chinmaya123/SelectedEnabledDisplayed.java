package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectedEnabledDisplayed {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	WebElement element=	driver.findElement(By.xpath("//input[@class='gLFyf']"));
		
	System.out.println("Display element is:"+element.isDisplayed());	
	System.out.println("Enable element is:"+element.isEnabled());
	
	//----isSelected()-------
	
	driver.navigate().to("https://designsystem.digital.gov/components/radio-buttons/");
		
	WebElement ele=driver.findElement(By.xpath("//label[@for='historical-truth']"));
	ele.click();
	
	System.out.println(ele.isSelected());
		
		
		
		
		
	}

}
