package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage {
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement like;
	
	public FaceBookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void likebutton() {
		like.click();
	}
	
	

}
