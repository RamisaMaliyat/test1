package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static io.qameta.allure.Allure.step;


public class SearchLanguageTest extends Reused_VariablesTest
{
    @When("Input \"Albert Einstein\" in the search field")
    public void Enter_Name()
    {
        step("Enter the name:"+ name);
        firstPage. Search(name);
    }

    @And("Change the language to \"Español\"")
    public void changeLanguage()
    {
        step("Change the language from En(English) to En(Español)");
        firstPage.ChangeLanguage();
    }

    @And("Click on the search button")
    public void navigate()
    {
        step("Click on the search button");
        firstPage.Submit();
    }
    @Then("Article page for \"Albert Einstein\" is displayed")
    public void verifyArticlePageIsOpen()
    {
        step("Verify that the Article Page for" +name+ "is displayed in Spanish language");
        Assert.assertTrue(firstPage.isArticlePageOpen(),"Article Page is not open");
    }
}
