package Text;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webDriverFactory.ChromeDriverManger;
import webDriverFactory.DriverManagerFactory;
import webDriverFactory.DriverManger;

public class NewTest {
	WebDriver driver;
	DriverManger manager;

	@Test
	public void test1() {

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("nidaye");

		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("nidaye");

	}

	@BeforeMethod
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shawn\\eclipse-workspace\\Test-01\\src\\test\\resources\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		
		manager = new ChromeDriverManger();
		driver = manager.createDriver();
		
	
		String url = "http://automationpractice.com/";
	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@AfterMethod
	public void close() {
		driver.close();
	}


}
