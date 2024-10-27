package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigation_Page;

import static io.qameta.allure.Allure.step;


public class PageInformationTest extends Reused_VariablesTest
{
    @When("Select {string} button from Tool menu on the Article page")
    public void NavigatePageInformation(String navigation)
    {
        step("Select " + navigation + " Link from Tool menu");
        Navigation_Page.getByLabel(navigation);
        secondPage.clickPageInformation();
    }

    @Then("Information page for Albert Einstein article is displayed")
    public void verifyInformationPageIsOpen()
    {
        step("Check if Information page for Albert Einstein article is displayed or not");
        Assert.assertTrue(pageInformationPage.isInformationPageOpen(), "Information page for Albert Einstein article is not displayed");
    }
}
