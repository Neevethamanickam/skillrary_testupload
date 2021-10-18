package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocart {
	
	@FindBy(id="add")
	private WebElement addbtn;

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddTocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void addtocartbutton() {
		addtocart.click();
	}
}
