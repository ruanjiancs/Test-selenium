package BaiduTestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaiduPageClass.publicTest;

public class testCase {
	private static final String URL="http://www.baidu.com/";
	private WebDriver driver;
	private publicTest page;
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\BaiduYunDownload\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		page = new publicTest(driver,URL);
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	@Test
	public void testSearch(){
		assertEquals(true, page.SearchTest("searchTest"));
	}
	@Test
	public void testPageLoading(){
		assertEquals(true,page.isLoade());
	}
	@Test
	public void testTitle(){
		assertEquals(true, page.getTitle());
	}
	
}
