package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import pages.*;
import utils.SettingsTestData;
import java.io.File;

public class Reused_VariablesTest
{
    String name = "Albert Einstein";
    String expectedFileName = "Albert_Einstein.pdf";
    static Main_Page firstPage = new Main_Page();
    Article_Page secondPage = new Article_Page();

    Download_File_Page thirdPage = new Download_File_Page();

    PageInformation_page pageInformationPage = new PageInformation_page();

    public final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    protected final File downloadedFile = new File(FILE_PATH);

    WindowLinkPage windowLinkPage = new WindowLinkPage();
    AlertBox alertBox = new AlertBox();

    protected Browser browser = AqualityServices.getBrowser();
 String text = "Accept and Change Prompt";

}
