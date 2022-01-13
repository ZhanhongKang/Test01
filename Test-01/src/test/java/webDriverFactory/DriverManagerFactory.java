package webDriverFactory;

public class DriverManagerFactory {

	
	public static DriverManger getManager(String drivertype) {
		     
		if (drivertype.equals("chrome"))
			return new ChromeDriverManger();
		if (drivertype.equals("edge"))
			return new EdgeDriverManager();
		
		throw new IllegalArgumentException();
		
	}
}
