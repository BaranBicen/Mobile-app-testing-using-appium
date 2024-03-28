package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;

public class pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By postButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Post\")");
    By postYazmak = MobileBy.AndroidUIAutomator("new UiSelector().text(\"What’s happening?\")");
    By postbutonutiklama = MobileBy.AndroidUIAutomator("new UiSelector().text(\"POST\")");

    public pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void posttiklama() {
        driver.findElement(postButonu).click();
    }

    public void postyazma() {
        driver.findElement(postYazmak).click();
        elementHelper.sendKey(postYazmak,"Tweet");
    }

    public void postbutonunatiklama() {
        driver.findElement(postbutonutiklama).click();
    }

    public void profilbutonunatiklama() {
    }

    public void profilresminetiklama() {
    }

    public void postbegenme() {
    }

    public void geritusunabasma() {
    }
}
