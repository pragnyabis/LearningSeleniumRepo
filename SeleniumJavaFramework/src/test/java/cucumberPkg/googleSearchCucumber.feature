@tag
Feature: Google Search Engine is working
  To check whether the Google Search engine is working properly or not

	Background:
	Given I open a browser

  @tag2
  Scenario Outline: Test Google Search Bar
    Given I land on Google page
    When I type the <searchValue> in Search Bar
    And hit Enter key
    Then I verify the <status> of result page

    Examples: 
      | searchValue | status  |
      | Selenium    | pass    |
