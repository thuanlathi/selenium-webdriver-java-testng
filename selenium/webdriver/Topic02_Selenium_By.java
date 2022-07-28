package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Bước 1: Mở browser lên
//Bước 2: Nhập vào URL
//Bước 3: Click vào My Account để mở trang log in ra
//Bước 4: Click Login
//Bước 5: Verify lỗi hiển thị
//Bước 6: Đóng browser

public class Topic02_Selenium_By {
	//Khai báo 1 biến để đại diện cho thư viện Selenium Webdriver
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	


	@BeforeClass
	public void beforeClass() {
		//Bước 1: Mở browser lên
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
			}

	@Test
	public void TC_01_() {
		//Bước 2: Nhập vào URL
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		
		//Bước 3: Click vào My Account để mở trang log in ra
		
		          //Tìm 1 element
		          //driver.findElement(By.)
		
                  //Tìm nhiều element
                  //driver.findElements(null)
		
		
		
		
		
		
		// ID
		driver.findElement(By.id("email"));
		
		//class
		driver.findElement(By.className("validate-email"));
		
		//name
		driver.findElement(By.name("login[username]"));
		
		//Tagname - tìm xem có bao nhiêu element trên page
		driver.findElement(By.tagName("a"));
		
		//Partial_Link_Text - truyền hết tên link
		driver.findElement(By.linkText("SEARCH TERMS"));
		
		//name - truyền 1 phần tên link
		driver.findElement(By.partialLinkText("Search"));
		
		//CSS - giống xpath nhưng không chưa ký tự đặc biệt
		driver.findElement(By.cssSelector("input[title='Email Address']"));
		
		//Xpath
		driver.findElement(By.xpath("//input[@title='Email Address']"));
		
		
		
		
		
	}

	@Test
	public void TC_02_() {
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
