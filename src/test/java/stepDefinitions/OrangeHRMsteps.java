package stepDefinitions;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class OrangeHRMsteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));



    }
    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        wait.until(ExpectedConditions.titleContains("OrangeHRM"));
        System.out.println("This is cucumber test on pushxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Thread.sleep(8000);

    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {


        boolean status = driver
                .findElement(By.cssSelector("img[alt='company-branding']"))
                .isDisplayed();

    }
    @Then("close browser")
    public void close_browser() {
        driver.close();

    }

}
