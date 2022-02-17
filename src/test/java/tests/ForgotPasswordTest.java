package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.DriverConfiguration;
import utils.YAMLDeserializer;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverConfiguration.USER_NAME;
import static utils.DriverConfiguration.USER_PASSWORD;

@Story("Tests for ForgotPasswordPage")
public class ForgotPasswordTest extends BaseTest {

    protected ForgotPasswordPage forgotPasswordPage;
    protected LoginPage loginPage;
    protected SignupPage signupPage;

    public ForgotPasswordTest() {
        super();

        forgotPasswordPage = new ForgotPasswordPage(driver);
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        super.beforeEach();
        loginPage = headerPage.clkMenuBtn()
                .clkLoginBtn();
    }

    @Test
    @DisplayName("Verify that all elements is displayed an the ForgotPasswordPage")
    public void findElements() {

        SoftAssertions softAssertions = new SoftAssertions();
        loginPage.clkForgotPasswordBnt();

        softAssertions.assertThat(forgotPasswordPage.isForgotPasswordLogoImgDsp())
                .withFailMessage("Forgot Password Logo Img isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isTroubleLoggingInTxtDsp())
                .withFailMessage("Trouble Logging In Txt isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isEnterYourEmailTxtDsp())
                .withFailMessage("Enter Your Email Txt isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isUserEmailFldDsp())
                .withFailMessage("User Email Fld isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isSendLinkBtnDsp())
                .withFailMessage("Send Link Btn isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isSignUpBtnDsp())
                .withFailMessage("Sign Up Btn isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isBackToLogInBtnDsp())
                .withFailMessage("Back To Log In Btn isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isDontHaveAnAccountTxtDsp())
                .withFailMessage("Don't Have An Account Txt isn't displayed").isTrue();
    }

    @Test
    @DisplayName("Verify that the the 'Back to Log In' button are redirect user to main page")
    @Description("The user redirect from the \"Forgot Password\" page to the \"Login Page\"")
    public void isTheUserBackToLofinPage() {
        loginPage.clkForgotPasswordBnt()
                .clkBackToLogInBtn();
        assertTrue(forgotPasswordPage.isUserEmailFldDsp(), "Email Field isn't displayed");
    }

    //TODO add the nwe password from the email
    @Test
    @DisplayName("Verify that user is able to recover the password")
    @Description("Open the recover the password for email 'DimaTracksterTest@gmail.com' the password '12345Hur'")
    public void submitFrgotPassword() {
        loginPage.clkForgotPasswordBnt()
                .inserEmailFld(USER_NAME)
                .clkSendLinkBtn();
        assertTrue(forgotPasswordPage.isMessageAboutRecoveryPasswDspl(), "The message 'If we find a user with this email address, we will send a password reset mail' " +
                "isn't displayed when the user recover the password");
    }

    @Test
    @DisplayName("Verify that the user is able to sign up from the forgot password page")
    public void isSignUpPageDspl() {
        loginPage
                .clkForgotPasswordBnt()
                .clkSignUpBtn();
        assertTrue(signupPage.isSignUpImgDsp(), "Sign Up page isn't displayed");
    }
}