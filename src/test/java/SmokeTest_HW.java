import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SmokeTest_HW {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @Test
    public void calcElUnderfloorHeating() throws InterruptedException {

        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        widthInput.sendKeys("6");

        WebElement lenghtInput = driver.findElement(By.id("el_f_lenght"));
        lenghtInput.sendKeys("9");

        WebElement selectWebElementRoomType = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(selectWebElementRoomType);
        selectRoomType.selectByVisibleText("Кухня или спальня");
        sleep(2000);

        WebElement selectWebElementHeatingType = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElementHeatingType);
        selectHeatingType.selectByVisibleText("Подогрев для комфорта");
        sleep(2000);

        WebElement elLossesInput = driver.findElement(By.id("el_f_losses"));
        elLossesInput.sendKeys("200");
        sleep(2000);

        WebElement calcButton = driver.findElement(By.name("button"));
        calcButton.click();
        sleep(3000);

        WebElement resultFloorCablePower = driver.findElement(By.id("floor_cable_power"));
        Assert.assertEquals(resultFloorCablePower.getAttribute("value"), "111");


        WebElement resultSpecFloorCablePower = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(resultSpecFloorCablePower.getAttribute("value"),"2");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
