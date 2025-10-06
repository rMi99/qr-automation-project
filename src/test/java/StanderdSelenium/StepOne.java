package StanderdSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepOne {
    public static void main(String[] args) throws InterruptedException {
        //create a web driver object to communicate and mange the web browser
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://online-qr-generator.com");


    }
}
