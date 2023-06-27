package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
public class WebTablesPage extends AbstractPageObject {
    private final By add_button = By.xpath("//button[text()='Add']");
    private final By first_name_field = By.cssSelector("#firstName");
    private final By last_name_field = By.cssSelector("#lastName");
    private final By email_field = By.cssSelector("#userEmail");
    private final By age_field = By.cssSelector("#age");
    private final By salary_field = By.cssSelector("#salary");
    private final By department_field = By.cssSelector("#department");
    private final By submit_button = By.cssSelector("#submit");
    private final By edit_button = By.cssSelector("#edit-record-4");

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }
    public void openRegistrationForm(){
        getElement(add_button).click();
    }
    @Step("A user fills the form")
    public WebTablesPage fillForm(String firstName, String lastName, String email,String age, String salary, String department){
        WebElement firstNameField = getElement(first_name_field, 4);
        WebElement lastNameField = getElement(last_name_field, 4);
        WebElement emailField = getElement(email_field, 4);
        WebElement ageField = getElement(age_field, 4);
        WebElement salaryField = getElement(salary_field, 4);
        WebElement departmentField = getElement(department_field, 4);
        WebElement submitButton = getElement(submit_button, 4);

        firstNameField.clear();
        firstNameField.sendKeys(firstName);

        lastNameField.clear();
        lastNameField.sendKeys(lastName);

        emailField.clear();
        emailField.sendKeys(email);

        ageField.clear();
        ageField.sendKeys(age);

        salaryField.clear();
        salaryField.sendKeys(salary);

        departmentField.clear();
        departmentField.sendKeys(department);

        submitButton.click();

        return new WebTablesPage(driver);
    }
    public boolean checkRowExists(String email) {
        By emailPath = By.xpath(String.format("//div[text()='%s']", email));
        try {
            getElement(emailPath);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    public void openEditForm(){
        getElement(edit_button).click();
    }
}
