package chinmaya123.chinmaya123;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	private static String url;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.orangehrm.com/");
		
		List <WebElement> ele = driver.findElements(By.tagName("a"));
		
		System.out.println(ele.size());
		
		int brokenlink = 0;
		
		for(WebElement links : ele)
		{
			String url = links.getAttribute("href");
			if(url==null  || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
		}
		try
		{
			URL link = new URL(url);
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			httpconn.connect();
			if(httpconn.getResponseCode()>=400)
			{
			System.out.println(httpconn.getResponseCode()+url+ "is broken link");
			brokenlink++;
			}
			else
			{
				System.out.println(httpconn.getResponseCode() + url + " is valid link ");
			}
		} 
		
		catch (Exception e) {
			
		}
		
		System.out.println("number of broken links are: " +brokenlink);
		
	
		
	}

}
