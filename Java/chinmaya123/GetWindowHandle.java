package chinmaya123.chinmaya123;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	 String windowid = driver.getWindowHandle();
	 System.out.println(windowid);
	
	 driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	 
	 Set<String> windowids = driver.getWindowHandles();
	 
		//First Iterator
	 
	 Iterator<String> it = windowids.iterator();
	 
	 String ParentwindowID = it.next();
	 String ChildwindowID = it.next();
	 
	 System.out.println("parent window id is: "+ParentwindowID);
	 System.out.println("Child window id is: "+ChildwindowID);
		
		
		for(String winId : windowids)
			
		{
			//System.out.println(winId);
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
		}
		
	 for(String winId : windowids)
			{
				String title = driver.switchTo().window(winId).getTitle();
				if(driver.equals("orangeHRM"))
				
					driver.close();
				
			}
		
		
	}

}
