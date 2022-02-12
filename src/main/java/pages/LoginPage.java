package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    /**
     * Xpath and CSS selectors for all elements on the "Login Page"
     */
    private final By divLogin = By.cssSelector("div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-6.MuiGrid-grid-lg-4");
    //private final By logInYourAccountTxt = By.cssSelector("h4.MuiTypography-gutterBottom");
    private final By logInYourAccountTxt = By.xpath("//h4[contains(@class, 'MuiTypography-gutterBottom')]");
    private final By userEmail = By.xpath("//input[@id= 'email']");
    //private final By emailFld = By.cssSelector ("input#email");
    private final By userPassword = By.xpath("(//input[contains(@class, 'MuiInputBase-input MuiOu')])[2]");
    //private final By passwordFld = By.cssSelector("input.MuiInputBase-input fieldset ");
    //private final By loginBnt = By.xpath("//span[@class='MuiButton-label']");
    private final By loginBtn = By.cssSelector("span[class='MuiButton-label']");  //TODO - Btn change to Link
    private final By forgotPasswordBnt = By.xpath("//a[@href='/reset-password']");
    //private final By forgotPasswordBnt = By.cssSelector("a[href='/reset-password']");
    private final By loginWithGoogleBnt = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']");
    //private final By loginWithGoogleBnt = By.cssSelector("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']");
    //private final By loginWithFacebookBnt = By.cssSelector("img[class='jss65']");
    private final By loginWithFacebookBnt = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge'][1]");
    //private final By loginPageLogoImg  = By.xpath("//img[@src='/static/media/login-img.8fa56c8b.svg']");
    private final By loginPageLogoImg = By.cssSelector("img[alt='login-svg']");
    private final By dontHaveAnAccountTxt = By.cssSelector("h4.MuiTypography-root.MuiTypography-h4.MuiTypography-gutterBottom");
    //private final By dontHaveAnAccountTxt = By.xpath("//p[contains(@class, 'MuiTypography-root')])[2]");
    //private final By emailIsntValidText = By.xpath("//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error MuiFormHelperText-filled MuiFormHelperText-marginDense']");
    private final By erorTextEmailIsntValid = By.cssSelector("p.MuiFormHelperText-root.MuiFormHelperText-contained");
    //private final By errorMessageIncorrectEmailOrPassword = By.xpath("//div[@class='MuiAlert-message']");
    private final By errorMessageIncorrectEmailOrPassword = By.cssSelector("div.MuiAlert-message");


    /**
     * Methods to find elements on the "Login Page"
     */

    public boolean isDivLoginDsp() {
        return driver.findElement(divLogin).isDisplayed();
    }

    public boolean isLogInYourAccountTxtDsp() {
        return driver.findElement(logInYourAccountTxt).isDisplayed();
    }

    public boolean isEmailFieldBtnDsp() {
        return driver.findElement(userEmail).isDisplayed();
    }

    public boolean isPasswordFieldDsp() {
        return driver.findElement(userPassword).isDisplayed();
    }

    public boolean isLoginBtnDsp() {
        return driver.findElement(loginBtn).isDisplayed();
    }

    public boolean isForgotPasswordBtnDsp() {
        return driver.findElement(forgotPasswordBnt).isDisplayed();
    }

    public boolean isLoginWithGoogleBtnDsp() {
        return driver.findElement(loginWithGoogleBnt).isDisplayed();
    }

    public boolean isLoginWithFacebookDsp() {
        return driver.findElement(loginWithFacebookBnt).isDisplayed();
    }

    public boolean isLoginPageLogoImageDsp() {
        return driver.findElement(loginPageLogoImg).isDisplayed();
    }

    public boolean isDontHaveAnAccountTxtDsp() {
        return driver.findElement(dontHaveAnAccountTxt).isDisplayed();
    }

    public boolean isErrorTextEmailIsntValidDispl() {
        return driver.findElement(erorTextEmailIsntValid).isDisplayed();
    }

    public boolean isErrorMessageIncorrectEmailOrPasswordDispl() {
        return driver.findElement(errorMessageIncorrectEmailOrPassword).isDisplayed();
    }


    /**
     * The method to insert the email and password when the user login
     */
    public LoginPage insertLoginFld(String email, String password) {

        WebElement userEmailWait = waitElementIsVisible(userEmail);
        WebElement userPasswordWait = waitElementIsVisible(userPassword);
        userEmailWait.sendKeys(email);
        userPasswordWait.sendKeys(password);
        return this;
    }

    public MyParcelsPage clkSubmitLogin() { //todo - change naming

        waitElementIsVisible(loginBtn).click();
        return new MyParcelsPage(driver);
    }

    public ForgotPasswordPage clkForgotPasswordBnt() {

        WebElement forgotPasswordBntClk = waitElementIsVisible(forgotPasswordBnt);
        forgotPasswordBntClk.click();
        return new ForgotPasswordPage(driver);
    }

    public MyParcelsPage validLogin(String email, String password) {
        insertLoginFld(email, password);
        waitElementIsVisible(loginBtn).click();
        return new MyParcelsPage(driver);
    }

    public HomePage invalidLogin(String email, String password) {
        insertLoginFld(email, password);
        waitElementIsVisible(loginBtn).click();
        return new HomePage(driver);
    }

}
