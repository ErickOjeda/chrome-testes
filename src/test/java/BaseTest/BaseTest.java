package BaseTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver chrome;

    @BeforeClass
    public static void iniciar(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://google.com.br");
    }

    @AfterClass
    public static void finalizar(){
        chrome.quit();
    }

}
