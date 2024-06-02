package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class cartPage {
    private final WebDriver driver;

    public cartPage(WebDriver driver) { //constructeur
        this.driver = driver;
    }

    private WebElement quantityField;
    private WebElement updateQtyBtn;
    private WebElement checkoutBtn;
    private WebElement test;


    //Il y a trois actions différentes alors on crée trois méthodes différentes

    //1) trouver le champ pour la qté - remise à 0 puis entrer le valeur désirée
    public void setQuantity(String productQty){
        quantityField = driver.findElement(By.xpath("//input[contains(@name, 'quantity')]"));
        quantityField.clear();
        quantityField.sendKeys(productQty);

    }

    //2) confirmer la saisie
    public void updateQuantity() {

        test = driver.findElement(By.xpath("//tr/td[6]"));
        System.out.println(test.getText());

        // updateQtyBtn = driver.findElement(By.xpath("//button[@data-original-title='Update']/i/."));
        // updateQtyBtn.click(); 

        quantityField.sendKeys(Keys.ENTER);

    }

    //3) aller au checkout
    public void goToCheckout(){
        checkoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Checkout')]"));
        checkoutBtn.click();
    }
}
