package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPageFunctions;
import pages.SkryabinPageFunctions;
import utility.UiInteractables;

import java.time.Duration;

import static com.google.common.util.concurrent.Futures.submit;
import static hooks.Hooks.driver;
import static hooks.Hooks.reader;

public class SkryabinPageSteps {

    SkryabinPageFunctions skryabinFunctions = new SkryabinPageFunctions();

    @Given("I am on the Skryabin page")
    public void navigateToLoginPage() {
        driver.get(reader.get("skryabin_url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("I am clicking submit button without providing inputs")
    public void clicksubmitbutton()
    {
        skryabinFunctions.submit();
    }

    @Then("I validate all error messages")
    public void verifyerrormessages() {
        String error_message = "This field is required." ;
        String UI_errormessage = driver.findElement(By.id("email-error")).getText();
        Assert.assertEquals("both strings are not equal", error_message, UI_errormessage);
    }
    @When("I enter the first middle and last Name and click on refresh button")
        public void enterusername(){
        // driver.findElement(By.id("firstName")).sendKeys("Nisha");
           // driver.findElement(By.id("middleName")).sendKeys("k");
           // driver.findElement(By.id("lastName")).sendKeys("pathak");
          //  driver.findElement(By.id("formrefresh")).click();
        skryabinFunctions.enterfullname();
        }
    @Then("The name text is cleared successfully")
    public void validate_emptytextbox()
    {
        skryabinFunctions.validate_emptytextbox();
       }

    @And("I am entering email address and username")
    public void enteremailaddressusername()
    {
        skryabinFunctions.enter_emailaddress_username();
    }
    @And("I enter valid passwords and phone number")
    public void enter_passwords_phonenumber()
    {
        skryabinFunctions.enter_passwords_phonenumber();
    }
   @And("I am entering contact name and contact number")
    public void entercontactnamenumber(){

       skryabinFunctions.enter_passwords_phonenumber();
   }
    @When("I click on submit")
    public void clicksubmit_button()
    {
        skryabinFunctions.submit();
    }
    @Then("I see error message in accepting the privacy policy")
    public void verifyprivacypolicyerrormessage()
    {
         skryabinFunctions.verifyprivacypolicyerrormessage();
    }
    @And("I am entering username")
    public void enteruser_name()
    {
 skryabinFunctions.enterusername();
    }
    @Then("I see the error message to enter the email")
    public void emailid_validation()
    {
       skryabinFunctions.emailidvalidation();
    }
    @When("I click on the Related documents link")
    public void click_relateddocuments()
        {
       skryabinFunctions.click_documents_link();
    }
    @Then("a new Documents window should be opened")
public void validateDocumentsWindowsIsOpened() throws InterruptedException {
skryabinFunctions.validate_Documents_Windows_Is_Opened();
    }
    @And("I switch back to the main window")
    public void switchBackToMainWindow(){
       UiInteractables. switchBackToMainTab();

    }
}




