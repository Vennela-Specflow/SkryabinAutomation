package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.ScreenshotUtil;
import utility.UiInteractables;


import java.time.Duration;

import static hooks.Hooks.*;

public class SkryabinPageFunctions extends UiInteractables {

    public void submit() {
        UiInteractables.clickByID(driver, elementReader.get("submit_button"));
    }

    public void enterfullname( ) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        UiInteractables.clickByID(driver, elementReader.get("nameLocator"));
       UiInteractables.sendKeysByID(driver, elementReader.get("firstNameLocator"), reader.get("firstName"));
       UiInteractables.sendKeysByID(driver, elementReader.get("middleNameLocator"), reader.get("secondName"));
       UiInteractables.sendKeysByID(driver, elementReader.get("lastNameLocator"), reader.get("lastName"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        UiInteractables.clickByXpath(driver, elementReader.get("saveButton"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        UiInteractables.clickByID(driver, elementReader.get("refreshLocator"));
    }
public void validate_emptytextbox()
{
        String actualText = "";
        String expectedText = UiInteractables.GetText(driver,elementReader.get("firstNameLocator"));
        Assert.assertEquals("Name cleared as expected",actualText,expectedText);
}
public void enter_emailaddress_username()
{
UiInteractables.sendKeysByXpath(driver, elementReader.get("emailIdLocator"),reader.get("emailID") );
UiInteractables.sendKeysByXpath(driver, elementReader.get("usernameLocator"),reader.get("username") );
}
public void enter_passwords_phonenumber(){
    UiInteractables.sendKeysByID(driver, elementReader.get("passwordskryabinLocator"), reader.get("password"));
    UiInteractables.sendKeysByID(driver, elementReader.get("confirmpasswordLocator"), reader.get("confirmpassword"));
    UiInteractables.sendKeysByXpath(driver, elementReader.get("phoneNumberLocator"),reader.get("phoneNumber") );
    UiInteractables.switchToIframe(0);
    UiInteractables.sendKeysByID(driver, elementReader.get("contactpersonLocator"), reader.get("contactperson"));
    UiInteractables.sendKeysByID(driver, elementReader.get("contactpersonphoneLocator"), reader.get("contactpersonphone"));
    UiInteractables.switchTomainframe();
}
public void verifyprivacypolicyerrormessage(){
UiInteractables.assertText(driver, elementReader.get("actual"), reader.get("expected"));
   }
   public void enterusername(){
       UiInteractables.sendKeysByXpath(driver, elementReader.get("usernameLocator"),reader.get("username") );
   }
public void emailidvalidation()
{
    UiInteractables.assertTexts(driver, elementReader.get("actualerror"), reader.get("expectederror"));

}
public void click_documents_link()
{
        UiInteractables.clickByXpath(driver, elementReader.get("relateddocumentsLocator"));
}
public void validate_Documents_Windows_Is_Opened() throws InterruptedException {
    UiInteractables.switchToNextTab(By.xpath(elementReader.get("relateddocumentsLocator")));
}
    public void switchBack_To_MainWindow() {
UiInteractables.switchBackToMainTab();
    }
    }

