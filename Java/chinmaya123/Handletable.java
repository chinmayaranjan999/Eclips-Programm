package chinmaya123.chinmaya123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handletable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		  int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		  int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<=colCount;j++)
			{
				String actValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]")).getText();
				if(actValue.equals("Canada"))
				{
					System.out.println(i+":"+j);
					break;
				}
			}
		}
		
		
		
		
		
		
		
	}

}
