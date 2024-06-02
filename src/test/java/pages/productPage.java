package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
    private final WebDriver driver;

    public productPage(WebDriver driver){ //constructeur
        this.driver = driver;
    }


    private WebElement addToCartBtn;
    public void addToCart(){
        addToCartBtn = driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[2]"));
        addToCartBtn.click();
    }
}



