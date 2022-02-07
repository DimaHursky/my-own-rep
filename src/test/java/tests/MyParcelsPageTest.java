package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.MyParcelsPage;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.*;
import static utils.DriverConfiguration.USER_NAME;
import static utils.DriverConfiguration.USER_PASSWORD;

public class MyParcelsPageTest extends BaseTest {
    protected MyParcelsPage myParcelsPage;
    protected MenuPage menuPage;
    protected LoginPage loginPage;
    protected HomePage homePage;

    public MyParcelsPageTest() {
        super();
        myParcelsPage = new MyParcelsPage(driver);
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        myParcelsPage.open(DriverConfiguration.BASE_URL);
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME,USER_PASSWORD)
                .clkSubmitLogin();
    }

    @Test
    public void verifyThatAllElementsAreDisplayed() {
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(myParcelsPage.isTrckNbrFldDisplayed())
                .withFailMessage("trckNbrFld isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isBtnSrchDisplayed())
                .withFailMessage("btnSrch isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isFbrDisplayed())
                .withFailMessage("fbr isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbStatusDisplayed())
                .withFailMessage("lbStatus isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isChkReceivedDisplayed())
                .withFailMessage("chkReceived isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbReceivedDisplayed())
                .withFailMessage("lbreceived isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbServiceDisplayed())
                .withFailMessage("lbService isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isChkNovaPoshtaDisplayed())
                .withFailMessage("chkNovaPoshta isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isBtnParcelDisplayed())
                .withFailMessage("btnParcel isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isImgNovaPoshtaDisplayed())
                .withFailMessage("imgNovePoshta isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isNmbParcelDisplayed())
                .withFailMessage("nmbParcel isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isStDeliveredDisplayed())
                .withFailMessage("stDelivered isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isBtnDltParcelDisplayed())
                .withFailMessage("btnDltParcel isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isBtnMoreInfoBParcelDisplayed())
                .withFailMessage("btnMoreInfoBParcel isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbOriginDisplayed())
                .withFailMessage("lbOrigin isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isNameOriginDisplayed())
                .withFailMessage("nameOrigin isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isDisTimeDisplayed())
                .withFailMessage("disTime isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbDestinationDisplayed())
                .withFailMessage("lbDestination isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isNameDestinationDisplayed())
                .withFailMessage("nameDestination isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isDelTimeDisplayed())
                .withFailMessage("delTime isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbInfoDisplayed())
                .withFailMessage("lbInfo isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbWeightDisplayed())
                .withFailMessage("lbWeight isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isStLbWeightDisplayed())
                .withFailMessage("stLbWeight isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbDelCostDisplayed())
                .withFailMessage("lbDelCost isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isStLbDelCostDisplayed())
                .withFailMessage("stLbDelCost isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbCostDisplayed())
                .withFailMessage("lbCost isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isStLbCostDisplayed())
                .withFailMessage("stLbCost isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbDepartmentDisplayed())
                .withFailMessage("lbDepartment isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isStLbDepartmentDisplayed())
                .withFailMessage("stLbDepartment isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLbStatusParcelDisplayed())
                .withFailMessage("lbStatusParcel isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isStStatusParcelDisplayed())
                .withFailMessage("stStatusParcel isn't displayed").isTrue();
        softAssertions.assertThat(myParcelsPage.isLnkMoreInfoDisplayed())
                .withFailMessage("lnkMoreInfo isn't displayed").isTrue();
    }

    /**
     * Verify that Authorized User Is Able To Input His track number in Track Number Field
     * and search it among his parcels BY ENTER
     */
    @Test
    public void verifyThatUserIsAbleToInputTrackNumber() {
        myParcelsPage.inpTrckNbrAndClkEnter();
        String expected = "20450498476837";
        String actual = myParcelsPage.getParcelNumber();
        assertEquals(expected, actual, "Incorrect track number 20450498476837");
    }

    /**
     * Verify that Authorized User Is Able To Input His Track Number In Track Number Field
     * And Search It Among His Parcels BY SEARCH BUTTON
     */
    @Test
    public void verifyThatUserIsAbleToSearchHisTrackNumberBySearchButton() {
        myParcelsPage.inpTrckNbrAndClkBtnSrch();
        String expected = "20450498476837";
        String actual = myParcelsPage.getParcelNumber();
        assertEquals(expected, actual, "Incorrect track number 20450498476837");
    }

    /**
     * Verify That Authorized User Is Able To Hide His Received Parcels In FilterBar
     */
    @Test
    public void verifyThatUserIsAbleToHideHisReceivedParcels() {
        myParcelsPage.clkChkReceived();
        assertTrue(myParcelsPage.isntBtnParcelDsp(), "Checkbox Received doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Able To Hide His Parcels Delivered To NovaPoshta
     */
    @Test
    public void verifyThatUserIsAbleToHideHisParcelsByNovaPoshta() {
        myParcelsPage.clkChkNovaPoshta();
        assertTrue(myParcelsPage.isntBtnParcelDsp(), "Checkbox Nova Poshta doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Able To Click on Parcel to Open More Info About It
     */
    @Test
    public void verifyThatUserIsAbleToOpenMoreInfoBParcelByParcelBtn() {
        myParcelsPage.clkBtnParcel();
        assertTrue(myParcelsPage.isTbrParcelDsp(), "Parcel Button doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Able To Click on button to Open More Info About His Parcel
     */
    @Test
    public void verifyThatUserIsAbleToOpenMoreInfoBParcelByBtnMoreInfoBParcel() {
        myParcelsPage.clkBtnMoreInfoBParcel();
        assertTrue(myParcelsPage.isTbrParcelDsp(), "Button More Info About Parcel doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Able To Click on button To Delete His Parcel
     */
    @Test
    public void verifyThatUserIsAbleDeleteHisParcel() {
        myParcelsPage.clkBtnDltParcel();
        assertTrue(myParcelsPage.isntBtnParcelDsp(), "Button Delete Parcel doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Able To Change Language On Page
     * Change English to Ukrainian
     */
    @Test
    public void verifyThatChangingEngToUaIsPossible() {
        homePage.clkListBoxBtn()
                .clkUaBtn();
        assertTrue(myParcelsPage.isUaStatusDsp(), "Language isn't correct");
    }

    /**
     * Verify That Authorized User Is Able To Change Language On Page
     * Change Ukrainian to English
     */
    @Test
    public void verifyThatChangingUaToEngIsPossible() {
        homePage.clkListBoxBtn()
                .clkUaBtn()
                .clkListBoxBtn()
                .clkEngBtn();
        assertTrue(myParcelsPage.isEngStatusDsp(), "Language isn't correct");
    }

    /**
     * Verify That Authorized User Is Able To Follow to HomePage by Main button
     */
    @Test
    public void verifyThatUserIsAbleToFollowToHomePageByMainBtn() {
        homePage.clkMenuBtn()
                .clkMainBtn();
        assertTrue(homePage.isHdngFindYourParcelDsp(), "Main Button doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Abe To Follow to HomePage by link Logo
     */
    @Test
    public void verifyThatUserIsAbleToFollowToHomePageByLnkLogo() {
        homePage.clkLnkLogo();
        assertTrue(homePage.isHdngFindYourParcelDsp(), "Main Button doesn't work correctly");
    }

    /**
     * Verify That Authorized User Is Able To Follow to SettingsPage by Settings button
     */
    /*@Test
    public void verifyThatUserIsAbleToFollowToSettingsPageBySettingsBtn() {

    }*/

    /**
     * Verify That Authorized User Is Able To Log out by Log out button
     */
    @Test
    public void verifyThatUserIsAbleToLogOutByLogoutBtn() {
        homePage.clkMenuBtn()
                .clkLogOutBtn();
        assertTrue(homePage.isHdngFindYourParcelDsp(), "Log Out Button doesn't work correctly");
    }

    @AfterEach
    public void tearDown() {
        //logOut
        driver.manage().deleteAllCookies();
        super.tearDown();
    }
}
