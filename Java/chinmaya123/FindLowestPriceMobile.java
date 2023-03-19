package chinmaya123.chinmaya123;

import java.util.List;
import java.util.Map.Entry;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLowestPriceMobile {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme phone");
			
		driver.findElement(By.id("nav-search-submit-button")).click();
			
List<WebElement> Allpricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		System.out.println("Size of the Mobile is: "+Allpricelist.size());	
		
		double minvalue=1000000.0;
		double maxvalue=0.0;		
		
		for(WebElement w: Allpricelist)
		{
			//System.out.println(w.getText().replaceAll(",", ""));
			
			String str = w.getText();
			String s2 = str.replace(",", ".");
			// toString() return a string representation of an object.
			
			double d  = Double.parseDouble(s2);
			System.out.println("Realme price is :"+d);
			
			if(minvalue >= d)
			{
				minvalue =d;
			}
			else if(maxvalue<=d)
			{
				maxvalue = d;
			}
			
		}
		System.out.println("Max value is:"+maxvalue);
		System.out.println("Min value is :"+minvalue);
		
		
	}

}
