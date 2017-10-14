package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class Amazon_HomePage extends BaseClass {

	WebDriver driver;

	public Amazon_HomePage() {
		driver = getDriver();
		PageFactory.initElements(getDriver(), this);

	}

	public static String keywordName;

	// Define page elements

	@FindBy(xpath = ".//*[@id='twotabsearchtextbox']")
	public static WebElement searchBox;

	@FindBy(xpath = ".//*[@id='nav-search']/form/div[2]/div")
	public static WebElement searchIcon;

	@FindBy(xpath = ".//*[@id='nav-cart']/span[3]")
	public static WebElement navCartIcon;

	// Page methods

	public void searchFor(String keyword) {

		keywordName = keyword;
		searchBox.sendKeys(keyword);
		searchIcon.click();
	}

	public void clickOnNavCartIcon() {
		navCartIcon.click();
	}

}
