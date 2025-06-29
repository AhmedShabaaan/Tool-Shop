package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.addToCartPage;
import org.example.pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;


public class addtocart {
    addToCartPage add = new addToCartPage();
    @Given("the user is on the homepage")
    public void gotohome(){
        add.HomeTab.click();
    }

    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() throws InterruptedException {
        loginPage login = new loginPage();
        login.loginTab.click();
        login.Email.sendKeys(configreader.get("email"));
        login.PassWord.sendKeys("PassWorrddddd123@@@");
        login.LoginBtn.click();
        Thread.sleep(4000);
        add.HomeTab.click();


    }

    @And("navigates to the products page")
    public void navigatesToTheProductsPage() throws InterruptedException {
        add.Categories.click();
        add.HandTools.click();
        Thread.sleep(4000);




    }

    @And("adds a product to the cart")
    public void addsAProductToTheCart() throws InterruptedException {
        Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        add.Pliers.click();
        add.AddToCart.click();
    }

    @Then("the product appears in the cart")
    public void theProductAppearsInTheCart() {
    }

    @And("the cart icon reflects the correct item count")
    public void theCartIconReflectsTheCorrectItemCount() {
    }
}
