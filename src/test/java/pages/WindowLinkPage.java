package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class WindowLinkPage extends Form
{
    IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By WindowHeaderLocator = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Windows Links and Examples"));

    private final ILabel WindowHeader = elementFactory.getLabel(WindowHeaderLocator,"Window Link Example Header");


    private final By AlertInWindow = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Alerts In A New Window From JavaScript"));

    private final IButton AlertWindow = elementFactory.getButton(AlertInWindow,"Window Link Example Header");



    public WindowLinkPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Windows Links and Examples")),"First page");
    }

    public boolean isHeaderDisplayed()
    {
        return WindowHeader.state().isDisplayed();
    }

    public void AlertInOpen()
    {
        AlertWindow.click();
    }

}
