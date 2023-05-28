package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import pages.ProductsPage;
import setups.BrowserSetup;

public class LoginStep {
    LoginPage loginPage = new LoginPage(BrowserSetup.getWebDriver());
    ProductsPage productsPage = new ProductsPage(BrowserSetup.getWebDriver());

    @Given("^user input username \"([^\"]*)\"$")
    public void userInputUsername(String username) {
        loginPage.clearUsernameField();
        loginPage.inputUsernameField(username);
    }

    @And("^user input password \"([^\"]*)\"$")
    public void userInputPassword(String password){
        loginPage.clearPasswordField();
        loginPage.inputPasswordField(password);
    }

    @And("^user click Login button$")
    public void userClickLoginButton(){
        loginPage.clickLoginBtn();
    }

    @Then("^user redirected to \"([^\"]*)\" page$")
    public void userRedirectedToProductPage(String exTitle){
        productsPage.readTitlePage(exTitle);
    }

    @Then("^warning message appear \"([^\"]*)\"$")
    public void warningMessageAppear(String message){
        loginPage.verifyWarningMessage(message);
    }
}