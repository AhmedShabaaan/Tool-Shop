package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registerPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class register {
    registerPage reg = new registerPage();
    @Given("user go to register page")
    public void gotorigister()
    {
        reg = new registerPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("please wait until loginTab reload");
        reg.signin.click();
        wait.until(ExpectedConditions.elementToBeClickable(reg.registerTab));
        reg.registerTab.click();


    }

    @When("user enter first and last name")
    public void userEnterFirstAndLastName() {
        reg.FirstName.sendKeys("mohamed");
        reg.LastName.sendKeys("ahmed");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        reg.BirthDate.sendKeys("002001/01/01");


    }

    @And("user enter the street")
    public void userEnterTheStreet() {
        reg.Street.sendKeys("Ibrahim Broadway");
    }

    @And("user enter postal code")
    public void userEnterPostalCode() {
        reg.PostalCode.sendKeys("773612");
    }

    @And("user enter the city")
    public void userEnterTheCity() {
        reg.City.sendKeys("Helwan");
    }

    @And("user enter the state")
    public void userEnterTheState() {
        reg.State.sendKeys("Cairo");
    }

    @And("user select the country")
    public void userSelectTheCountry() {
    reg.Country.sendKeys("Egypt");
    }

    @And("user enter the phone")
    public void userEnterThePhone() {
        reg.Phone.sendKeys("8998129011121");
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {

        Faker fake = new Faker();
        String email =  fake.internet().safeEmailAddress();
        configreader.set("email",email);
        reg.Email.sendKeys(email);
    }

    @And("user enter password")
    public void userEnterPassword() {
        reg.Password.sendKeys(configreader.get("password"));
    }
    @And("user click on register button")
    public void userClickOnRegisterButton() {
        reg.RegisterBtn.click();
    }
    SoftAssert soft = new SoftAssert();
    @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {
        String actual = reg.registerTab.getText().toLowerCase();
        String expected = "Register your account";
        soft.assertEquals(actual,expected.toLowerCase());
        soft.assertAll();
    }


}
