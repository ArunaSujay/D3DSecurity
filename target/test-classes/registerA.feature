#@RegistrationValid
#Feature: Register
#@case_1
#  Scenario: Validating register button
#    Given I enter url as "https://www.d3dsecurity.co.uk"
#    Then I should see a Register Button
#    When I click on the register Button
#    Then I should see a register page with emaild Id and password
#    Given I enter valid emaild as "arunasujay@yahoo.com"
#    And  I enter valid password as "Happycoup1e"
#    And I enter valid confirm password as "Happycoup1e"
#    When I click on the Register button on register page
#    Then I should see  My Account button
#    Then I should see My Account Text
#    And I should see Logout Button
#    And I should see Logout Text
#
#    @case_2
#    Scenario: validating with Blank fields
#
#      Given I enter url as " https://WWW.d3dsecurity.co.uk "
#      Then I should see a Register Button
#      When I click on the Register button on register page
#      Then I should see a register page with emaild Id and password
#      Given I enter valid emaild as " "
#      And  I enter valid password as " "
#      And I enter valid confirm password as " "
#      When I click on the Register button on register page
#      Then I should see a error message as "Username is not Valid"
#
#
#  @case_3
#  Scenario: Validating with valid email ID and mismatch passwords
#
#    Given I enter url as " https://WWW.d3dsecurity.co.uk "
#    Then I should see a Register Button
#    When I click on the Register button on register page
#    Then I should see a register page with emaild Id and password
#    Given I enter valid emaild as "arunasujay@yahoo.com "
#    And  I enter valid password as " Happycoup1e"
#    And I enter valid confirm password as "Testing2 "
#    When I click on the Register button on register page
#    Then I should see a error message as "Passwords must be identical and filled"
#
#
#  @Case_4
#     Scenario: Validating With Valid Email id, Valid Password BUT Confirm Password is Blank.
#
#    Given I enter url as " https://WWW.d3dsecurity.co.uk "
#       Then I should see a Register Button
#       When I click on the Register button on register page
#       Then I should see a register page with emaild Id and password
#       Given I enter valid emaild as "arunasujay@yahoo.com "
#       And  I enter valid password as "Happycoup1e "
#       And I enter valid confirm password as " "
#       When I click on the Register button on register page
#       Then I should see a error message as "passwords must be identical and filled"
#
#    @case_5
#     Scenario: Validating with Valid Email id, Blank Password BUT Valid Confirm Password.
#
#       Given I enter url as " https://WWW.d3dsecurity.co.uk "
#        Then I should see a Register Button
#        When I click on the Register button on register page
#        Then I should see a register page with emaild Id and password
#        Given I enter valid emaild as "arunasujay@yahoo.com "
#        And  I enter valid password as " "
#        And I enter valid confirm password as "Happycoup1e "
#        When I click on the Register button on register page
#        Then I should see a error message as "Passwords must be identical and filled"
#
#         @Case_6
#        Scenario: Validating with Blank Email id, Valid Password, Valid Confirm Password
#           Given I enter url as " https://WWW.d3dsecurity.co.uk "
#          Then I should see a Register Button
#          When I click on the Register button on register page
#          Then I should see a register page with emaild Id and password
#          Given I enter valid emaild as " "
#          And  I enter valid password as " Happycoup1e"
#          And I enter valid confirm password as "Happycoup1e"
#          When I click on the Register button on register page
#          Then I should see a error message as "Passwords must be Identical"
