package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class endPage {
    
    private final WebDriver driver;

    public endPage(WebDriver driver){  //constructeur
        this.driver = driver;
    }

    private WebElement confirmationMsg;
    private WebElement continueAfterConfirmation;
    //Message de confirmation de commande
 
    public void continueAfterOrderPlacement(){
        confirmationMsg = driver.findElement(By.xpath("//*[@id=\"content\"]/h1/i"));
        String message = confirmationMsg.getText(); //Récupérer le texte contenu dans WebElement confirmationMessage
        System.out.println(message); //Affiche dans la console pour contrôler
        String checkMessage = "Your order has been placed!"; //Message recherché
        assert (checkMessage.equals(message)); //Comparaison du message
   
    //cliquer sur le bouton pour continuer et revenir à la page d'accueil
        continueAfterConfirmation =  driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
        continueAfterConfirmation.click();
    }
}
