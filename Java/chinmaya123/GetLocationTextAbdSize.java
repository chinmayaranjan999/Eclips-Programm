package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocationTextAbdSize {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement logo =driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
		//Location - method 1
		
		System.out.println("Location(x,y):"+logo.getLocation());
		System.out.println("Location(x):"+logo.getLocation().getX());
		System.out.println("Location(y): "+logo.getLocation().getY());
		
		//method 2  getRect method returns the rectangular object
		
		System.out.println("Location(x):"+logo.getRect().getX()); 
		System.out.println("Location(y): "+logo.getRect().getY());
		
		//size - method 1
		
		System.out.println("size(width,Height):" +logo.getSize());
		System.out.println("size(width):" +logo.getSize().getWidth());
		System.out.println("size(Height):" +logo.getSize().getHeight());
		
		driver.close();
		
		
		
	}

}
