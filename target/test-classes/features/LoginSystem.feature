Feature: Login the system
  Login pass..
  Login fail with many case...

Scenario: Login system with valid account
  Given I open the Home page
  When I open the login screen
  And I input the email is "kieuvantruyen.sgu@gmail.com", password is "cdbently2408" and click login button
  Then I see "Chào Kiều" on the Home screen
