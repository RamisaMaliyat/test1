package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PageInformation_page extends Form
{
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By InformationPageTitleLocator = By.id("firstHeading");
    private final ILabel InformationPageTitle = elementFactory.getLabel(InformationPageTitleLocator, "ArticleTitle");
    public PageInformation_page()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "wikipedia")),"PageInformation_page");
    }


    public boolean isInformationPageOpen()
    {

        return InformationPageTitle.state().isDisplayed();
    }
}
