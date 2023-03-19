package chinmaya123.chinmaya123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.xdevapi.Statement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseTesting {

	public static void main(String[] args) {
		
		String Cust_Username="chinmaya_ranjan999";
		String Cust_Firstname="chinmaya";
		String Cust_Lastname="Sahoo";
		String Cust_Email="Chinmaya.ranjan999@gmail.com";
		String Cust_Country="India";
		String Cust_Password="Linku@164";
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']//a[contains(text(),'Register')]")).click();
		
		driver.findElement(By.name("username")).sendKeys(Cust_Username);
		driver.findElement(By.name("firstname")).sendKeys(Cust_Firstname);
		driver.findElement(By.name("lastname")).sendKeys(Cust_Lastname);
		driver.findElement(By.name("email")).sendKeys(Cust_Email);
		driver.findElement(By.name("country_id")).sendKeys(Cust_Country);
		driver.findElement(By.name("password")).sendKeys(Cust_Password);
		
		//driver.findElement(By.xpath("//*[@id=\"captcha-image\"]/ul/li[1]/a/img")).click();
		driver.findElement(By.xpath("//div[@id='button-register']")).click();
		
		//Sometimes app is not running properly or if any issue is in application then it will through Exception.
		//To handle this exception we are using  try catch block.
		
		try
		{
			String confmsg = driver.findElement(By.xpath("//h3[contains(text(),'Welcome to OpenCart, your account has been created')]")).getText();
			
			if(confmsg.equals("Welcome to OpenCart, your account has been created"))
			{
				System.out.println("Registrations msg is valid");
			}
			else
			{
				System.out.println("Registrations msg is not valid");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Some problem i the application");
		}
		
		//Database Connection
		//Established the connection
		// By using con obj we can execute script
		
		Connection con = DriverManager.getConnection("");
		
		Statement stmt = con.createStatement();
		String query = "Select firstname,lastname,email,Telephone from oc_customer";
		
		ResultSet rs = stmt.executeQuery(query);
		
		boolean Status = false;
		
		while(rs.next())
		{
			String firstname = rs.getString("firstname");
			String Lastname = rs.getString("lastname");
			String email = rs.getString("email");
			String telephone = rs.getString("telephone");
			
			if(Cust_Firstname.equals(firstname)  &&  Cust_Lastname.equals(Lastname)  && Cust_Email.equals(email))
			{
			
				System.out.println("Record found in table  || Test passed");
				Status =true;
				break;
			}
			
			if(Status==false)
			{
				System.out.println("Records are not found || Test failed");
			}
			{
				
			}
			
			
		}
		
		
		

	}

}
