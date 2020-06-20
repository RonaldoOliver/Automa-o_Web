package br.ronaldomello.web.Page_Login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page_Login {
	
	WebDriver driver;
	public Page_Login(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	@FindBy(xpath = "//a[@class='login']")
	protected WebElement signIn;
	
	@FindBy(id = "email")
	protected WebElement inputEmail;
	
	@FindBy(id = "passwd")
	protected WebElement idPassword;
	
	@FindBy(id = "SubmitLogin")
	protected WebElement btnSubmitLogin;
	
	@FindBy(xpath = "//p[@class='info-account']")
	protected WebElement lblMensagemBoasVindas;
	
	

}
