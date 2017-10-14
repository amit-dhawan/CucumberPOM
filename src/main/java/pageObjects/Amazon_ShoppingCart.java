package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class Amazon_ShoppingCart extends BaseClass {

	WebDriver driver;

	public Amazon_ShoppingCart() {

		driver = getDriver();
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = ".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
	public static WebElement cartItem01_Name;

}
