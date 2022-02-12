package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class DriverConfiguration {
    public static WebDriver driver;
    public static String BASE_URL;
    public static Long IMPLICIT_WAIT;
    public static String UNK_SEARCH_PAGE_URL;
    public static String USER_NAME;
    public static String USER_PASSWORD;
    static {
        Properties properties = new Properties();
        try {
            InputStream input = new FileInputStream("src//test//resources//app.properties");
            properties.load(input);
            BASE_URL = properties.getProperty("base.url");
            UNK_SEARCH_PAGE_URL = properties.getProperty("find.url");

            USER_NAME = properties.getProperty("user.email");
            USER_PASSWORD = properties.getProperty("user.password");

            IMPLICIT_WAIT = Long.parseLong(properties.getProperty("implicit_wait"));
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static WebDriver createDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
