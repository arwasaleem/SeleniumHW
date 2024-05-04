package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWFacebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement account= driver.findElement(By.linkText("Create new account"));
        account.click();

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Arwa");
        Thread.sleep(2000);

        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Saleem");
        Thread.sleep(2000);

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("arwasaleem.2@gmail.com");
        Thread.sleep(2000);

        WebElement password= driver.findElement(By.id("password_step_input"));
        password.sendKeys("pass123!");
        Thread.sleep(2000);

    }
}
