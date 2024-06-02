package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class confirmationPage {

    private final WebDriver driver;

    public confirmationPage(WebDriver driver){  //constructeur
        this.driver = driver;
    }

    private WebElement confirmationOrderBtn;
   
    //Cliquer sur le bouton pour confirmer la commande
    public void confirmOrder(){
        confirmationOrderBtn =  driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));
        confirmationOrderBtn.click();
    }
}
