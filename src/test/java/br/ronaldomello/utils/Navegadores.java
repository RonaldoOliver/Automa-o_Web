package br.ronaldomello.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import br.ronaldomello.utils.Enum.Navegador;

public class Navegadores {

	 private static WebDriver driver;
	 public static WebDriver getDriver() {
		 return driver;
	 }
	 
	 
	 public static WebDriver configurarNavegador(Navegador tipoNavegador) {
		 switch (tipoNavegador){
			 case CHROME :
		 ChromeOptions options =  new ChromeOptions();
		 options.addArguments("--disable-extensions");
		 System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		 driver = new ChromeDriver(options);
		 break;

 default:
	   driver = null;
	   break;
	 }
	 return driver;
	 }
	
	 public static void acessarPaginaWeb(String url) {
		 driver.get(url);
	 }
	 
	 public static void fecharNavegador() {
		 driver.close();
	 }
	 
	 public static void maximizar() {
		 driver.manage().window().maximize();
	 }
}
