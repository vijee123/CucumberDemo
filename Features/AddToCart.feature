Feature: To check whether a product is added to cart successfully.
	
	@regression
  Scenario: Adding required product to Cart
    Given User enters "productname" in the search box
    And User clicks on the searchIcon
    And User navigates to search page
    When User clicks on Add To Cart on the product
    Then User gets a message for successfully adding the product into cart
    When User Clicks on the Shopping Cart Link
    Then User navigates to Shopping Cart page
    #And Selected product is successfully added in the Cart List.
