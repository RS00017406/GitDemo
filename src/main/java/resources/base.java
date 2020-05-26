package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
    public Properties prop;
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Ronali\\eclipse-workspace\\javanewproject\\Browser\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		prop.getProperty("browser");
		prop.getProperty("url");
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C://Users//Ronali//Desktop//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (browserName == "firefox") {

		} else if (browserName == "Edge") {

		}
		
		
		
return driver;
	}

}
