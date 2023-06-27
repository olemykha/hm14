package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ElementsPage;
import pageObjects.WebTablesPage;
public class WebTables extends Base{
    @Test
    public void testWebTablesPagePositive(){
        ElementsPage elementsPage = new ElementsPage(driver);
        WebTablesPage webTablesPage = elementsPage.clickWebTablesButton();

        webTablesPage.openRegistrationForm();
        webTablesPage.fillForm("Zoya", "Muha", "zoya.muha@gmail.com", "30","2000", "QAE");
        Assert.assertTrue(webTablesPage.checkRowExists("zoya.muha@gmail.com"));

        webTablesPage.openEditForm();
        webTablesPage.fillForm("Zoya", "Zhenata", "zoya.zhenata@gmail.com", "31","3500", "AQA");
        Assert.assertTrue(webTablesPage.checkRowExists("zoya.zhenata@gmail.com"));
    }
}
