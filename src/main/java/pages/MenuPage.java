package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }


//    private final By hdnMenu = By.xpath
//            ("//*[@id=\"root\"]/div/div[1]/div/div");
    private final By hdnMenu = By.cssSelector
            ("div.jss1 > div.MuiDrawer-root.MuiDrawer-docked > div");

    private final By loginBtn = By.xpath
            ("//span[contains(.,'Log In')]");
//    private final By loginBtn = By.cssSelector
//            ("div.MuiPaper-root.MuiDrawer-paper.MuiDrawer-paperAnchorLeft.MuiDrawer-paperAnchorDockedLeft.MuiPaper-elevation0 > ul:nth-child(5) > a:nth-child(1)");

    private final By signupBtn = By.xpath
            ("//span[contains(.,'Sign Up')]");
//    private final By signupBtn = By.cssSelector
//            ("div > ul:nth-child(5) > a:nth-child(2) > div.MuiListItemText-root > span");

    private final By mainBtn = By.xpath
            ("//span[contains(.,'Main')]");
//    private final By mainBtn = By.cssSelector
//            ("div > ul:nth-child(3) > a:nth-child(1) > div.MuiListItemText-root > span");


    private final By userParsel = By.xpath
            ("//span[contains(.,'My Parcels')]");
//    private final By userParsel = By.cssSelector
//            ("div > ul:nth-child(3) > a.MuiButtonBase-root.MuiListItem-root.jss10.MuiListItem-gutters.MuiListItem-button.active > div.MuiListItemText-root > span");


    private final By userSettings = By.xpath
            ("//span[contains(.,'Settings')]");
 //   private final By userSettings = By.cssSelector
 //           ("div.MuiPaper-root.MuiDrawer-paper.MuiDrawer-paperAnchorLeft.MuiDrawer-paperAnchorDockedLeft.MuiPaper-elevation0 > ul:nth-child(3) > a:nth-child(3)");


    private final By userLogOut = By.xpath
            ("//span[contains(.,'Log Out')]");


//  It needs to be changed because there are problems with localization, or finds another element

//  private final By userLogOut = By.cssSelector
//            ("div > ul:nth-child(5) > a > div.MuiListItemText-root > span");

    private final By burgerBtn = By.xpath
            ("//button[@class='MuiButtonBase-root MuiIconButton-root']");

    public HeaderPage clkBurgerBtn() {
        waitElementIsVisible(burgerBtn).click();
        return new HeaderPage(driver);
    }

    public LoginPage clkLoginBtn() {
        waitElementIsVisible(loginBtn).click();
        return new LoginPage(driver);
    }

    public SignupPage clkSignupBtn() {
        waitElementIsVisible(signupBtn).click();
        return new SignupPage(driver);
    }

    public HomePage clkMainBtn() {
        waitElementIsVisible(mainBtn).click();
        return new HomePage(driver);
    }

    // ------------------------------------------------------

    public MyParcelsPage clkUserParselBtn() {
        waitElementIsVisible(userParsel).click();
        return new MyParcelsPage(driver);
    }

    public HomePage clkUserSettingsBtn() {
        waitElementIsVisible(userSettings).click();
        return new HomePage(driver);
    }

    public HomePage clkUserLogOutBtn() {
        waitElementIsVisible(userLogOut).click();
        return new HomePage(driver);
    }

    // ------------------------------------------------------

    public boolean isLogInDsp() {
        return waitElementIsVisible(loginBtn).isDisplayed();
    }

    public boolean isSignUpDsp() {
        return waitElementIsVisible(signupBtn).isDisplayed();
    }

    public boolean isHdnMenuDsp() {
        return waitElementIsVisible(hdnMenu).isDisplayed();
    }

    // ------------------------------------------------------

    public boolean isUserMainDsp() {
        return waitElementIsVisible(mainBtn).isDisplayed();
    }
    public boolean isUserParselDsp() {
        return waitElementIsVisible(userParsel).isDisplayed();
    }
    public boolean isUserSetingsDsp() {
        return waitElementIsVisible(userSettings).isDisplayed();
    }
    public boolean isUserLogOutDsp() {
        return waitElementIsVisible(userLogOut).isDisplayed();
    }
    public boolean isBurgerBtnDsp() {
        return waitElementIsVisible(burgerBtn).isDisplayed();
    }

    private final By tracksterHdng = By.xpath
            ("//h6[@class=\"MuiTypography-root jss4 MuiTypography-h6\"]");

    public boolean isTracksterHdngDsp() {
        return waitElementIsVisible(tracksterHdng).isDisplayed();
    }
}

