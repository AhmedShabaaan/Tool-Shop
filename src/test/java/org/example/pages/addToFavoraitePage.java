
package org.example.pages;
import static org.example.stepDefs.Hooks.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class addToFavoraitePage {
    public addToFavoraitePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "nav-link")
    public WebElement home;
    @FindBy(css = "input[name=\"category_id\"]")
    public WebElement select;
    @FindBy(css = "img[alt=\"Hammer\"]")
    public WebElement choose;
    @FindBy(id = "btn-add-to-favorites")
    public WebElement add;
    @FindBy(id = "menu")
    public WebElement menu;
    @FindBy(css = "a[href=\"/account/favorites\"]")
    public WebElement myfavourite;
    @FindBy(css = "p[data-test=\"product-description\"]")
    public WebElement sure;
}
