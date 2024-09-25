Feature: tester la fonctionnalité Logout
  @logout
  Scenario: tester Logout avec des données valides
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName "AmelBEN"
    And Je saisie password "Amel2024."
    And je clique sur le bouton Login
    Then redirection vers la page Home
    And je clique sur le bouton Logout
    And une redirection vers autre page et message "Account Logout"
