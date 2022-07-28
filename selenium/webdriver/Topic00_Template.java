package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Topic00_Template {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	


	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
			}

	@Test
	public void TC_01_() {
		driver.get("https://www.facebook.com/");
		
	}

	@Test
	public void TC_02_() {
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
