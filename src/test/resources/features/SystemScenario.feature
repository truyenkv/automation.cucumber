Feature: User behavior action
  Login pass..
  Login fail with many case...


  Background:
    Given I open the Home page


  Scenario Outline: TC-001 Verify error message when login with incorrect account
    When I open the login screen
    And I input the email is '<username>', password is '<password>' and click login button
    Then I see '<error>' on the Login screen
    Examples:
      |username                             |password       |error                              |
      |kieuvantruyen.sgu@gmail.com          |123            |Thông tin đăng nhập không đúng     |
      |abc@yopmail.com                      |1012233        |Thông tin đăng nhập không đúng     |

  Scenario: TC-002 Verify login successful correct account
    When I open the login screen
    And I input the email is 'kieuvantruyen.sgu@gmail.com', password is '10112505' and click login button
    Then I see 'Chào Kiều Văn Truyền' on the Home screen

  Scenario: TC-003 Search the product and add to card
    When I open the login screen
    And I input the email is 'kieuvantruyen.sgu@gmail.com', password is '10112505' and click login button
    And I want to search the production is 'osmo pocket' and click search button
    And I click on the first product on screen
    Then I should see the 'Máy Quay DJI OSMO Pocket - Hàng Chính hãng' on screen
    And I add product to card
    And I check out the card
    Then I should see the 'Máy Quay DJI OSMO Pocket - Hàng Chính hãng' on the Card screen
