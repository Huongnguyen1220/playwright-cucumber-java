
@wip
Feature: Searching new cars

  Scenario Outline: Finding new cars
    Given user navigates to carmax website
    When user clicks Shop link
    And user clicks on "<carBrand>" car
    And user validates page title as "<pageTitle>"

    Examples:
      | carBrand | pageTitle            |
      | Toyota   | Used Toyota for Sale |
      | Ford     | Used Ford for Sale   |
      | Honda    | Used Honda for Sale  |
      | Nissan   | Used Nissan for Sale |
