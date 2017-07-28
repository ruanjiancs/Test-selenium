package BaiduPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasicSeleniumTest {
	private WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","D:\\BaiduYunDownload\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
