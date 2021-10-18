package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.FaceBookPage;
import pom.SkillraryDemoLogin;
import pom.SkillraryLoginPage;
import pom.TestingPage;

public class FacebooklikeBtn extends BaseClass{
	@Test
	public void fblike() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilies.switchtabs(driver);
		
		SkillraryDemoLogin d=new SkillraryDemoLogin(driver);
		utilies.dropdown(d.getCoursedd(),p.getdata("coursedd"));
		
		TestingPage t=new TestingPage(driver);
		utilies.draganddrop(driver,t.getSeleniumtraining(),t.getCart());
		t.facebookButton();
		
		FaceBookPage fb=new FaceBookPage(driver);
		fb.likebutton();
		
		Assert.assertEquals(driver.getTitle(),p.getdata("fbtitle"));
	}

}
