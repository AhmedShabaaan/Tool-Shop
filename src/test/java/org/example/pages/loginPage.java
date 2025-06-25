package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class loginPage
{
    public loginPage(){
        PageFactory.initElements(driver,this);}
    @FindBy(xpath = "//a[@data-test='nav-sign-in' and @href='/auth/login' and contains(text(), 'Sign in')]")
    public WebElement loginTab;

    @FindBy(id = "email")
    public WebElement Email;

    @FindBy(id ="password" )
    public WebElement PassWord;

    @FindBy(className = "btnSubmit")
    public WebElement LoginBtn;

    @FindBy(css = "a[routerlink=\"messages\"]")
    public WebElement result;

    @FindBy(css = "div[data-test='login-error'] .help-block")
    public WebElement errorMessage;
    @FindBy(className = "alert-danger")
    public WebElement color;


}
