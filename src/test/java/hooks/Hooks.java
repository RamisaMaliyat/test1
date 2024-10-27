package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static io.qameta.allure.Allure.step;

public class Hooks
{

    private Browser browser = AqualityServices.getBrowser();
    @Before
    public void setup()
    {
        step("Open browser and go to the site");
        browser =AqualityServices.getBrowser();
        step("Maximize browser");
        browser.maximize();
        step("Go to URL");
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }
    @After
    public void teardown()
    {
        step("Quit browser");
        browser.quit();
    }
}
