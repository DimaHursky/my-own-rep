package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SrchFldPage extends BasePage {
    public SrchFldPage(WebDriver driver) {
        super(driver);
    }

    /*
    private final By fldSrch = By.cssSelector
            ("input.MuiInputBase-input");
    private final By btnSrch = By.cssSelector
            ("button[type='submit'].MuiButtonBase-root.MuiIconButton-root");
    private final By nFoundFld = By.cssSelector
            ("div.not-found");
    private final By resultSrch = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded");
    private final By btnDetails = By.cssSelector
            ("button p.MuiTypography-root.MuiTypography-body1");
    private final By headerDetails = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded div:nth-child(4) div:nth-child(1)");
    private final By bodyDetails = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded div:nth-child(4) div:nth-child(4)");
    private final By statusDetails = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded div:nth-child(4) div:nth-child(5)");
     */

    private final By fldSrch = By.xpath
            ("//div/form/div/input");
    private final By btnSrch = By.xpath
            ("//form/button[1]");
    private final By nFoundFld = By.xpath
            ("//div[contains(@class, 'not-found')]");
    private final By resultSrch = By.xpath
            ("//*[@id=\"root\"]/div/div[2]/div[2]");
    private final By btnDetails = By.xpath
            ("//button/p[contains(@class, 'MuiTypography-body1')]");
    private final By headerDetails = By.xpath
            ("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div[1]");
    private final By bodyDetails = By.xpath
            ("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div[3]");
    private final By statusDetails = By.xpath
            ("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div[4]");


    public SrchFldPage parseFldSrch(String req) {
        waitElementIsVisible(fldSrch).sendKeys(req);
        return this;
    }

    public SrchFldPage clkBtnSrch() {
        waitElementIsVisible(btnSrch).click();
        return this;
    }

    public SrchFldPage clkBtnDetails() {
        waitElementIsVisible(btnDetails).click();
        return this;
    }

    public boolean isFldSrchDsp() {
        return waitElementIsVisible(fldSrch).isDisplayed();
    }

    public boolean isBtnDetailsDsp() {
        return waitElementIsVisible(btnDetails).isDisplayed();
    }

    public boolean isResultSrchDsp() {
        return waitElementIsVisible(resultSrch).isDisplayed();
    }

    public boolean isNFoundFldDsp() {
        return waitElementIsVisible(nFoundFld).isDisplayed();
    }

    public boolean isMoreDetailsDsp() {
        return (waitElementIsVisible(headerDetails).isDisplayed() && waitElementIsVisible(bodyDetails).isDisplayed() && waitElementIsVisible(statusDetails).isDisplayed());
    }

}
