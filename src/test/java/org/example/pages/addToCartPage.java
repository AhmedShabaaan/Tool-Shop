package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class addToCartPage {
    public addToCartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-test='nav-home' and @href='/' and normalize-space(text())='Home']")
    public WebElement HomeTab;

    @FindBy(xpath = "//a[@data-test='nav-categories' and normalize-space(text())='Categories']")
    public WebElement Categories;

    @FindBy(xpath = "//a[@data-test='nav-hand-tools' and @href='/category/hand-tools' and normalize-space(text())='Hand Tools']")
    public WebElement HandTools;

    @FindBy(className = "card-title")
    public WebElement Pliers;

    @FindBy(xpath = "//button[@data-test='increase-quantity' and @id='btn-increase-quantity']")
    public WebElement Increase;

    @FindBy(id = "btn-add-to-cart")
    public WebElement AddToCart;

    @FindBy(xpath = "//svg[@data-icon='cart-shopping']")
    public WebElement CartIcon;
}