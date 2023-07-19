Feature: Population End Point

  @pop
  Scenario: Verify population end point
    Given request the population end point
    Then Validate the response