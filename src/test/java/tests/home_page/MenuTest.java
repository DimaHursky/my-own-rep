//package tests.home_page;
//
//import org.assertj.core.api.SoftAssertions;
//import org.junit.jupiter.api.Test;
//import pages.*;
//import tests.AuthorizedTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class MenuTest extends AuthorizedTest {
//
//    protected MenuPage menuPage;
//    protected SettingsPage settingsPage;
//    protected LoginPage loginPage;
//
//
//
//    public MenuTest () {
//        super();
//        menuPage = new MenuPage(driver);
//        settingsPage = new SettingsPage(driver);
//        loginPage = new LoginPage(driver);
//    }
//
//
//
//    /**
//     * Test whether the menu will be displayed after pressing MenuBatton
//     */
//    @Test
//    public void testIsHdnMenuDsp() {
//
//
//        homePage.clkMenuBtn();
//        assertTrue(menuPage.isHdnMenuDsp(), "The menuBtn does not work properly");
//    }
//
//    /**
//     * Test whether the LoginButton element is displayed
//     */
//    @Test
//    public void testIsLogInDsp() {
//
//        homePage.clkMenuBtn();
//        assertTrue(menuPage.isLogInDsp(), "There is no LogIn item in the Menu");
//    }
//
//    /**
//     * Test whether the SingUpButton element is displayed
//     */
//    @Test
//    public void testIsSingUpDsp() {
//
//        homePage.clkMenuBtn();
//        assertTrue(menuPage.isSignUpDsp(), "There is no SignUp item in the Menu");
//    }
//
//    /**
//     * Test whether the Main button works
//     */
//    @Test
//    public void testMainBtn() {
//
//        homePage.clkMenuBtn()
//                .clkUserSettingsBtn();
//
//        menuPage.clkMainBtn();
//
//        assertTrue(homePage.isInptFieldDsp(), "Main button don't work correctly");
//    }
//
//    /**
//     * Test whether you switch to LoginPage by clicking the LogIn button
//     */
//    @Test
//    public void testLogInBtn() {
//
//         homePage.clkMenuBtn()
//                .clkLoginBtn();
//
//        assertTrue(loginPage.isDivLoginDsp(), "There is no SignUp item in the Menu");
//
//
//    }
//
//    // TODO: 20.01.2022
//    /**
//     * Test whether you switch to SignupPage by clicking the SingUp button
//     */
//    @Test
//    public void testSignUpBtn() {
//
//        homePage.clkMenuBtn()
//                .clkSignupBtn();
//        String actual = driver.getCurrentUrl();
//        String expected = "https://ttrackster.herokuapp.com/signup";
//        assertEquals(actual, expected, "Going to the signup page is incorrect");
//    }
//
//    // --------------------------------------------------------------------------------
//
//    /**
//     * Check whether the User Menu is displayed after user authorization
//     */
//    @Test
//    public void testIsUserMenuDsp() {
//
//        homePage.clkMenuBtn();
//
//        SoftAssertions softAssertions = new SoftAssertions();
//
//        softAssertions.assertThat(menuPage.isUserMainDsp())
//                .withFailMessage("UserMain isn't displayed").isTrue();
//        softAssertions.assertThat(menuPage.isUserParselDsp())
//                .withFailMessage("UserParsel isn't displayed").isTrue();
//        softAssertions.assertThat(menuPage.isUserSetingsDsp())
//                .withFailMessage("UserSetings isn't displayed").isTrue();
//        softAssertions.assertThat(menuPage.isUserLogOutDsp())
//                .withFailMessage("UserLogOut isn't displayed").isTrue();
//
//        softAssertions.assertAll();
//    }
//
//   /* *//**
//     * Check the transition to the MyParcels page after click
//     *//*
//    @Test
//    public void testUserParselBtn() {
//
//        myParcelsPage.clkMenuBtn()
//                .clkUserParselBtn();
//
//        assertTrue(myParcelsPage.isTrckNbrFldDisplayed(), "There is no SignUp item in the Menu");
//
//        homePage.clkMenuBtn().clkUserLogOutBtn();
//    }*/
//
//    /**
//     * Check the transition to the Settings page after click
//     */
//    @Test
//    public void testUserSettingsBtn() {
//
//        homePage.clkMenuBtn()
//                .clkUserSettingsBtn();
//
//        assertTrue(settingsPage.findheadingProfile(), "Problem settins");
//
//        homePage.clkMenuBtn().clkUserLogOutBtn();
//
//    }
//
//    /**
//     * Check log out correctly after clicking on the LogOut button
//     */
//    @Test
//    public void testUserLogOutBtn() {
//
//        homePage.clkMenuBtn()
//                .clkUserLogOutBtn()
//                .clkMenuBtn();
//
//        SoftAssertions softAssertions = new SoftAssertions();
//
//        softAssertions.assertThat(menuPage.isHdnMenuDsp())
//                .withFailMessage("Menu isn't displayed").isTrue();
//        softAssertions.assertThat(menuPage.isLogInDsp())
//                .withFailMessage("LogIn isn't displayed").isTrue();
//        softAssertions.assertThat(menuPage.isSignUpDsp())
//                .withFailMessage("SingUp isn't displayed").isTrue();
//
//        softAssertions.assertAll();
//
//    }
//
//}
