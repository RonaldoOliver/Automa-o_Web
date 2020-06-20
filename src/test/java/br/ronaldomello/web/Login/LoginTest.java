package br.ronaldomello.web.Login;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = "@login", 
glue = "br.ronaldomello.web.StepsDefinitions", monochrome = true, dryRun = false)

public class LoginTest {

}
