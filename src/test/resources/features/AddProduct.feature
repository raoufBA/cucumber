Feature: Ajotuer un produit
  @AddProduct
  Scenario: Ajouter un produit après la connexion
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName "AmelBEN"
    And Je saisie password "Amel2024."
    And je clique sur le bouton Login
    Then redirection vers la page Home
    And cliquer sur makeup
    And cliquer sur tropiques minerale loose bronzer
    And cliquer sur le bouton add to Cart


