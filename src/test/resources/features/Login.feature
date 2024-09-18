Feature: tester la fonctionnalité Login
  Scenario: tester Login avec des données valides
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And je saisiee "AmelBEN"
    And je saisie "Amel2024."
    And je clique sur le bouton Login
    Then redirection vers la page Home


