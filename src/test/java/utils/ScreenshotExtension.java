package utils;

import io.qameta.allure.Allure;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.lang.reflect.Field;

public class ScreenshotExtension implements TestWatcher {

    @Override
    public void testFeiled(ExtensionContext context, Throwable throwable) throws NoSuchFieldException, IllegalAccessException {
        Object instance = context.getRequiredTestInstance();
        Field field = instance.getClass().getDeclaredField("driver");
        field.setAccessible(true);
        WebDriver driver =
                ((ThreadLocal<WebDriver>)instance
                        .getClass()
                        .getDeclaredField("driver")
                        .get(instance)).get();
        Allure.getLifecycle().addAttachment(
                "Screenshot",
                "image/png",
                "pmg",
                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)
        );
    }

}
