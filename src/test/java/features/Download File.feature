@DownloadFile
#As a user,
#I want to download files from the application.

Feature:  Download File
  Background: Common Setup
    Then Main page is displayed
    When Input "Albert Einstein" text in the search field on the Main page
    And Click on the submit button on the Main page
    And Click on the "Tools" on the Page on the Article page

  Scenario: Download PDF
    When Select "Download as PDF" link from Tool menu on the Article page
    And Click on the "Download" button from Download as PDF page
    Then The "Albert Einstein.pdf" file is downloaded


