Feature: Cadastro

  @CadastroEdenred
  Scenario: Cadastro na Edenred
    Given acesse a pagina inicial da edenred
    When acesso a aba contato
    When registro meu nome e email
    Then efetuo meu cadastro

 