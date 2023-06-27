package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ButtonsPage;
import pageObjects.ElementsPage;
public class Buttons extends Base{
    @Test
    public void testButtonsPagePositive(){
        ElementsPage elementsPage = new ElementsPage(driver);
        ButtonsPage buttonsPage = elementsPage.clickButtonsButton();
        buttonsPage.clickClickMeButton();
        String message = buttonsPage.getMessage();
        Assert.assertEquals(message,"You have done a dynamic click", "The message is wrong");
    }
}
