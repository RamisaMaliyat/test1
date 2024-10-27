package pages;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.BooleanSupplier;

public class AlertBox extends Form
{
    IElementFactory elementFactory = AqualityServices.getElementFactory();

    private final By AlertPromptBox = By.id("promptexample");

    private final IButton AlertPrompt = elementFactory.getButton(AlertPromptBox,"Alert Prompt Box");

    private final ILabel lblResult = getElementFactory().getLabel(By.id("promptexplanation"), "Result");


    public AlertBox ()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Windows Links and Examples")),"First page");
    }

    public ILabel getLblResult() {
        return lblResult;
    }


    public void ClickAlertPromptBox()
    {
        AlertPrompt.getJsActions().scrollIntoView();
        AlertPrompt.click();
    }

    public void WaitUntilAlertDisplayed(){

        AqualityServices.getConditionalWait().waitFor(ExpectedConditions.alertIsPresent(),
        Duration.ofSeconds(120), Duration.ofMillis(300), "Alert is Present");

    }





}
