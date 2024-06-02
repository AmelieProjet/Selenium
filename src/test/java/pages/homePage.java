package pages;

import org.openqa.selenium.WebDriver;

public class homePage {
    
    private final WebDriver driver; 

    public homePage(WebDriver driver){ //constructeur
        this.driver = driver;
    }

    private String homeUrl = "https://ecommerce-playground.lambdatest.io/index.php"; //attribut home URL

    public void isPageVisible (){ //on crée la méthode à utiliser : vérifier si on est sur la bonne page
        String homePageUrl = driver.getCurrentUrl();
        System.out.println("Mon URL : " + homePageUrl); // on veut afficher la valeur de homePage dans la console pour vérifier que tout fonctionne bien
        assert(homePageUrl.equals(homeUrl));
    }

}
