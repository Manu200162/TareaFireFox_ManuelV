import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFireFox2 {
    FirefoxDriver firefoxDriver;

    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://aviation-access.netlify.app/");
    }

    @Test
    public void goToFireFox() throws InterruptedException {
        Thread.sleep(2000);
        firefoxDriver.findElement(By.xpath("//*[@id=\"root\"]/main/section[1]/article[1]/a")).click();
        Thread.sleep(5000);
        firefoxDriver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/section/div/form/div[2]/div/button[2]")).click();
        Thread.sleep(3000);
        firefoxDriver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/section[2]/div/article[1]/div/a")).click();
        Thread.sleep(4000);
        firefoxDriver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/section[2]/section/div[2]/a")).click();
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser(){
        firefoxDriver.quit();
    }
}
