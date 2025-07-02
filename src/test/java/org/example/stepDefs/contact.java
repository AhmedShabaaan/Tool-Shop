package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.contactPage;

public class contact {
    contactPage con = new contactPage();
    @Given("the user is on the contact page")
    public void goToContact() {
        con.ContactPage.click();
    }

    @When("the user enters a valid first name")
    public void theUserEntersAValidFirstName() {
        con.FirstName.sendKeys("ahmed");
    }

    @And("the user enters a valid last name")
    public void theUserEntersAValidLastName() {
        con.LastName.sendKeys("Shabaan");
    }

    @And("the user enters a valid email address")
    public void theUserEntersAValidEmailAddress() {
        con.Email.sendKeys(configreader.get("email"));

    }

    @And("the user selects a valid subject from the dropdown")
    public void theUserSelectsAValidSubjectFromTheDropdown() {
        con.Subject.sendKeys("Subject line");

    }

    @And("the user types a valid message")
    public void theUserTypesAValidMessage() {
        con.Message.sendKeys("I recently purchased a product from your store and wanted to share my feedback. The experience was smooth and the support team was very helpful ");
    }

    @And("the user uploads a valid .txt file")
    public void theUserUploadsAValidTxtFile() {
    }

    @And("the user clicks the Send button")
    public void theUserClicksTheSendButton() throws InterruptedException {
        con.Sendbtn.click();
        Thread.sleep(4000);
    }

    @Then("a confirmation message should appear confirming successful submission")
    public void aConfirmationMessageShouldAppearConfirmingSuccessfulSubmission() {
    }
}
