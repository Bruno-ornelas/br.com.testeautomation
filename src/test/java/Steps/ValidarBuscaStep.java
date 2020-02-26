package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidarBuscaStep extends Pages.ValidaBuscaPage {
    public ValidarBuscaStep(Base.BaseUtil base) {
        super(base);
    }

    @Given("^que entre no site <\"([^\"]*)\">$")
    public void que_entre_no_site(String arg1) throws Throwable {
        acessarPagina(arg1);
    }

    @Given("^que eu encontre o campo de pesquisa$")
    public void que_eu_encontre_o_campo_de_pesquisa() throws Throwable {
        BuscaCampoDePesquisa();
    }

    @When("^quero realizar a busca de um produto <\"([^\"]*)\">$")
    public void quero_realizar_a_busca_de_um_produto(String arg1) throws Throwable {
        RealizarBuscaProduto(arg1);
    }

    @When("^validar o retorno da busca inicial e escolher meu produto$")
    public void validar_o_retorno_da_busca_inicial_e_escolher_meu_produto() throws Throwable {
        ValidaResultadoBusca();
    }

    @Then("^selecionar o produto$")
    public void selecionar_o_produto() throws Throwable {
        SelecionarProduto();
    }

    @Then("^abrir a página com informações do meu produto$")
    public void abrir_a_página_com_informações_do_meu_produto() throws Throwable {
        PaginaProduto();
    }

    @When("^eu clicar em comprar e incluir no meu carrinho$")
    public void eu_clicar_em_comprar_e_incluir_no_meu_carrinho() throws Throwable {
        ValidarCompraProduto();
    }

    @Then("^clicar em meu carrinho deve aparecer todos os meus produtos adicionados$")
    public void ao_clicar_em_meu_carrinho_deve_aparecer_todos_os_meus_produtos_adicionados() throws Throwable {
        ValidarCarrinhoComProduto();
    }

}
