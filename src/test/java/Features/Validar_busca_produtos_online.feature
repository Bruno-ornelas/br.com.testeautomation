Feature: Fazer uma busca por um produto, e Validar o retorno e o carrinho

  Scenario: Realizar a busca de um produto no site
    Given que entre no site <"http://www.submarino.com.br">
    And que eu encontre o campo de pesquisa
    When quero realizar a busca de um produto <"Smart TV LED 55">
    And validar o retorno da busca inicial e escolher meu produto
    Then selecionar o produto
    And abrir a página com informações do meu produto
    When eu clicar em comprar e incluir no meu carrinho
    Then clicar em meu carrinho deve aparecer todos os meus produtos adicionados

