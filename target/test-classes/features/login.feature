@web

Feature: nopcommerce admin login

  Background:
    Given I am on admin login page

  @login
  Scenario: Verify valid login from admin login page
    When I enter admin@yourstore.com into username field on the messenger page
    And I enter admin into password field on the messenger page
    And I click on login button on messenger page
    Then I verify invalid login message on sign in page