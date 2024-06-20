Feature: Capstone Project Implementation

  Scenario: Verify Page Title
    Given User is on the home page - Scenario one
    When User verifies the title of the page
    Then Title should be "The Internet"

  Scenario: Verify A/B Testing Page
    Given User is on the home page - Scenario two
    When User Clicks on AB Testing link
    Then Text on the page should be "A/B Test Variation 1"

  Scenario: Verify Option1 is selected from dropdown
    Given User is on the home page - Scenario three
    When User clicks on dropdown link and selects Option1
    Then Option1 should be selected

  Scenario: Verify Frames Page Links
    Given User is on the home page - Scenario four
    When User clicks on Frames link
    Then Nested Frames and iFrame links should be present
