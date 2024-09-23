Feature: verifier ma liste d'achat
  Scenario: verifier ma liste d'achat apres connexion
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName "AmelBEN"
    And Je saisie password "Amel2024."
    And je clique sur le bouton Login
    And cliquer sur Checkout
    And cliquer sur confirm order
   Then redirection vers une autre page "Your Order Has Been Processed!"
