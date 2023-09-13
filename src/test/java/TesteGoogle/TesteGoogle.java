package TesteGoogle;

import BaseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TesteGoogle extends BaseTest {
    @Test
    public void TestWebDriver(){
        chrome.findElement(By.name("q")).sendKeys("BTD6" + Keys.ENTER);
        String data = chrome.findElement(By.id("result-stats")).getText();
        System.out.println(data);
        Assert.assertTrue(data.contains("Aproximadamente"));
    }
}
