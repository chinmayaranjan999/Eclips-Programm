package chinmaya123.chinmaya123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.gingersoftware.com/grammarcheck");
		
		Thread.sleep(3000);
		
		//TakeScreenshot ts = (TakeScreenshot)driver;
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//File trg = new File("C:\\Users\\chinm\\OneDrive\\Desktop\\Screenshot\\chinmaya.png");
		//FileUtils.copyFile(src, trg);
		
	WebElement ele=	driver.findElement(By.xpath("//div[@class='slide-1']//div[@class='gc-banner-carousel__get-live-corrections__banner']"));
	File src = ele.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\Users\\chinm\\OneDrive\\Desktop\\Screenshot\\portion.png");
	FileUtils.copyFile(src, trg);
	
	
	File src = ((TakeScreenshot)driver).getscreenshotAs(OutputType.FILE);
	
	
		
	}


	}


