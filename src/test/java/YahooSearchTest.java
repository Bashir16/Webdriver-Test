import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooSearchTest {

    WebDriver driver;

    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Diana\\Desktop\\Portnov Schl\\JavaWebdriver\\src\\test\\resources\\geckodriver.exe");
    }

    @Test
    public void test0011() {
        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitSearch();
        waitForResultsPage();
        assertResultsPage();
    }

    private void waitForResultsPage() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".SrQkLnk > div:nth-child(1)")));
    }

    private void assertResultsPage() {
        boolean isResultStatsDisplayed = driver.findElement(By.cssSelector(".SrQkLnk > div:nth-child(1)")).isDisplayed();
        Assert.assertTrue(isResultStatsDisplayed);
    }

    private void submitSearch() {
        String selector = "#header-search-input";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.submit();
    }

    private void typeQuery() {
        String selector = "#header-search-input";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys("portnov");
    }

    private void navigateToMainPage() {
        driver.get("https://yahoo.com");
    }

    private void openBrowser() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
