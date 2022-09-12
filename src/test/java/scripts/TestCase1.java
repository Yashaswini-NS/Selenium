package scripts;


import org.testng.annotations.Test;

import genericLibaray.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		utilies.swtichingtab(driver);
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver, sd.getGetcoursetab());
		sd.seleniumtrainingtab();
		
		AddtoCartPage d = new AddtoCartPage(driver);
		utilies.doubleclick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilies.alterPopup(driver);
		

	}


	


}
