package Pages;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class ValidaBuscaPage extends Base.BaseUtil {

    private Base.BaseUtil base;

    public ValidaBuscaPage(Base.BaseUtil base) {
        this.base = base;
    }

    protected void acessarPagina(String arg1) {
        try {
            base.Driver.navigate().to(arg1);
        } catch (Exception e) {
            System.out.println("AcessarPagina().Falhou:");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            fail();
        }
    }

    protected void BuscaCampoDePesquisa() {
        try {
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#h_search-input")).click();
        } catch (Exception e) {
            System.out.println("BuscaCampoDePesquisa().Falhou:");
            System.out.println(e.getMessage());
            fail();
        }
    }

    protected void RealizarBuscaProduto(String arg1) {
        try {
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#h_search-input")).sendKeys(arg1);
        } catch (Exception e) {
            System.out.println("RealizarBuscaProduto().Falhou");
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
            fail();
        }
    }

    protected void ValidaResultadoBusca() {
        try {
            assertTrue(base.Driver.findElement(org.openqa.selenium.By.cssSelector("#h_search > div > div.src-suggestion > ul > li.as-lst-it.sz.sz-1 > a > span.as-name")).getText().contains("Smart TV LED 55"));
        } catch (Exception e) {
            System.out.println("ValidaResultadoBusca().Falhou");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            fail();
        }
    }

    protected void SelecionarProduto() {
        try {
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#h_search > div > div.src-suggestion > ul > li.as-lst-it.sz.sz-1 > a")).click();
        } catch (Exception e) {
            System.out.println("SelecionarProduto().Falhou");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            fail();
        }
    }

    protected void PaginaProduto() {
        try {
            //página valores
            String seletorVlr = "#content > div > div > div.GridUI-wcbvwm-0.jjjQOQ.ViewUI-sc-1ijittn-6.iXIDWU > div > section > div";
            assertTrue(base.Driver.findElement(org.openqa.selenium.By.cssSelector(seletorVlr)).isDisplayed());
        } catch (Exception e) {
            System.out.println("PaginaProduto().Falhou");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            fail();
        }
    }

    protected void ValidarCompraProduto() {
        try {
            org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) base.Driver;
            js.executeScript("window.scrollBy(0,500)");
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#btn-buy > div > span")).click();
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#btn-continue > div > span")).click();
            js.executeScript("window.scrollBy(0,1000)");
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#buy-button")).click();
        } catch (Exception e) {
            System.out.println("ValidarCompraProduto().Falhou");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            fail();
        }
    }

    protected void ValidarCarrinhoComProduto() {
        try {
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#brd-link")).click();
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#h_minicart")).click();
            assertTrue(base.Driver.findElement(org.openqa.selenium.By.cssSelector("#crt-box > ul > li > a")).isDisplayed());
            base.Driver.findElement(org.openqa.selenium.By.cssSelector("#crt-box > div > a.crt-basquet")).click();
            assertTrue(base.Driver.findElement(org.openqa.selenium.By.cssSelector("#app > section > header > h2")).getText().equals("Meu carrinho"));
            Thread.sleep(4000);
            base.Driver.quit();
        } catch (Exception e) {
            System.out.println("ValidarCarrinhoComProduto().Falhou");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            fail();
        }
    }
}
