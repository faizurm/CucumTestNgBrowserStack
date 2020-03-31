Feature: verifying facebook details

  Scenario Outline: user is on facebook page
    Given user is on facebook page
    When user enters "<userName>" and "<password>"
    Then user should click logIn button
    

    Examples: 
      | userName | password |
      | Hello    | java     |
