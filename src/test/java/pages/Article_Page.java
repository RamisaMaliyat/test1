package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Article_Page extends Form
{

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By tools = By.id("vector-page-tools-dropdown-label");
    private final ILabel SelectTools = AqualityServices.getElementFactory().getLabel(tools, "success");

    private final By PageInformation = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Page information"));
    private final IButton PageInformationLink = elementFactory.getButton(PageInformation,"Page Information");


    public Article_Page()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "wikipedia")),"Second_Page");
    }

    public void SelectToolMenu()
    {
        //AqualityServices.getBrowser().executeScript("arguments[0].click();", SelectTools.getElement());
        SelectTools.getJsActions().click();
    }

   public void clickPageInformation()
   {

       PageInformationLink.click();
   }

}
