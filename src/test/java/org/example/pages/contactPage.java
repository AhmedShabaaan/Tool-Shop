package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class contactPage {
    public  contactPage(){
        PageFactory.initElements(driver , this);
    }
    @FindBy (xpath = "//a[@data-test='nav-contact' and @href='/contact' and normalize-space(text())='Contact']")
    public WebElement ContactPage;

    @FindBy (id = "first_name")
    public WebElement FirstName;

    @FindBy (id = "last_name")
    public WebElement LastName;

    @FindBy (id = "email")
    public WebElement Email;

    @FindBy (id = "subject")
    public WebElement Subject;

    @FindBy (xpath = "//textarea[@data-test='message' and @id='message' and @formcontrolname='message']")
    public WebElement Message;

    @FindBy (className = "btnSubmit")
    public WebElement Sendbtn;
}
