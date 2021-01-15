package execute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AcessoPage;

public class CadastroSteps {
	private AcessoPage acessoPage;
	private WebDriver driver;

	@Given("^acesse a pagina inicial da edenred$")
	public void acesseAPaginaInicialDaEdenred()  {	
	acessoPage = new AcessoPage();
	    AcessoPage.acessarSite();
	}

	@When("acesso a aba contato")
	public void acessoAAbaContato()  {
		acessoPage.acessarAba();
	}

	@When("^registro meu nome e email$")
	public void registroMeuNomeEEmail() throws Throwable {
		acessoPage.cadastrarEmail();
	}

	@Then("^efetuo meu cadastro$")
	public void efetuoMeuCadastro() throws Throwable {
	    acessoPage.efetuarCadastro();
	}
	

}
