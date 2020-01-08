import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChromeGoogleSearch {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\Diana\\Desktop\\Portnov Schl\\JavaWebdriver\\src\\test\\resources\\chromedriver12.exe");
    }

    @Test
    public void test0021() {
        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitSearch();
        waitForResultsPage();
        assertResultsPage();
    }

    private void waitForResultsPage() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
    }

    private void assertResultsPage() {
        boolean isResultStatsDisplayed = driver.findElement(By.id("resultStats")).isDisplayed();
        Assert.assertTrue(isResultStatsDisplayed);
    }

    private void submitSearch() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.submit();
    }

    private void typeQuery() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys("tv stand");
    }

    private void navigateToMainPage() {
        driver.get("https://google.com");
    }

    private void openBrowser() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
