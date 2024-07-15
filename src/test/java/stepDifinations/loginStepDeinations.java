package stepDifinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class loginStepDeinations{
    private WebDriver driver;
    public loginStepDeinations(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Given("User has Launched Application")
    public void user_has_Launched_Application() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("User Login to Application with below credentials")
    public void user_Login_to_Application_with_below_credentials(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data =dataTable.asMaps(String.class, String.class);
        driver.findElement(By.id("user-name")).sendKeys(data.get(0).get("UserName"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("Password"));

    }

    @When("User has clicked login button")
    public void user_has_clicked_login_button() {
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("User Verify the Items Count")
    public void user_Verify_the_Items_Count() {
        List<WebElement> addToCratsEmenets  = driver.findElements(By.xpath("//button[contains(text(),'Add to')]"));
        System.out.println("Size of Add To Cart "+addToCratsEmenets.size());
        Assert.assertEquals(6, addToCratsEmenets.size());
    }

    @Then("User Verify the Home Page Title")
    public void verifyItemPrice() {
    String titlePage = driver.getTitle();
        System.out.println("Page Title :: "+ titlePage);

    }


    @Then("User can close the Browser")
    public void userCanCloseTheBrowser() {
        driver.quit();
    }
}