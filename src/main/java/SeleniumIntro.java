import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIntro {

    public static void main(String[] args){


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }
}
