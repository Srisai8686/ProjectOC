package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_Objects.Registration_Page;

public class RegisterTC_02 {
	
	@Test
	
	public void register() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		
		//Registration page starts here.....
		
		Registration_Page rp = new Registration_Page(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		rp.clickHome();
		rp.regBtn();
		rp.enterFName();
		rp.enterLName();
		rp.enterEmail();
		rp.enterTNum();
		rp.enterPswd();
		rp.enterREPswd();
		rp.clickChkbox();
		rp.clickContinue();
		
		driver.close();
	}

}
