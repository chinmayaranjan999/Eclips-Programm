package chinmaya123.chinmaya123;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li//button[@class='btn btn-ohrm btn-contact-sales']")).click();
		
		//String Windowid = driver.getWindowHandle();
		
		//System.out.println(Windowid); //[CDwindow-697C7EFD96E6AD5878DADBB5BFFC604F]
		Set<String> windowids = driver.getWindowHandles(); //By using iterator 
		
		//Anather method using list/ Arraylist
		
		List<String>windowidLists = new ArrayList(windowids);// convert set to list
		
	for(String winids : windowidLists)	
	{
		System.out.println(winids);
		String title = driver.switchTo().window(winids).getTitle();
		System.out.println(title);
	}
	//if i want to close selected browser then
	
	for(String winids : windowidLists)	
	{
		String title = driver.switchTo().window(winids).getTitle();
		if(title.equals("OrangeHRM"))
		{
			driver.close();
		}	
	}
		//driver.close();  //it will close single browser window
		
		//driver.quit(); //it will close all browser window
		
		
		
		
		
		
	}

}
