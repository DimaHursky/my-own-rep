package tests.home_page;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.MenuPage;
import tests.BaseTest;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest {
    protected MenuPage menuPage;

    public HomePageTest() {
        super();
        menuPage = new MenuPage(driver);
    }

    @Test
    public void verifyThatAllElementsAreDisplayed() {
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(homePage.isTbrDsp())
                .withFailMessage("Tbr isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnMenuDsp())
                .withFailMessage("BtnMenu isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgLogoDsp())
                .withFailMessage("ImgLogo isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLnkLogoDsp())
                .withFailMessage("LnkLogo isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnListBoxDsp())
                .withFailMessage("BtnListBox isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isHdngFindYourParcelDsp())
                .withFailMessage("HeadingFindYourParcel isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isInptFieldDsp())
                .withFailMessage("InputFold isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnInptSrchDsp())
                .withFailMessage("BtnInputSearch isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnSrchByPhotoDsp())
                .withFailMessage("BtnSearchByPhoto isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgFastTrackingDsp())
                .withFailMessage("ImgLabelFastTracking isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLbFastTrackingDsp())
                .withFailMessage("LabelFastTracking isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLbIntuitiveInterfaceDsp())
                .withFailMessage("LabelIntuitiveInterface isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgIntuitiveInterfaceDsp())
                .withFailMessage("ImgLabelIntuitiveInterface isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLbArchiveParcelsDsp())
                .withFailMessage("LabelArchiveParcels isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgArchiveParcelsDsp())
                .withFailMessage("ImgLabelArchiveParcels isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isHdngOurPartnersDsp())
                .withFailMessage("HedingOurParnters isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgNovaPoshtaDsp())
                .withFailMessage("ImgNovaPoshta isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgJustinDsp())
                .withFailMessage("ImgJustin isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgDhlDsp())
                .withFailMessage("ImgDHL isn't displayed").isTrue();

        softAssertions.assertAll();
    }

    /**
     * Verify that User Is Able To Open Menu
     */
    @Test
    public void verifyThatUserIsAbleToClkMenuBtnToOpen() {
        homePage.clkMenuBtn();
        assertTrue(menuPage.isTracksterHdngDsp(), "Menu button doesn't work correctly");
    }

    /**
     * Verify that User Is Able To Change Language on Page
     * Change English to Ukrainian
     */
    @Test
    public void verifyThatChangingEngToUaIsPossible() {
        homePage.clkListBoxBtn()
                .clkUaBtn();
        assertTrue(homePage.isUaHdngDisplayed(), "Language isn't correct");
    }

    /**
     * Verify that User Is Able To Change Language on Page
     * Change Ukrainian to English
     */
    @Test
    public void verifyThatChangingUaToEngIsPossible() {
        homePage.clkListBoxBtn()
                .clkUaBtn()
                .clkListBoxBtn()
                .clkEngBtn();
        assertTrue(homePage.isEngHdngDisplayed(), "Language isn't correct");
    }
}
