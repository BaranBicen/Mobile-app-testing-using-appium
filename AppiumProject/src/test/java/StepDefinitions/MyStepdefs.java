package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;
import Pages.pages;


public class MyStepdefs {
    pages pages = new pages(DriverFactory.getDriver());

    @When("postTiklanir")
    public void posttiklanir() {
        pages.posttiklama();
    }

    @When("postYazilir")
    public void postyazilir() {
        pages.postyazma();
    }

    @When("postButonunaTiklanir")
    public void postbutonunatiklanir() {
        pages.postbutonunatiklama();
    }

    @When("profilButonunaTiklanir")
    public void profilbutonunatiklanir() {
        pages.profilbutonunatiklama();
    }

    @When("profilResmineTiklanir")
    public void profilresminetiklanir() {
        pages.profilresminetiklama();
    }

    @When("postBegenilir")
    public void postbegenilir() {
        pages.postbegenme();
    }

    @Then("geriTusunaBasilir")
    public void geritusunabasilir() {
        pages.geritusunabasma();
    }
}
