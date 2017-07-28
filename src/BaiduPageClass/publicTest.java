package BaiduPageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class publicTest {
	public static class Contants{
		public static final String TITLE = "百度一下，你就知道";
		public static final String search_bar_id="kw";
		public static final String search_box_id="kw";
		public static final String search_button_name="su";
	}
	private WebDriver driver;
	private String url;
	
	public publicTest(WebDriver driver,String url){
		this.driver = driver;
		this.url = url;
		this.driver.get(this.url);
	}
	//获取页面的标题
	public String getTitle(){
		return this.driver.getTitle();
	}
	//检测页面是否加载，判断页面title是否相等
	public boolean isLoade(){
		System.out.println(this.getTitle());
		return publicTest.Contants.TITLE.equals(this.getTitle());
	}
	//输入关键字进行搜索操作，根据页面title验证页面是否跳转成功
	public boolean SearchTest(String key_word){
		this.driver.findElement(By.id(publicTest.Contants.search_bar_id)).click();
		this.driver.findElement(By.id(publicTest.Contants.search_box_id)).clear();
		this.driver.findElement(By.id(publicTest.Contants.search_box_id)).sendKeys(key_word);
		this.driver.findElement(By.id(publicTest.Contants.search_button_name)).click();
		return true;
	}

}
