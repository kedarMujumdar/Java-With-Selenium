package org.All_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegisterAccountPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Kedar");
        driver.findElement(By.id("input-lastname")).sendKeys("Mujumdar");
        driver.findElement(By.id("input-email")).sendKeys("kedar.evolve@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("8668418319");
        driver.findElement(By.name("password")).sendKeys("Kedar@2021");
        driver.findElement(By.name("confirm")).sendKeys("Kedar@2021");
        driver.findElement(By.linkText("login page")).click();
        if(driver.findElement(By.linkText("Login")).isDisplayed()){
            System.out.println("Login link is displayed");
        }
        else{
            System.out.println("Login link is not displayed");
        }
        driver.navigate().back();
        driver.findElement(By.partialLinkText("login")).click();
        if(driver.findElement(By.partialLinkText("Log")).isDisplayed()){
            System.out.println("Login link is displayed");
        }
        else{
            System.out.println("Login link is not displayed");
        }
        driver.navigate().back();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for(WebElement button: buttons){
            System.out.println(button.getText());
        }
    }
}
