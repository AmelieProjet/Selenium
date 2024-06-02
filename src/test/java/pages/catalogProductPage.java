package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class catalogProductPage {
    private final WebDriver driver; 

    public catalogProductPage(WebDriver driver){ //constructeur
        this.driver = driver;
    }
    
    private WebElement productName;
    public void clickProduct(String productItemName){
        productName = driver.findElement(By.xpath("//img[@title='" + productItemName + "']"));
        productName.click();
    }
}
