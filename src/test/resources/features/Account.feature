Feature: modifier mes données dans la fonctionnalité modifier mon compte
  @EditAccount
  Scenario: modifier mes données dans mon compte
    Given je suis dans le site Automation Test Store
    When je clique sur le bouton Login Or registre
    And Je saisie userName "AmelBEN"
    And Je saisie password "Amel2024."
    And je clique sur le bouton Login
    Then redirection vers la page Home
    And cliquer sur Account
    And cliquer sur Manage Address Book
    And cliquer sur le bouton edit
    And je saisie les nouvelles données
    And cliquer sur le bouton continue
   And un message saffiche "Your address has been successfully updated"
