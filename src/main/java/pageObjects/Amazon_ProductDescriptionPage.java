package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class Amazon_ProductDescriptionPage extends BaseClass {

	WebDriver driver;

	public Amazon_ProductDescriptionPage() {

		driver = getDriver();
		PageFactory.initElements(getDriver(), this);

	}
	
	
	// page elements
	@FindBy(xpath=".//*[@id='add-to-cart-button']")
	public static WebElement addToCart_btn;
	
	@FindBy(xpath=".//*[@id='nav-cart']/span[3]")
	public static WebElement navCartIcon;
	
	// page methods

	
	public void clickOnAddToCart(){
		addToCart_btn.click();
	}
}
