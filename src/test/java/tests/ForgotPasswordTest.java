package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.DriverConfiguration;
import utils.YAMLDeserializer;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverConfiguration.USER_NAME;
import static utils.DriverConfiguration.USER_PASSWORD;

public class ForgotPasswordTest extends BaseTest {

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected SignupPage signupPage;
    protected ForgotPasswordPage forgotPasswordPage;
    protected MyParcelsPage myParcelsPage;
    public static String USER_NAME;
    public static String USER_PASSWORD;
    public static String INVALID_USER_NAME;
    public static String INVALID_USER_PASSWORD;

    public ForgotPasswordTest() {
        super();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        signupPage = new SignupPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    @BeforeAll
    public static void beforeAll(){
        USER_NAME = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("user_name");
        USER_PASSWORD = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("user_password");
        INVALID_USER_NAME = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("invalid_user_name");
        INVALID_USER_PASSWORD = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("invalid-user_password");

    }
    /**
     * Test verify that all elements on Forgot Password page is displayed
     */
    @Test
    public void findElements() {

        SoftAssertions softAssertions = new SoftAssertions();
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .clkForgotPasswordBnt();

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

    /**
     * Open the forgot password page
     */
    @Test
    public void isEmailFieldIsDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .clkForgotPasswordBnt()
                .clkUserEmailFld();
        assertTrue(forgotPasswordPage.isUserEmailFldDsp(), "Email Field isn't displayed");
    }
    /** Open the forgot password page and back to Login Page
     *
     */
    @Test
    public void isTheUserBackToLofinPage() {
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .clkForgotPasswordBnt()
                .clkBackToLogInBtn();
        assertTrue(forgotPasswordPage.isUserEmailFldDsp(), "Email Field isn't displayed");
    }

//    /**
//     * Open the Sgn Up button  (The "signupPage" is not ready)
//     */
//    @Test
//    public void isSignUpPageDspl() {
//        homePage.clkMenuBtn()
//                .clkLoginBtn()
//                .clkForgotPasswordBnt()
//                .clkSignUpBtn();
//        assertTrue(signupPage., "Sign Up page isn't displayed");
//    }


//    @Test
//    public void submitFrgotPassword() {
//        homePage.clkMenuBtn()
//                .clkLoginBtn()
//                .clkForgotPasswordBnt()
//                .clkUserEmailFld()
//                .clkUserEmailFld()
//                .insertLoginFld(USER_NAME, USER_PASSWORD)
//                .clkSubmitLogin();
//
//        assertTrue(forgotPasswordPage.isBackToLogInBtnDsp(), "The Search button isn't displayed when the user is logged in");
//        homePage.clkMenuBtn().clkUserLogOutBtn();
//    }


}