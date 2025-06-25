package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class login {
    loginPage log = new loginPage();
    @Given("user go to login page")
    public void gotologin(){
        log.loginTab.click();


    }

    @When("user enter valid email already is registered")
    public void userEnterValidEmailAlreadyIsRegistered() {
        log.Email.sendKeys(configreader.get("email"));
    }

    @And("user enter his password")
    public void userEnterHisPassword() {
        log.PassWord.sendKeys(configreader.get("password"));
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        log.LoginBtn.click();
    }
    SoftAssert soft = new SoftAssert();
    @Then("user go to the home page")
    public void userGoToTheHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://practicesoftwaretesting.com/account"));
        String realurl = driver.getCurrentUrl();
        soft.assertEquals(realurl,"https://practicesoftwaretesting.com/account");
        System.out.println(log.result.getText());

        soft.assertAll();
    }

    @When("user enter invalid email that is not register password")
    public void userEnterInvalidEmailThatIsNotRegisterPassword() {
        Faker fake = new Faker();
        log.Email.sendKeys(fake.internet().emailAddress());
        log.PassWord.sendKeys(fake.internet().password());
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        SoftAssert soft = new SoftAssert();
        String expectedMassage = "Invalid email or password";
        soft.assertEquals(log.errorMessage.getText().trim(), expectedMassage,"error massage not like the expected");
        String expectedColor = "rgba(248, 215, 218, 1)";
        soft.assertEquals(log.color.getCssValue("background-color"),expectedColor ,"background not like the expected");
        soft.assertAll();
    }
}
