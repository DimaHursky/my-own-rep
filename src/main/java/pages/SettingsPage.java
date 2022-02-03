package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class SettingsPage extends BasePage {
    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    private final By toolBar = By.xpath
            ("//header[@class = 'MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary MuiPaper-elevation0']");
    private final By menuButton = By.xpath
            ("//button @class='MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart']");
    private final By logoImg = By.cssSelector
            ("//img[src='/static/media/cardboard-box.e6f6462e.svg']");
    private final By followToLandingPageButton = By.xpath
            ("//a[@class='logo-link active']");
    private final By selectLanguageMenuButton = By.xpath
            ("//div[@aria-haspopup='listbox']");
    private final By headingProfile = By.xpath
            ("//h5[contains(text(),'Profile')]");
    private final By generalInformationText = By.xpath
            ("//h6[contains(text(),'General information about you')]");
    private final By emailField = By.xpath
            ("//div [@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-marginDense MuiOutlinedInput-marginDense']");
    private final By emailHelperText = By.xpath
            ("//p [@id='email-helper-text']");
    private final By phoneRegionButton = By.xpath
            ("//button [@class'MuiButtonBase-root MuiButton-root MuiButton-text MuiPhoneNumber-flagButton']");
    private final By phoneNumberField = By.xpath
            ("//input [@id='phone']");
    private final By updateProfileButton = By.xpath
            ("//button [@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss80 MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge MuiButton-disableElevation MuiButton-fullWidth']");
    private final By currentPasswordField = By.xpath
            ("//input [@id='current-password']");
    private final By newPasswordField = By.xpath
            ("//input [@id='new-password']");
    private final By confirmPasswordField = By.xpath
            ("//input [@id='password-confirmation']");
    private final By changePasswordButton = By.xpath
            ("//button [@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss89 MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge MuiButton-disableElevation MuiButton-fullWidth']");
    private final By iForgotMyPasswordUrl = By.xpath
            ("//a [@class='jss94']");
    //private final By referencebutton = By.xpath
           // ()

    /**
     * Find and click the phoneRegionButton
     */
    public SettingsPage clickPhoneRegionButton() {
        WebElement phoneRegionButtonFind = driver.findElement(phoneRegionButton);
        phoneRegionButtonFind.click();
        return this;
    }
    public SettingsPage changePassword(String password, String confirm){
        WebElement passwordInput = driver.findElement(newPasswordField);
        passwordInput.sendKeys(password);
        WebElement confirmPassword = driver.findElement(confirmPasswordField);
        confirmPassword.sendKeys(confirm);
        WebElement changePassword = driver.findElement(changePasswordButton);
        changePassword.click();
        return this;
    }
    /**
     * Methods find elements on page
     */
    public boolean findtoolBar() {return driver.findElement(toolBar).isDisplayed();}
    public boolean findmenuButton() {return driver.findElement(menuButton).isDisplayed();}
    public boolean findlogoImg() {return driver.findElement(logoImg).isDisplayed();}
    public boolean findfollowToLandingPageButton() {return driver.findElement(followToLandingPageButton).isDisplayed();}
    public boolean findselectLanguageMenuButton() {return driver.findElement(selectLanguageMenuButton).isDisplayed();}
    public boolean findheadingProfile() {return driver.findElement(headingProfile).isDisplayed();}
    public boolean findgeneralInformationText() {return driver.findElement(generalInformationText).isDisplayed();}
    public boolean findemailField() {return driver.findElement(emailField).isDisplayed();}
    public boolean findemailHelperText() {return driver.findElement(emailHelperText).isDisplayed();}
    public boolean findphoneRegionButton() {return driver.findElement(phoneRegionButton).isDisplayed();}
    public boolean findphoneNumberField() {return driver.findElement(phoneNumberField).isDisplayed();}
    public boolean findupdateProfileButton() {return driver.findElement(updateProfileButton).isDisplayed();}
    public boolean findcurrentPasswordField() {return driver.findElement(currentPasswordField).isDisplayed();}
    public boolean findnewPasswordField() {return driver.findElement(newPasswordField).isDisplayed();}
    public boolean findconfirmPasswordField() {return driver.findElement(confirmPasswordField).isDisplayed();}
    public boolean findchangePasswordButton() {return driver.findElement(changePasswordButton).isDisplayed();}
    public boolean findiForgotMyPasswordUrl() {return driver.findElement(iForgotMyPasswordUrl).isDisplayed();}
}

