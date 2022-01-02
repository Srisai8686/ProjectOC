package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration_Page {

WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Registration_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	By HomeClk = By.xpath("//a[@title='My Account']");
	
	By RegBtn = By.xpath("//a[contains(.,'Register')]");
	
	By FirstName = By.id("input-firstname");
	
	By LastName = By.id("input-lastname");
	
	By Email = By.id("input-lastname");
	
	By TelNum = By.id("input-telephone");
	
	By Password = By.id("input-password");
	
	By ReEnterPswd = By.id("input-confirm");
	
	By checkBox = By.xpath("//input[@type='checkbox']");
	
	By continueBtn = By.xpath("//input[@value='Continue']");
	
	
	//Locator for login button
	
	
	//Method to click login button
	public void clickHome() {
		driver.findElement(HomeClk).click();
	}
	
	public void regBtn() {
		driver.findElement(RegBtn).click();
	}
	
	public void enterFName() {
		driver.findElement(FirstName).sendKeys("srisai");
	}
	
	public void enterLName() {
		driver.findElement(LastName).sendKeys("chary");
	}
	
	public void enterEmail() {
		driver.findElement(Email).sendKeys("xyz@gmail.com");
	}
	
	public void enterTNum() {
		driver.findElement(TelNum).sendKeys("8686949999");
	}
	
	public void enterPswd() {
		driver.findElement(Password).sendKeys("srisai@8686");
	}
	
	public void enterREPswd() {
		driver.findElement(ReEnterPswd).sendKeys("srisai@8686");
	}
	
	public void clickChkbox() {
		driver.findElement(checkBox).click();
	}
	
	public void clickContinue() {
		driver.findElement(continueBtn).click();
	}
	
	
}
