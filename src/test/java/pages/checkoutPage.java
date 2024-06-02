package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class checkoutPage {
    
    private final WebDriver driver;

    public checkoutPage(WebDriver driver){  //constructeur
        this.driver = driver;
    }
    protected WebElement guest_account;
    protected WebElement firstname;
    protected WebElement lastname;
    protected WebElement email;
    protected WebElement telephone;
    protected WebElement companyName;
    protected WebElement address;
    protected WebElement city;
    protected WebElement postcode;
    protected WebElement comment;
    protected WebElement accord;
    protected WebElement btn_continue;
    protected WebElement pays;
    protected WebElement region;


    // public void SelectionnerPays(String value){
    //     driver.findElement(By.xpath("//select[@id=\"input-payment-country\"]/option[normalize-space()='"+value+"']")).click(); 
    // }

    public void SelectionnerPays(String value){
        driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]")).click(); 
        //driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]/option[80])")).click();
    }
    public void SelectionnerRegion(String value){
        driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]/option[25]")).click();
        
    }

    public void ValiderConditions(){
        accord = driver.findElement(By.xpath("//label[@for=\"input-agree\"]"));
        if (!accord.isSelected()) {
            accord.click();
        }
    }


    public void Sélectionner_Option_PaiementSansCompte(){
        guest_account = driver.findElement(By.xpath("//input[@id='input-account-guest']/.."));
        guest_account.click();
    }

    public void SaisirNom(String value){
        lastname = driver.findElement(By.xpath("//input[@id='input-payment-lastname']"));
        lastname.clear();
        lastname.sendKeys(value);
    }

    public void SaisirPrenom(String value){
        firstname = driver.findElement(By.xpath("//input[@id='input-payment-firstname']"));
        firstname.clear();
        firstname.sendKeys(value);
    }

    public void SaisirEmail(String value){
        email = driver.findElement(By.xpath("//input[@id='input-payment-email']"));
        email.clear();
        email.sendKeys(value);
    }

    public void SaisirTelephone(String value){
        telephone = driver.findElement(By.xpath("//input[@id='input-payment-telephone']"));
        telephone.clear();
        telephone.sendKeys(value);
    }

    public void SaisirNomEntreprise(String value){
        companyName = driver.findElement(By.xpath("//input[@id='input-payment-company']"));
        companyName.clear();
        companyName.sendKeys(value);
    }

    public void SaisirAdresse(String value){
        address = driver.findElement(By.xpath("//input[@id='input-payment-address-1']"));
        address.clear();
        address.sendKeys(value);
    }

    public void SaisirVille(String value){
        city = driver.findElement(By.xpath("//input[@id='input-payment-city']"));
        city.clear();
        city.sendKeys(value);
    }

    public void SaisirCodePostal(String value){
        postcode = driver.findElement(By.xpath("//input[@id='input-payment-postcode']"));
        postcode.clear();
        postcode.sendKeys(value);
    }

    public void SaisirCommentaire(String value){
        comment = driver.findElement(By.xpath("//textarea[@id='input-comment']"));
        comment.clear();
        comment.sendKeys(value);
    }

    public void ValiderPaiement(){
        btn_continue = driver.findElement(By.xpath("//*[@id=\"button-save\"]"));
        btn_continue.click();
    }    


}
