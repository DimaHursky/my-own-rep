package tests.home_page;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.HomePage;
import pages.SrchFldPage;
import tests.BaseTest;
import utils.DriverConfiguration;
import model.TestData;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.YAMLDeserializer.fromFileToMap;


public class FindParcelTest extends BaseTest {

    protected SrchFldPage srchFldPage;
    protected HomePage homePage;
    protected BasePage basePage;
    private static TestData testData;

    public FindParcelTest() {
        super();
        srchFldPage = new SrchFldPage(driver);
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
    }

    @BeforeAll
    static void beforeAll() {

            testData = new TestData();
            Map<String, String> map = fromFileToMap("testData.yaml");
            testData.setCorrectIds(map.get("correctIds"));
            testData.setIncorrectIds(map.get("incorrectIds"));

    }

    @BeforeEach
    public void beforeEach() {
        srchFldPage.open(DriverConfiguration.BASE_URL);
    }

    /**
     * Test window not found parcel
     */
    @Test
    public void testNFndDlv() {

        String invalidTrackNumb = testData.getIncorrectIds();
        homePage.srchFldParse(invalidTrackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isNFoundFldDsp(), "There must be a mistake");
    }

    /**
     * Test whether the search for a valid track number works
     */
    @Test
    public void testResultSrchDsp() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isResultSrchDsp(), "Something is wrong with finding a parcel");
    }

    /**
     * Check that all fields of advanced Details are displayed
     */
    @Test
    public void testBtnDetailsDsp() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch()
                .clkBtnDetails();

        assertTrue(srchFldPage.isMoreDetailsDsp(), "There must be a mistake");
    }

    /**
     * Check the presence of the Details button
     */
    @Test
    public void testIsBtnDetailsDsp() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isBtnDetailsDsp(), "There must be a mistake");
    }

    /**
     * Check the presence of the search field
     */
    @Test
    public void IsFldSrchDsp() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isFldSrchDsp(), "There must be a mistake");
    }

    /**
     * Test whether the search works correctly on SrchFldPage
     */
    @Test
    public void testSrchWork() {

        String trackNumb = testData.getCorrectIds();

        homePage.srchFldParse("")
                .clkBtnInptSrch()
                .parseFldSrch(trackNumb)
                .clkBtnSrch();

        assertTrue(srchFldPage.isResultSrchDsp(), "There must be a mistake");
    }






}