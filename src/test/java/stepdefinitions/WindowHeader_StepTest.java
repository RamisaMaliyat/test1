package stepdefinitions;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WindowHeader_StepTest extends Reused_VariablesTest
{
    @Then("Windows Links and Examples page is opened")
    public void isWindowLinkPageOpened()
    {
        Assert.assertTrue(windowLinkPage.isHeaderDisplayed());
    }

    @When("Click 'Alerts In A New Window From JavaScript' link")
    public void ClickAlertLink()
    {
        windowLinkPage.AlertInOpen();
        AqualityServices.getBrowser().tabs().switchToLastTab();
    }

    @And("Click Show prompt box")
    public void ClickAlertPromptBox()
    {
        alertBox.ClickAlertPromptBox();
    }
    @And("Wait until alert is displayed")
    public void WaitUntilAlertDisplayed()
    {
        alertBox.WaitUntilAlertDisplayed();
    }
    @Then("Accept the alert")
    public void AcceptAlert()
    {
       browser.handlePromptAlert(AlertActions.ACCEPT,text);
    }
    @And("Check if the prompt result is matched with the result text")
    public void AlertText()
    {
        Assert.assertEquals(alertBox.getLblResult().getText(), "You clicked OK. 'prompt' returned"+" "+text);
    }

}
