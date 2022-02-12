package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    private final By signUpImg = By.cssSelector("div.MuiGrid-root.MuiGrid-container");


//    public boolean isSignUpImgDsp() {
//        return driver.findElement(signUpImg).isDisplayed();
//    }
//
//    public ForgotPasswordPage clkSignUpImgBtn() {
//        driver.findElement(signUpImg).click();
//        return new ForgotPasswordPage(driver);
//    }

    public boolean isSignUpImgspl() {
        return driver.findElement(signUpImg).isDisplayed();
    }
}
