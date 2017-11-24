@Quote
Feature: Get a Free Quote
  Background:

    Given I go to "https://www.d3dsecurity.co.uk"
    When I click products tab on the menu
    Then I should see "Get a free Quote" form on the left hand side of the page
@Valid_Data
  Scenario: Validating Get a free quote with valid data

    Then I should see List of products under the "products" tab
    And I should see "Get a free Quote" on the Right side of the page
   Given I enter First Name as "Aruna
    And I enter Last Name as "Vanta"
    And I enter emailID as "arunasujay@yahoo.com"
    And I enter Phone number as "07502382109"
    And I enter subject as "Get a Quote"
    And I enter message as "Hello sir/Madam I would like to have free quote for this particular product"
    When I click on "Send Message" Button
    Then I should get a message "Thank you"
    And I should get a message " Thank you for your enquiry , We will contact you As soon as possible"
    And I should see Url as ""https://www.d3dsecurity.co.uk/thank-you/"
@Invalid_Data
    Scenario Outline: Validating Get a free Quote with invalid data

      Then I should see List of products under the "products" tab
      And I should see "Get a free Quote" on the Right side of the page
      Given I enter the mandatory first name field as "<First_Name>"
      And I enter last name as "<Last_Name>"
      And I enter email id as "<EmailID>"
      And I enter the mandatory phone number field as "<PhoneNumber>"
      And I enter Subject as "<Subject>"
      And I enter Message as "<Message>"
      When I click the "SEND MESSAGE" button
      Then I should see a prompted message as "<prompt_message>"
      And I should see Error Message as "<Error_Message>"

      Examples:
        | First_Name | Last_Name | EmailID             | PhoneNumber | Subject   | Message                   | Error_Message                     |
        |            | Vanta    | arunasujay@yahoo.com | 07502382109       | Hi        | get a free quote | Please fill in the required field |
        | Kalyani    | Kolli       | srikolli@yahoo.com |                   | hi | Get a free quote | Please fill in the required field |

        | Anjali     |Sethi        |Anjaliyahoo.com    |07502382109         |hello|get a free quote |please enter invalid data          |