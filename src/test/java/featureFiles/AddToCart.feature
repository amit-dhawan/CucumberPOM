#Author: Amit Dhawan
Feature: Amazon search and add to cart

  Scenario: As a user on amazon site I want to search for a book and add it to the cart
    Given I open "https://www.amazon.com/"
    When I search for "Mastering Selenium WebDriver" book
    And I click on book from search results page
    And I add the book to cart
    And I open my shopping cart
    Then I should see the book in my cart
