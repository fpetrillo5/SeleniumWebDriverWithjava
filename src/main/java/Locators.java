import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Locators {
    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello23");
        driver.findElement(By.className("submit")).click();
        System.out.println( driver.findElement(By.className("error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Paco");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("paco@wells.com");
        //driver.findElement(By.cssSelector("input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("610-456-7890");
        driver.findElement(By.className(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.className(".infoMsg")).getText());


        //driver.close();
    }
}
