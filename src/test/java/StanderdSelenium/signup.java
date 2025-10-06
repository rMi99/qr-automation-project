package StanderdSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class signup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://online-qr-generator.com/register");
        Thread.sleep(3000);

        WebElement email_txt = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        WebElement password_txt = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        WebElement signup_btn = driver.findElement(By.xpath("//*[@id=\"register-form\"]/button"));

        email_txt.sendKeys("rashmi.rightmo54@test.com");
        password_txt.sendKeys("123");
        signup_btn.click();

        Thread.sleep(3000);

        WebElement websitecard_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[1]/button/div/input"));
        websitecard_btn.click();

        Thread.sleep(3000);
        WebElement url_txt = driver.findElement(By.xpath("//*[@id=\"url\"]"));
        WebElement urlicon_txt =driver.findElement(By.className("accodianRequired"));
        url_txt.sendKeys("https://www.linkedin.com/in/ras");

//
        Thread.sleep(3000);
        WebElement next_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next_btn.click();


        Thread.sleep(3000);
        WebElement popup_btn = driver.findElement(By.xpath("//*[@id=\"helpModal2\"]"));
        WebElement contiune_btn = driver.findElement(By.xpath("//*[@id=\"helpNextbtn\"]"));
        contiune_btn.click();

        Thread.sleep(3000);
        WebElement close_btn = driver.findElement(By.xpath("//*[@id=\"helpNextbtn\"]"));
        close_btn.click();

        Thread.sleep(3000);
        WebElement create_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create_btn.click();


        Thread.sleep(3000);
        WebElement step3popup_btn = driver.findElement(By.xpath("//*[@id=\"DownloadModal\"]/div/div"));
        WebElement downloadmodul_btn = driver.findElement(By.xpath("//*[@id=\"DownloadModal\"]/div/div/button/span"));
        downloadmodul_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode_btn.click();

        Thread.sleep(3000);
        WebElement listoflinkcard_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[11]/button/div/input"));
        listoflinkcard_btn.click();

        Thread.sleep(3000);
        WebElement listtitle_txt = driver.findElement(By.xpath("//*[@id=\"list_title\"]"));
        listtitle_txt.sendKeys("example");

        Thread.sleep(3000);
        WebElement save_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        save_btn.click();

        Thread.sleep(3000);
        WebElement create1_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create1_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode1_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode1_btn.click();

        Thread.sleep(3000);
        WebElement vcard_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[8]/button/div/input"));
        vcard_btn.click();

        Thread.sleep(3000);
        WebElement vcardname_txt = driver.findElement(By.xpath("//*[@id=\"vcard_first_name\"]"));
        vcardname_txt.sendKeys("kamal");

        Thread.sleep(3000);
        WebElement next1_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next1_btn.click();

        Thread.sleep(3000);
        WebElement create2_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create2_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode2_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode2_btn.click();

        Thread.sleep(3000);
        WebElement business_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[7]/button/div/input"));
        business_btn.click();

        Thread.sleep(3000);
        WebElement businessname_txt = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        businessname_txt.sendKeys("rightmo web solution");

        Thread.sleep(3000);
        WebElement next2_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next2_btn.click();

        Thread.sleep(3000);
        WebElement create3_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create3_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode3_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode3_btn.click();

        Thread.sleep(3000);
        WebElement vedio_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[4]/button/div/input"));
        vedio_btn.click();

        Thread.sleep(3000);
        WebElement vediolink_txt = driver.findElement(By.xpath("//*[@id=\"youTubeUrl\"]"));
        vediolink_txt.sendKeys("https://www.youtube.com/watch?v=epmgTKHHdsg");
        Thread.sleep(3000);
        WebElement addvedio_btn = driver.findElement(By.xpath("//*[@id=\"youtubeSubmit\"]"));
        addvedio_btn.click();

        Thread.sleep(3000);
        WebElement next3_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next3_btn.click();

        Thread.sleep(3000);
        WebElement create4_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create4_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode4_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode4_btn.click();

        Thread.sleep(3000);
        WebElement facebook_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[13]/button/div/input"));
        facebook_btn.click();

        Thread.sleep(3000);
        WebElement facebookurl_txt = driver.findElement(By.xpath("//*[@id=\"facebook_url\"]"));
        facebookurl_txt.sendKeys("https://www.facebook.com/profile.php?id=100077322437797");

        Thread.sleep(3000);
        WebElement next4_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next4_btn.click();

        Thread.sleep(3000);
        WebElement create5_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create5_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode5_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode5_btn.click();

        Thread.sleep(3000);
        WebElement intagram_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[14]/button/div/input"));
        intagram_btn.click();

        Thread.sleep(3000);
        WebElement intagramname_txt = driver.findElement(By.xpath("//*[@id=\"inst_username\"]"));
        intagramname_txt.sendKeys("rashi__");

        Thread.sleep(3000);
        WebElement next5_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next5_btn.click();

        Thread.sleep(3000);
        WebElement create6_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create6_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode6_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode6_btn.click();

        Thread.sleep(3000);
        WebElement socialmedia_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[15]/button/div/input"));
        socialmedia_btn.click();

        Thread.sleep(3000);
        WebElement socialmediatitle_txt = driver.findElement(By.xpath("//*[@id=\"social_title\"]"));
        socialmediatitle_txt.sendKeys("musix");

        Thread.sleep(3000);
        WebElement next6_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next6_btn.click();

        Thread.sleep(3000);
        WebElement create7_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create7_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode7_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode7_btn.click();

        Thread.sleep(3000);
        WebElement  whatsapp_btn = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div[16]/button/div/input"));
        whatsapp_btn.click();

        Thread.sleep(3000);
        WebElement  whatsappnumber_txt = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        whatsappnumber_txt.sendKeys("070 231 2650");

        Thread.sleep(3000);
        WebElement next7_btn = driver.findElement(By.xpath("//*[@id=\"temp_next\"]/div"));
        next7_btn.click();

        Thread.sleep(3000);
        WebElement create8_btn = driver.findElement(By.xpath("//*[@id=\"temp_submit\"]/div"));
        create8_btn.click();

        Thread.sleep(3000);
        WebElement createqrcode8_btn = driver.findElement(By.xpath("//*[@id=\"myQrCode\"]/div/section/div[1]/div/div/div[2]/div[2]"));
        createqrcode8_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement menu_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='step1']/div/div/div[6]/button")));
        menu_btn.click();



//        Thread.sleep(3000);
//        WebElement menupopup_btn = driver.findElement(By.xpath("//*[@id=\"helpCarousel1\"]/div"));
//        WebElement menudigital_btn = driver.findElement(By.xpath("//*[@id=\"helpCarousel1\"]/div/div/div/div[2]/button[1]/div[2]"));
//        menudigital_btn.click();









    }
}
