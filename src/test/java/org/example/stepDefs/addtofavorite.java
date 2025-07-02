
package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;
import org.example.pages.addToFavoraitePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;


public class addtofavorite {
    addToFavoraitePage favourite = new addToFavoraitePage();

    @Given("user loged in and go home page")
    public void userGoToTheHomePage() {
        loginPage login = new loginPage();
        login.loginTab.click();
        login.Email.sendKeys(configreader.get("email"));
        login.PassWord.sendKeys("PassWorrddddd123@@@");
        login.LoginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://practicesoftwaretesting.com/account"));
        favourite.home.click();
    }

    @And("user navigates to the By category chekbox")
    public void userNavigatesToTheChekbox() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[name=\"category_id\"]"));
        checkboxes.get(1).click();

    }

    @When("the user clicks on the favorite product of their preferred tool")
    public void theUserClicksOnTheFavoriteProductOfTheirPreferredTool() {
        favourite.choose.click();
        favourite.add.click();

    }

    SoftAssert soft = new SoftAssert();
    @And("user click on my favourite")
    public void userClickOnMyFavourite() {
        favourite.menu.click();
        favourite.myfavourite.click();
    }
    @Then("the tool should be added to the user's favorites list")
    public void theToolShouldBeAddedToTheUserSFavoritesList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement sure = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("p[data-test='product-description']")
        ));

        String actual = sure.getText();
        String expected = "Mauris mollis odio est, ac vehicula dui lobortis" +
                " vel. Cras facilisis, mauris ut vehicula dignissim, ex nunc sollicitudin velit, a fermentum mi odio" +
                " ut massa. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a sapien vel libero fermen...";

        soft.assertEquals(actual, expected);
        soft.assertAll();
    }


}
