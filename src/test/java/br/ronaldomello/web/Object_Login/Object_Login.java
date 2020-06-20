package br.ronaldomello.web.Object_Login;

import org.openqa.selenium.WebDriver;

import br.ronaldomello.web.Page_Login.Page_Login;

public class Object_Login extends Page_Login {
	
	public Object_Login(WebDriver driver) {
		super(driver);
	}
	
	public void clicarSignIn() {
		signIn.click();
	}
	
	public void preencherEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void preencherSenha(String senha) {
		idPassword.sendKeys(senha);
	}
	
	public void clicarSubmit() {
		btnSubmitLogin.click();
	}
	public boolean verificarMensagemBoasVindas() {
		return lblMensagemBoasVindas.isDisplayed();
	}
}
