package chinmaya123.chinmaya123;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en");
				
		//driver.manage().deleteAllCookies();
		
		//capture cookies from browser
		
		Set<Cookie> cookies  =driver.manage().getCookies();
		System.out.println("size of cookies is: "+cookies.size());
		
		// How to print cookies from browser
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());

		}
        //how to add cookies in the browser		
		Cookie cookiesobj = new Cookie("linku123", "jamuna789");
		driver.manage().addCookie(cookiesobj);
		
		cookies = driver.manage().getCookies();
		System.out.println("size of cookie after adding: "+cookies);
		
		// how to delete specific cookie
		
		driver.manage().deleteCookieNamed("linku123");
		
		
		
		
		//how to delete all cookies
		
		driver.manage().deleteAllCookies();
		
	}

}
