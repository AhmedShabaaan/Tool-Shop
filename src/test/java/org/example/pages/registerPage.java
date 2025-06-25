package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends pageBase
{

    @FindBy(xpath = "//a[@data-test='nav-sign-in' and @href='/auth/login' and contains(text(), 'Sign in')]")
    public WebElement signin;
    @FindBy(xpath = "//a[@data-test='register-link' and @href='/auth/register' and contains(text(), 'Register your account')]")
    public WebElement registerTab;

    @FindBy(id = "first_name")
    public WebElement FirstName;

    @FindBy (id = "last_name")
    public WebElement LastName;

    @FindBy(id = "dob")
    public WebElement BirthDate;

    @FindBy(id = "street")
    public WebElement Street;

    @FindBy(id = "postal_code")
    public WebElement PostalCode;

    @FindBy(id = "city")
    public WebElement City;

    @FindBy(id ="state" )
    public WebElement State ;

    @FindBy(id = "country")
    public WebElement Country ;

    @FindBy(id = "phone")
    public WebElement Phone ;

    @FindBy(id = "email")
    public WebElement Email ;

    @FindBy(id = "password")
    public WebElement  Password;

    @FindBy(className = "btnSubmit")
    public WebElement RegisterBtn;

}
