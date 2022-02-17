package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends BasePage {
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    private final By forgotPasswordLogoImg = By.xpath("//img[@src='/static/media/forgot-password.b7dfb23a.svg']");
    //private final By forgotPasswordLogoImg = By.cssSelector("img[src='/static/media/forgot-password.b7dfb23a.svg']")
    private final By troubleLoggingInTxt = By.cssSelector("h4.MuiTypography-root.MuiTypography-h4");
    private final By enterYourEmailTxt = By.xpath("//p[contains(@class, 'MuiTypography-subtitle1')]");
    private final By userEmailFld = By.cssSelector("input[name='email']");
    private final By signUpBtn = By.xpath("(//a[@href='/signup'])[2]");
    private final By backToLogInBtn = By.xpath("(//a[@href='/login'])[2]");
    private final By sendLinkBtn = By.xpath("//span[@class='MuiButton-label']");
    private final By dontHaveAnAccountTxt = By.cssSelector("p.MuiTypography-root.MuiTypography-body2.MuiTypography-alignCenter");
    private final By messageAboutRecoveryPassw = By.xpath("//div[@class='MuiAlert-message']");

    public boolean isForgotPasswordLogoImgDsp() {
        return driver.findElement(forgotPasswordLogoImg).isDisplayed();
    }

    public boolean isTroubleLoggingInTxtDsp() {
        return driver.findElement(troubleLoggingInTxt).isDisplayed();
    }

    public boolean isEnterYourEmailTxtDsp() {
        return driver.findElement(enterYourEmailTxt).isDisplayed();
    }

    public boolean isUserEmailFldDsp() {
        return driver.findElement(userEmailFld).isDisplayed();
    }

    public boolean isSendLinkBtnDsp() {
        return driver.findElement(sendLinkBtn).isDisplayed();
    }

    public boolean isSignUpBtnDsp() {
        return driver.findElement(signUpBtn).isDisplayed();
    }

    public boolean isBackToLogInBtnDsp() {
        return driver.findElement(backToLogInBtn).isDisplayed();
    }

    public boolean isDontHaveAnAccountTxtDsp() {
        return driver.findElement(dontHaveAnAccountTxt).isDisplayed();
    }

    public boolean isMessageAboutRecoveryPasswDspl() {
        return driver.findElement(messageAboutRecoveryPassw).isDisplayed();
    }

    public ForgotPasswordPage clkSendLinkBtn() {
        driver.findElement(sendLinkBtn).click();
        return new ForgotPasswordPage(driver);
    }

    public ForgotPasswordPage clkBackToLogInBtn() {
        driver.findElement(backToLogInBtn).click();
        return new ForgotPasswordPage(driver);
    }

    public ForgotPasswordPage clkSignUpBtn() {
        driver.findElement(signUpBtn).click();
        return new ForgotPasswordPage(driver);
    }

    public ForgotPasswordPage inserEmailFld(String email) {
        WebElement userEmailWait = driver.findElement(userEmailFld);
        userEmailWait.sendKeys(email);
        return this;
    }
}
