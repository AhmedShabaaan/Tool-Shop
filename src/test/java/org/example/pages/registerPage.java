package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends pageBase
{


    @FindBy(className = "nav-link")
    public WebElement registerTab;
}
