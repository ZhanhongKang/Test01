package webDriverFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeDriverManager extends DriverManger {

	String edgeeDriver = "webdriver.edge.drive";
	String depath = "C:\\Users\\Shawn\\eclipse-workspace\\Test-01\\src\\test\\resources\\chromedriver.exe";
	
	public EdgeDriverManager() {
		System.setProperty(edgeeDriver,depath);
	}
	
	
	@Override
	public void createDriver() {
		// TODO Auto-generated method stub
		setDriver(new ChromeDriver());
	}
}
