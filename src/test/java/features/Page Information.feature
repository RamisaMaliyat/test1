@PageInformationNavigation

#As a user,
#I would like to navigate through pages within the application.

Feature:  Page Information Navigation
  Background: Common Setup
    Then Main page is displayed
    When Input "Albert Einstein" text in the search field on the Main page
    And  Click on the submit button on the Main page
    And  Click on the "Tools" on the Page on the Article page


  Scenario: Navigate to Page Information
    When Select "Page information" button from Tool menu on the Article page
    Then Information page for Albert Einstein article is displayed