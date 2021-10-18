package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.AddCoursePage;
import pom.SeleniumPage;
import pom.SkillraryLoginPage;

public class Takecourses extends BaseClass{
	@Test
	public void takecoursess() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serachtextbox(p.getdata("coursename"));
		s.serachbutton();
		
		SeleniumPage sp=new SeleniumPage(driver);
		sp.seleniumtab();
		
		AddCoursePage a=new AddCoursePage(driver);
		utilies.switchframe(driver);
		a.playbutton();
		Thread.sleep(15000);
		a.pausebuttton();
		utilies.switchbackframe(driver);
		a.takethiscoursebtn();
		
		
		
	}

}
