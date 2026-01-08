@login
Feature: Skryabin Validations
  Background: This is a simple background
  Given I am on the Skryabin page

  #Scenario:
    #When I am clicking submit button without providing inputs
    #Then I validate all error messages

 #Scenario:
   #When I enter the first middle and last Name and click on refresh button
  # Then The name text is cleared successfully


  #Scenario:
    #When I enter the first middle and last Name and click on refresh button
    #Then The name text is cleared successfully
    #And I am entering email address and username
   # And I enter valid passwords and phone number
    #And I am entering contact name and contact number
    #When I click on submit
    #Then I see error message in accepting the privacy policy

  #Scenario:
    #When I enter the first middle and last Name and click on refresh button
    #Then The name text is cleared successfully
    #And I enter valid passwords and phone number
    #And I am entering contact name and contact number
    #And I am entering username
   # When I click on submit
    #Then I see error message in accepting the privacy policy
   # Then I see the error message to enter the email

  Scenario:

    #Then and And are misplaced
    #follow standards cases , maintain uniformity
    #I want to ensure that control should be present on the home window, so i am checking the title of the page
    #use explicit wait(use implicit wait or explicit wait
    When I click on the Related documents link
    Then a new Documents window should be opened
    And I switch back to the main window

