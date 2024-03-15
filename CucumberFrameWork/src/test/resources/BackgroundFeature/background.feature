
Feature: Sauce application demo
 
 Background: Login in the sauce demo application
	Given User open the sauce demo application
    And user enter username and password
    When user click on the loginbutton

 
  @tag1
  Scenario: HomePage
    And Validate Logo
    And Click on Add to cart button
    Then click on Cart icon
   

  @tag2
  Scenario Outline: AddToCartPage
    And Validate Text
    And click on checkout

   