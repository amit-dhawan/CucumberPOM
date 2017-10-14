package stepDefinitions;

import org.junit.Assert;

import pageObjects.Amazon_HomePage;
import pageObjects.Amazon_ProductDescriptionPage;
import pageObjects.Amazon_SearchResults;
import pageObjects.Amazon_ShoppingCart;
import core.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart_Steps {

	Amazon_HomePage homePage = new Amazon_HomePage();
	Amazon_SearchResults searchResults = new Amazon_SearchResults();
	Amazon_ShoppingCart shoppingCart = new Amazon_ShoppingCart();
	Amazon_ProductDescriptionPage productPage = new Amazon_ProductDescriptionPage();

	@Given("^I open \"([^\"]*)\"$")
	public void i_open(String url) throws Throwable {

		BaseClass.getDriver().get(url);

	}

	@When("^I search for \"([^\"]*)\" book$")
	public void i_search_for_book(String keyword) throws Throwable {
		homePage.searchFor(keyword);

	}

	@When("^I click on book from search results page$")
	public void i_click_on_book_from_search_results_page() throws Throwable {
		searchResults.clickOnResult_01();
	}

	@When("^I add the book to cart$")
	public void i_add_the_book_to_cart() throws Throwable {
		productPage.clickOnAddToCart();
	}

	@When("^I open my shopping cart$")
	public void i_open_my_shopping_cart() throws Throwable {

		homePage.clickOnNavCartIcon();
	}

	@Then("^I should see the book in my cart$")
	public void i_should_see_the_book_in_my_cart() throws Throwable {

		Assert.assertTrue(shoppingCart.cartItem01_Name.getText().equals(
				Amazon_HomePage.keywordName));
	}
}
