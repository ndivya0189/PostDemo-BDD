Feature: To check the Post method request in lms api

  Background: The authorization is set to Basic Auth with valid credentials.

  Scenario: To check if we are able to add record
    Given User selects the post request providing the endpoint url
    When user adds the record
    And user click on send
    Then user receives the success message

  Scenario: To check if we are able to add record which was previously deleted
    Given User navigate to add request to select post method
    When user adds the previously deleted record
    And click on send
    Then user receives the Ok status

  Scenario: To check if we are able to add record with the provided ProgramID
    Given User selects the post request providing the endpoint url
    When user add record with the provided programid
    And click on send
    Then success message is displayed

  Scenario: To check if we are able to add record with existing ProgramId
    Given User select post method to add request
    When user add a record with the existing programid
    And click on send
    Then success message is displayed

  Scenario: To check if we are able to add with alphanumeric ProgramId
    Given User navigate to add request to select post method
    When user add a record with alphanumeric programid
    And send the request
    Then user receives the bad request message

  Scenario: To check if we are able to add a record with program name as integer
    Given User navigate to the add request to select post method
    When user add the record with program name as integer
    And send the request
    Then user receives the bad request message

  Scenario: To check if we are able to add a record with programId as null
    Given User add the request to select post method
    When user add the record with programid as null
    And click on send
    Then user receives success message

  Scenario: To  check if we are able to add record with the programId as huge number
    Given User navigate to the add request to select post method
    When user add the record with programid as hugenumber
    And request is sent
    Then user receives the bad request message

  Scenario: Check if given the string other than Boolean value in Online field
    Given User navigate to the add request to select post method
    When user add the record in the online field as string
    And user click on send
    Then user receives the bad request message

  Scenario: User Check the record when no ProgramName is given
    Given User navigate to the add request to select post method
    When user do not enter the programn name
    And click on send
    Then user receives internal server error

  Scenario: User Checks the record when Program Description is Blank
    Given User navigate to the add request to select post method
    When user add a record with program description as blank
    And user click on send
    Then user receives success message

  Scenario: User checks the record when the online field is left Blank
    Given User navigate to the add request to select post method
    When user add a record with the online field  left blank
    And user click on send
    Then user receives bad request message

  Scenario: User checks the record with the online field is entered with numbers
    Given User navigate to the add request to select post method
    When user add a record with the online field entered with numbers
    And user click on send
    Then user receives the error message
