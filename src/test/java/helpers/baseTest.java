package helpers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class baseTest {
    protected WebDriver driver;    

    public void OuvrirApplication(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php");
    }
    @SuppressWarnings("deprecation")
    @BeforeMethod
    public void StartSession(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amélie\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void StopSession(){
         driver.quit();
    }
}