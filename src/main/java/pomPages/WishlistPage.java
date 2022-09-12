package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class WishlistPage {
		@FindBy(xpath="//div[@class='play-icon']")
		private WebElement playbtn;

		@FindBy(xpath="//div[@class='pause-icon']")
		private WebElement pausebtn;

		@FindBy(xpath="//span[text()='Add To Wishlist']")
		private WebElement addtowishlist;

		@FindBy(id="gdpr-cookie-accept")
		private WebElement cookie;

		public WishlistPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void playbtn() {
			playbtn.click();
		}
		
		public void pausebtn() {
			pausebtn.click();
		}
		
		public void addtowish() {
			addtowishlist.click();
		}
		

		public void cookie(){
			cookie.click();
			}
}

