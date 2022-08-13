Feature: Alarm

  Scenario: User can set alarm to 05.30AM
    Given User click the alarm icon on the navbar
    And Click button add alarm
    And User choose 5 when select time
    And User choose 30 when select time
    And User click OK
    And User click monday to friday
    Then The system displays an active button switch

    Scenario: User can delete the Alarm that has been created
      Given User click the alarm icon on the navbar
      And Click button add alarm
      And User choose 5 when select time
      And User choose 30 when select time
      And User click OK
      And User click monday to friday
      And User clicks the Delete button
      Then System does not display any alarm


