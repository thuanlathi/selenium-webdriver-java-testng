package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Topic03__XPath_CSS_Part_I {
	
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
		
		//HTML Format
		/*<input class="text form-control" 
		 *id="txtEmail" 
		 *name="txtEmail" 
		 *placeholder="Địa chỉ email" 
		 *type="email" value="">*/
		
		//cần chú ý:
		//1 - Thẻ mở: < hoặc <>
		
		//2- Tên thẻ (tagname): input, div...
		
		//3 - Thuộc tính (attribute): class, id, name, placeholder, type
		
		//4 - giá trị của thuộc tính (value): "text form-control",...
		
		//5  - Thẻ đóng: > hoặc </>
		
		
		
		
		
		
		
	}

	@Test
	public void TC_02_() {
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
