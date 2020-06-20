package br.ronaldomello.web.funcionalidades;

import org.openqa.selenium.WebDriver;
import br.ronaldomello.web.Object_Login.Object_Login;
import br.ronaldomello.utils.Enum.Navegador;
import br.ronaldomello.utils.Navegadores;
public class LoginFuncionalidades {
  
	WebDriver driver;
	Object_Login login;
	
	public void acessarTelaLogin() {
		Navegadores.configurarNavegador(Navegador.CHROME);
		driver = Navegadores.getDriver();
		Navegadores.maximizar();
		Navegadores.acessarPaginaWeb("http://automationpractice.com/index.php");
		login = new Object_Login(driver);
		login.clicarSignIn();
	}
	
	public void realizarLogin(String email,String senha) throws InterruptedException {
		Thread.sleep(3000);
		login.preencherEmail(email);
		login.preencherSenha(senha);
		login.clicarSubmit();
	}
	
	public void validarLoginRealizado() throws InterruptedException {
		Thread.sleep(3000);
		assert(login.verificarMensagemBoasVindas());
	}
}
