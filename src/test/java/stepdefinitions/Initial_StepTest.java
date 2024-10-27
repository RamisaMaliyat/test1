package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static io.qameta.allure.Allure.step;

public class Initial_StepTest extends Reused_VariablesTest
{
    @Then("Main page is displayed")
    public void isDisplayed()
    {
        step("Check if Main page is displayed or not");
        Assert.assertTrue(firstPage.isMainPageOpen(), "Main page is not displayed");
    }
    @When("Input \"Albert Einstein\" text in the search field on the Main page")
    public  void  NameToSearch()
    {
        step("Enter the name: "+name);
        firstPage.Search(name);
    }
    @And("Click on the submit button on the Main page")
    public void performSearch()
    {
        step("Click on the search button");
        firstPage.Submit();
    }
    @And("Click on the \"Tools\" on the Page on the Article page")
    public void ClickOnToolMenu()
    {
        step("Click on the Tool Menu ");
        secondPage.SelectToolMenu();;
    }


}
