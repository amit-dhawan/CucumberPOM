package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class Amazon_SearchResults extends BaseClass {

	WebDriver driver;

	public Amazon_SearchResults() {
		driver = getDriver();
		PageFactory.initElements(getDriver(), this);

	}

	// page Elements
	@FindBy(xpath = ".//*[@id='result_0']//h2[contains(@class,'a-size-medium s-inline')]")
	public static WebElement searchResult_1;

	// page Methods
	public void clickOnResult_01() {
		searchResult_1.click();

	}

}
