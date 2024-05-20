package gui.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    public WebDriver getDriver(){
        return this.driver;
    }

    @BeforeTest
    public void tearUp(){

        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("INFO: The Chrome Browser has started");
    }

    @AfterTest
    public void tearDown(){
        if (this.driver != null) {

            this.driver.quit();
        }
    }

    public void sleepy(long miliSeconds){
        try {
            Thread.sleep(miliSeconds);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
