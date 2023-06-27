package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ElementsPage extends AbstractPageObject {
    private final By buttons_button = By.xpath("//span[text()='Buttons']");
    private final By web_tables_button = By.xpath("//span[text()='Web Tables']");
    private final String url = "https://demoqa.com/elements";
    public ElementsPage(WebDriver driver) {
        super(driver);
        driver.get(url);
    }
    public ButtonsPage clickButtonsButton(){
        getElement(buttons_button).click();
        return new ButtonsPage(driver);
    }
    public WebTablesPage clickWebTablesButton(){
        getElement(web_tables_button).click();
        return new WebTablesPage(driver);
    }
}
