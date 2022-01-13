package webDriverFactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManger {
	private WebDriver dirver;
	
	public abstract void createDriver();
	
	public WebDriver getDriver() {
		if (this.dirver ==null)
			throw new RuntimeException ("Driver not started");
		
		return this.getDriver();
	}
	
	public void setDriver(WebDriver targetDrvire) {
		this.dirver = targetDrvire;
			
	}
	public void quitDriver() {
		this.dirver.quit();
		this.dirver = null;
	}

}
