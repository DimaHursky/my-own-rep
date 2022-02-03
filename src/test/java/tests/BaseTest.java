package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import utils.DriverConfiguration;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    protected WebDriver driver;

    public BaseTest() {
        driver = DriverConfiguration.createDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
