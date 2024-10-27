Feature: Windows Links and Examples
  @Ignore
  Scenario: Windows Links and Examples
    Then Windows Links and Examples page is opened
    When Click 'Alerts In A New Window From JavaScript' link
    And Click Show prompt box
    And Wait until alert is displayed
    Then Accept the alert
    And Check if the prompt result is matched with the result text