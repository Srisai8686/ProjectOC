package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_Objects.Login_page;

public class LoginTC_01 {
	
	@Test
	
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdsri\\eclipse-workspace\\ProjectOC\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		
		
		Login_page login = new Login_page(driver);
		
		login.clickOption();
		login.clickLogin();
		login.enterEmail();
		login.enterPswd();
		login.clickLoginbutton();
		
		
	}

}
