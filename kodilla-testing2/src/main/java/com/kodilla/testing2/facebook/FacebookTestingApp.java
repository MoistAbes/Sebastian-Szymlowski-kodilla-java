package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_CREATE_ACCOUNT = "//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]";

    public static final String XPATH_SELECT_DAY = "//*[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//*[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//*[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        //click accept cookies
        driver.findElement(By.xpath(XPATH_COOKIES)).click();

        //click create new account
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //select birth date
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByIndex(24);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(4);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByIndex(25);

    }
}
