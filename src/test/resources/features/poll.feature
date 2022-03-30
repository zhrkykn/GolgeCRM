
  Feature: Creating Poll Function


    Scenario Outline: Create a Poll
      Given the user logged in as "<userType>"
      When the user lands on Activity Stream page and clicks on Poll
      Then the user selects multiple contacts from Employees and Departments
      And the user attach a link by clicking on the link icon
      Then the user add mention by clicking on the mention icon
      And the user adds questions and multiple answers
      Then the user delete questions and multiple answers
      And the user provides multiple choice to attendees by selecting Allow multiple choice checkbox
      Then the user clicks send button and sends the poll


      Examples:
      |   userType                          |
      |   helpdesk1@cybertekschool.com      |
      |   hr1@cybertekschool.com            |
      |   marketing2@cybertekschool.com     |


















