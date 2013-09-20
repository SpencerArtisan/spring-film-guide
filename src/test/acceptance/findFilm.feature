Feature: Film Guide

  Scenario: Finds the rating for a film
    Given I am on the home page
    When I enter the film name "In Which We Serve"
    And Press "Search"
    Then I see the rating 7.3