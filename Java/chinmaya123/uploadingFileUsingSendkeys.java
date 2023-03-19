package chinmaya123.chinmaya123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadingFileUsingSendkeys {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.foundit.in/seeker/profile?application_source=organic&apop=my-profile");
		
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("chinmaya.ranjan999@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("linku164");
		driver.findElement(By.xpath("//div[@class='form-control signInbtnCont']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='mqfi-upload']")).click();
		
		Thread.sleep(3000);
		WebElement button= driver.findElement(By.xpath("//input[@id='resume']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", button);
		
		
		//By using sendkeys method
		
		//driver.findElement(By.xpath("//input[@id='resume']")).sendKeys("Desktop\\chinmaya resume-.pdf");
		
		//if type=file attribute is available in html dom then we are using sendkeys method
		// else we are using robot class method
		
		//Robot class method
		
		//1- copy the path
		//2- ctrl+v
		//3- enter
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//put path to file in a clipboard
		
		StringSelection ss = new StringSelection("E:\\Chinmaya Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.delay(2000);
		//ctrl+v
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
