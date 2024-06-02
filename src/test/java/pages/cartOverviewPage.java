package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartOverviewPage {
    private final WebDriver driver;

    public cartOverviewPage(WebDriver driver){ //constructeur
        this.driver = driver;
    }
    
    private WebElement viewCartBtn;
    public void cartOverview(){
        viewCartBtn = driver.findElement(By.xpath("//a[contains(text(),'View Cart')]"));
        viewCartBtn.click();
    }
}
