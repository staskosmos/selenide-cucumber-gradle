Feature: Login User

  Scenario: Create user
    Then Open "sign-up" page
    Then Click "Become a Learner" button
    Then Input email
    Then Input First Name
    Then Input Last Name
    Then Input password
    Then Click "Become a Learner" button span
    Then Click avatar button
    Then Click "Settings" button li
    Then Check First Name
    Then Check Last Name