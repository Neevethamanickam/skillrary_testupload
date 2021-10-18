package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement cart;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCart() {
		return cart;
	}
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebookbtn;
	
	public  TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void facebookButton() {
		facebookbtn.click();
	}
	
	
	

}
