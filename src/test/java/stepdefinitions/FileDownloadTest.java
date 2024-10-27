package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.Navigation_Page;
import utils.FileUtil;

import static io.qameta.allure.Allure.*;

public class FileDownloadTest extends Reused_VariablesTest
{

   @When("Select {string} link from Tool menu on the Article page")
   public void selectDownloadPDFLink(String navigation)
    {
        step("From the Tool menu, choose" + navigation + "Link");
        Navigation_Page.getByLabel(navigation);
        thirdPage.clickDownloadPDFLink();
    }

    @And("Click on the \"Download\" button from Download as PDF page")
    public void clickOnDownloadButton()
    {
        step("Click the \"Download\" button");
        thirdPage.downloadAsPdf();
    }

    @Then("The \"Albert Einstein.pdf\" file is downloaded")
    public void IsFileDownloaded()
    {
        step("Check if the file is downloaded or not");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(FileUtil.isFileExist(downloadedFile));
        step("Check if the downloaded file name matches with the name provided on Download as PDF page");
        String ActualFileName = thirdPage.checkFileName();
        softAssert.assertEquals(expectedFileName,ActualFileName,"File is Incorrect");
        softAssert.assertAll();
    }

}
