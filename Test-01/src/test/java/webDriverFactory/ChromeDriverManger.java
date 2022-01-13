package webDriverFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManger extends DriverManger {

	private String chromeDriver = "webdriver.chrome.drive";
	private String chromepath = "C:\\Users\\Shawn\\eclipse-workspace\\Test-01\\src\\test\\resources\\chromedriver.exe";
	
	public ChromeDriverManger() {
		System.setProperty(chromeDriver,chromepath);
	}
	
	
	@Override
	public void createDriver() {
		// TODO Auto-generated method stub
		setDriver(new ChromeDriver());
		
	}
	
	
	
	

}
