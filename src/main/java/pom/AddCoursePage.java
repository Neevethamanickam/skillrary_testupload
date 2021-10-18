package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCoursePage {
@FindBy(xpath="//div[@class='play-icon']")
private WebElement playbtn;

@FindBy(xpath="//div[@class='pause-icon']")
private WebElement pausebtn;

@FindBy(xpath="//button[contains(text(),' TAKE THIS COURSE ')]")
private WebElement takecouse;

public AddCoursePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void playbutton() {
	playbtn.click();
}

public void pausebuttton() {
	pausebtn.click();
}

public void takethiscoursebtn() {
	takecouse.click();
}
}
