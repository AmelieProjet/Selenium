package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mainMenu {
    private final WebDriver driver; 

    public mainMenu(WebDriver driver){ //constructeur
        this.driver = driver;
    }
    private WebElement menu;
    private WebElement subMenu;
    //on va créer une fonction pour gérer les menus - avec en paramètre le nom désiré
    public void selectMenu(String menuName){
        menu = driver.findElement(By.xpath("//span[contains(text(),'" + menuName + "')]"));
       
        //Instantiating Actions class
        Actions actions = new Actions(driver);
        //Hovering on main menu
        actions.moveToElement(menu).perform();
    }
    public void selectsubMenu(String subMenuName){
        subMenu = driver.findElement(By.xpath("//a[contains(text(),'" + subMenuName + "')]"));
        subMenu.click();
    }
    
}
