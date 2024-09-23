Feature: tester la fonctionnalité Login
  Scenario: tester Login avec des données valides
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName "AmelBEN"
    And Je saisie password "Amel2024."
    And je clique sur le bouton Login
    Then redirection vers la page Home


  Scenario: tester Login avec un mot de passe vide
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName "AmelBEN"
    And Je saisie password "."
    And je clique sur le bouton Login
    Then un message derreur saffiche "Incorrect login or password provided"



  Scenario Outline: tester Login avec données invalides
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName <username>
    And Je saisie password <password>
    And je clique sur le bouton Login
    Then un message derreur saffiche "Incorrect login or password provided"
    Examples:
   |username                                       |password|
   |"AmelBEN"                                      |"Amel202"|
   |"AmelB"                                        |"Amel2024."|
   |"AmelBEN"                                      |""|
   |""                                             |"Amel2024."|