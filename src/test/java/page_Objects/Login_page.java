package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login_page {

	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Login_page(WebDriver driver) {
		this.driver=driver;
	}
	
	By HomeClk = By.xpath("//a[@title='My Account']");
	
	
	//Locator for login button
	By LoginBtn = By.xpath("//a[contains(text(),'Login')]");
	
	By txtEmail = By.xpath("//input[@id='input-email']");
	
	By txtPswd = By.xpath("//input[@id='input-password']");
	
	By clickLoginbtn = By.xpath("//input[@class='btn btn-primary']");
	
	public void clickOption()  {
	
		driver.findElement(HomeClk).click();
	}
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
	
	public void enterEmail() {
		driver.findElement(txtEmail).sendKeys("kdsrisaichary1@gmail.com");
		
	}
	
	public void enterPswd() {
		driver.findElement(txtPswd).sendKeys("sri1234");
	}
	
	public void clickLoginbutton() {
		driver.findElement(clickLoginbtn).click();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Warning: No match for E-Mail Address and/or Password.')]"));
		String wtext = text.getText();
		Assert.assertEquals(wtext, "Warning: No match for E-Mail Address and/or Password.");
		driver.close();
	}
}
