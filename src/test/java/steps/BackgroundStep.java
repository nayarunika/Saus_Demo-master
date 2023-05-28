package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import setups.BrowserSetup;

public class BackgroundStep {
     LoginPage loginPage = new LoginPage(BrowserSetup.getWebDriver());

    @Given("^user type \"([^\"]*)\" in address bar$")
    public void userTypeInAddressBar(String url) throws Throwable {
        BrowserSetup.getWebDriver().navigate().to(url);
    }

    @Then("^Sauce Demo web will displayed$")
    public void sauceDemoWebWillDisplayed() throws Throwable {
        loginPage.seeLogoImg();
    }
}
