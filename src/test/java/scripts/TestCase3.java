package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibaray.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchTextbox(pdata.getPropertydata("coursedata"));
		s.gobtn();

		CoreJavaPage c = new CoreJavaPage(driver);
		c.seleniumtraining();
		
		WishlistPage w = new WishlistPage(driver);
		w.cookie();
	    utilies.swtichFrame(driver);
		w.playbtn();
		Thread.sleep(2000);
		w.pausebtn();
		Thread.sleep(3000);
		utilies.swtichbackframe(driver);
		w.addtowish();
		
				
		
	}

}
