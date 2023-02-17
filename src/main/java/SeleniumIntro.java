import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }
}
