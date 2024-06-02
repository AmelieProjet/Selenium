package tests;

import org.testng.annotations.Test;

import helpers.baseTest;
import pages.cartOverviewPage;
import pages.cartPage;
import pages.catalogProductPage;
import pages.checkoutPage;
import pages.confirmationPage;
import pages.endPage;
import pages.homePage;
import pages.mainMenu;
import pages.productPage;
import org.openqa.selenium.interactions.Actions;


public class firstTry extends baseTest {
    
    @Test
    public void firstTest() throws InterruptedException{
        //ouvrir le site
        OuvrirApplication();

        homePage home = new homePage(driver); //instanciation
        home.isPageVisible(); //on appelle la méthode

        mainMenu menu = new mainMenu(driver);
        menu.selectMenu("Mega Menu");
        menu.selectsubMenu("Apple");

        catalogProductPage catalog = new catalogProductPage(driver);
        catalog.clickProduct("iPod Nano");

        productPage product = new productPage(driver);
        product.addToCart();

        cartOverviewPage cartOverview = new cartOverviewPage(driver);
        cartOverview.cartOverview();

        cartPage cart = new cartPage(driver);
        cart.setQuantity("2");
        cart.updateQuantity();
        cart.goToCheckout();

        checkoutPage checkout = new checkoutPage(driver);
        checkout.Sélectionner_Option_PaiementSansCompte();
        checkout.ValiderConditions();
        checkout.SaisirNom("Toto");
        checkout.SaisirPrenom("Tata");
        checkout.SaisirEmail("tatatoto@yopmail.com");
        checkout.SaisirTelephone("56463165564");
        checkout.SaisirNomEntreprise("blabla");
        checkout.SaisirAdresse("5 rue des champignons");
        checkout.SaisirVille("Niort");
        checkout.SaisirCodePostal("79000");
        checkout.SelectionnerPays("France");
        checkout.SelectionnerRegion("Deux-Sèvres");
        checkout.ValiderPaiement();

        confirmationPage confirmPage = new confirmationPage(driver);
        confirmPage.confirmOrder();

        endPage end = new endPage(driver);
        end.continueAfterOrderPlacement();


    }
}
