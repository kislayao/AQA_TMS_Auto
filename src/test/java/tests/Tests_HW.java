package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

public class Tests_HW extends BaseTest {

    @Test
    public void contextMenuTest() {

        driver.get("http://the-internet.herokuapp.com/context_menu");

        WaitService waitService = new WaitService(driver);
        Actions actions = new Actions(driver);

        actions.contextClick(waitService.waitForVisibilityLocatedBy(By.id("hot-spot"))).build().perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
    }

    @Test
    public void dynamicControlsTest(){

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WaitService waitService = new WaitService(driver);

        WebElement checkBox = waitService.waitForExists(By.id("checkbox"));

        waitService.waitForVisibilityLocatedBy
                (By.xpath("//*[@type='button' and @onclick='swapCheckbox()']")).click();
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy
                (By.xpath("//p[text() = \"It's gone!\"]")).isDisplayed());
        Assert.assertTrue(waitService.waitForElementInvisible(checkBox));
        Assert.assertFalse(waitService.waitForVisibilityLocatedBy(By.xpath("//input")).isEnabled());
        waitService.waitForVisibilityLocatedBy
                (By.xpath("//*[@type='button' and @onclick='swapInput()']")).click();
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy
                (By.xpath("//p[text() = \"It's enabled!\"]")).isDisplayed());
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy(By.xpath("//input")).isEnabled());
    }

    @Test
    public void fileUploadTest(){

        driver.get("http://the-internet.herokuapp.com/upload");

        WaitService waitService = new WaitService(driver);

        WebElement fileUploadElement = waitService.waitForExists(By.xpath("//form/input[@type='file']"));
        String pathToFile = Tests_HW.class.getClassLoader().getResource("download.jpeg").getPath();
        //System.out.println("path:" + pathToFile.substring(1,pathToFile.length()));
        fileUploadElement.sendKeys(pathToFile.substring(1,pathToFile.length()));
        waitService.waitForVisibilityLocatedBy(By.id("file-submit")).submit();
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy
                (By.xpath("//*[@id = 'uploaded-files' and contains(text(), 'download.jpeg')]")).isDisplayed());
    }

    @Test
    public void framesTest(){

        driver.get("http://the-internet.herokuapp.com/frames");

        WaitService waitService = new WaitService(driver);

        waitService.waitForVisibilityLocatedBy(By.cssSelector("[href='/iframe']")).click();
        driver.switchTo().frame("mce_0_ifr");
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy
                (By.xpath("//p[text() = 'Your content goes here.']")).isDisplayed());
    }



}
