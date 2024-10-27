@SearchAndLanguageChange

#As a user,
#I want to change languages of the article.

Feature:  Search and Language Change
  Background: Common Setup
    Then Main page is displayed

  Scenario: Search for a name and Change Language
    When Input "Albert Einstein" in the search field
    And Change the language to "Español"
    And Click on the search button
    Then Article page for "Albert Einstein" is displayed


