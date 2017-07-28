package BaiduPageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class publicTest {
	public static class Contants{
		public static final String TITLE = "�ٶ�һ�£����֪��";
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
	//��ȡҳ��ı���
	public String getTitle(){
		return this.driver.getTitle();
	}
	//���ҳ���Ƿ���أ��ж�ҳ��title�Ƿ����
	public boolean isLoade(){
		System.out.println(this.getTitle());
		return publicTest.Contants.TITLE.equals(this.getTitle());
	}
	//����ؼ��ֽ�����������������ҳ��title��֤ҳ���Ƿ���ת�ɹ�
	public boolean SearchTest(String key_word){
		this.driver.findElement(By.id(publicTest.Contants.search_bar_id)).click();
		this.driver.findElement(By.id(publicTest.Contants.search_box_id)).clear();
		this.driver.findElement(By.id(publicTest.Contants.search_box_id)).sendKeys(key_word);
		this.driver.findElement(By.id(publicTest.Contants.search_button_name)).click();
		return true;
	}

}
