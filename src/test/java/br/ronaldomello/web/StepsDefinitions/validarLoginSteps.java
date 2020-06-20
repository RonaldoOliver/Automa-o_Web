package br.ronaldomello.web.StepsDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import br.ronaldomello.utils.Navegadores;
import br.ronaldomello.web.funcionalidades.LoginFuncionalidades;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
public class validarLoginSteps  {
	WebDriver driver;
	LoginFuncionalidades login = new  LoginFuncionalidades();
	
	@Before
	@Dado("que tenha acessado a tela de login")
	public void que_tenha_acessado_a_tela_de_login() {
		try {
			login.acessarTelaLogin();
		}
		catch(Throwable erro) {
			erro.printStackTrace();
		}
	}
 
  @Quando("preencher realizar login com os dados {string} e {string}")
    public void preencher_realizar_login_com_os_dados(String email,String senha) {
	  try {
			login.realizarLogin(email, senha);
		}
		catch(Throwable erro) {
			erro.printStackTrace();
		}
    }
    
    @Entao("deve ser validado login com sucesso")
    public void deve_ser_validado_login_com_sucesso() {
    	try {
			login.validarLoginRealizado();
		}
		catch(Throwable erro) {
			erro.printStackTrace();
		}
    }
	
    @After
    public static void quitDriver() {
      Navegadores.fecharNavegador();
    }
	
}
