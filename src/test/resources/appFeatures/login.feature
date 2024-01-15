Feature: Search Feature

  Background:
    Given I am at amazon login page

  @Smoke @Regression
  Scenario: searching smartphone
    Given I have a search field in amazon
    When I search "Macbook" in search
    Then Product named "Macbook" with price 100000 will appear
