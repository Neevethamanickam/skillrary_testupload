package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.AddTocart;
import pom.SkillraryDemoLogin;
import pom.SkillraryLoginPage;

public class AddingCoursetocart extends BaseClass{
	@Test
	public void course() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilies.switchtabs(driver);
		
		SkillraryDemoLogin d=new SkillraryDemoLogin(driver);
		utilies.mouseHover(driver,d.getCoursebtn());
		d.seleniumtariningtab();
		
		AddTocart a=new AddTocart(driver);
		utilies.doubleClick(driver,a.getAddbtn());
		a.addtocartbutton();
		utilies.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(),p.getdata("addtocarttitle"));
		
	}

}
