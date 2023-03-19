package chinmaya123.chinmaya123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		//driver.findElement(By.xpath("//input[@value='red']")).click();
		
		List<WebElement> alllists = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Number of checkbox is: " +alllists.size());
		
		//  print all values 
		
//		for(WebElement ele : alllists)
//		{
//		  String texts= ele.getAttribute("value");
//			
//			System.out.println(texts);
//			
//		}
		// select perticular checkbox
		
		for(WebElement ele : alllists)
		{
			String chkboxname = ele.getAttribute("Value");
			if(chkboxname.equals("Green") || chkboxname.equals("Red"))
			{
				ele.click();
			}
		}
		
		
		
	}

}
