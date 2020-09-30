package selenium_session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome_Test  {
	WebDriver driver;
	String url;
	String chromepath;
	
	@BeforeTest
	public void beforeTest() {
		url = "https://www.google.com/";
		chromepath = "D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void test1() throws Exception {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);
		driver.close();
	}
	@AfterTest
	public void aftertest() {
		driver.close();
	}
	
  
}
