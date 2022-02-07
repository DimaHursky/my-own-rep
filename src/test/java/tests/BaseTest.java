package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.HomePage;
import utils.DriverConfiguration;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    public BaseTest() {

        driver = DriverConfiguration.createDriver();
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
