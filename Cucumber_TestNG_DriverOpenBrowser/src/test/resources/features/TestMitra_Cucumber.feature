Feature: Validate Mitra page
  Scenario: Simple Validate Mitra page
#    Given mitra initiate automation - Annotation Method
    Given mitra initiate automation - Lambda Method
    When mitra navigate to Mitra website
    Then mitra validate home page Mitra
    And mitra quit browser
