package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibaray.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws IOException{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.swtichingtab(driver);
		utilies.drop(sd.getGetcoursedropdown(), pdata.getPropertydata("getcoursedropdown"));
		
		TestingPage tp = new TestingPage(driver);
		utilies.dragdrop(driver, tp.getDragselenium(), tp.getCart());
		
		Point loc = tp.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilies.scrollbar(driver, x, y);
		tp.facebookicon();
		
	}

}
