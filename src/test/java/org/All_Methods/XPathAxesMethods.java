package org.All_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPathAxesMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='input-firstname']//following::input[1]")).sendKeys("Kedar");

        driver.findElement(By.xpath("//input[@value='Continue']//ancestor::div[1]/a")).click();

        driver.navigate().refresh();


        String actualText = driver.findElement(By.xpath("//a[text()='login page']//parent::p")).getText();
        if(actualText.equals("If you already have an account with us, please login at the login page.")){
            System.out.println("Text is matching");
        }
        else{
            System.out.println("Text is not matching");
        }

        driver.findElement(By.xpath("//input[@name='agree']//following-sibling::input")).click();

        driver.findElement(By.xpath("//div[@id='account-register']//descendant::input[4]")).sendKeys("kedar.evolve@gmail.com");

    }
}
