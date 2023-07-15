import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LocatorsHW {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void basicLocatorsTest_HW() {
        driver.get(ReadProperties.getUrlHW());

        driver.findElement(By.id("cars")).click();
        driver.findElement(By.name("pickup-time")).click();
        driver.findElement(By.className("js-header-login-link")).click();
        driver.findElement(By.linkText("Правилами и условиями")).click();
        driver.findElement(By.partialLinkText(" конфиденциальности")).click();
        driver.findElement(By.tagName("label")).isDisplayed();
    }

    @Test
    public void cssSelectors_HW_part1() {
        driver.get(ReadProperties.getUrlHW());

        driver.findElement(By.cssSelector("#flights")).isDisplayed();
        driver.findElement(By.cssSelector(".f9966e6860")).isDisplayed();
        driver.findElement(By.cssSelector(".fc63351294.a822bdf511.e3c025e003.fa565176a8." +
                "cfb238afa1.c334e6f658.e634344169")).isDisplayed();
        Assert.assertEquals(15,driver.findElements(By.cssSelector("input")).size());
        driver.findElement(By.cssSelector("div.a61cce10a1")).isDisplayed();
        Assert.assertEquals(2, driver.findElements(By.cssSelector("p ~ div")).size());
        Assert.assertEquals(2, driver.findElements(By.cssSelector("[placeholder]")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector
                ("[placeholder=\"Куда вы хотите поехать?\"]")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id$='ractions']")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id^='att']")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id|=logo]")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[aria-label~=Загрузите]")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[aria-label*=Загр]")).size());
        Assert.assertEquals(0, driver.findElements(By.cssSelector(":disabled")).size());
        Assert.assertEquals(68, driver.findElements(By.cssSelector(":enabled")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector(":checked")).size());
        Assert.assertEquals(2, driver.findElements(By.cssSelector("form:first-child")).size());
        Assert.assertEquals(3, driver.findElements(By.cssSelector("nav:last-child")).size());
        Assert.assertEquals(7, driver.findElements(By.cssSelector("p:nth-child(2)")).size());
    }

    @Test
    public void cssSelectors_HW_part2() {
        driver.get("file:\\C:\\Users\\olyad\\IdeaProjects\\AQA_TMS_Auto\\src\\test\\resources\\index.html");

        Assert.assertEquals(1, driver.findElements(By.cssSelector("#selectorResult .myquote")).size());
        Assert.assertEquals(38, driver.findElements(By.cssSelector("h3, span")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("div > h1")).size());
        Assert.assertEquals(1, driver.findElements(By.cssSelector("table + span")).size());
        Assert.assertEquals(16, driver.findElements(By.cssSelector(":empty")).size());
    }

    @Test
    public void XPath_HW() {
        driver.get(ReadProperties.getUrlHW());

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div" +
                "/form/div[1]/div[4]/button")).isDisplayed());
        driver.findElements(By.xpath("//*"));
        Assert.assertEquals(2, driver.findElements(By.xpath("//form")).size());
        Assert.assertEquals(4, driver.findElements(By.xpath("//div/input")).size());
        Assert.assertEquals(15, driver.findElements(By.xpath("//div//input")).size());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'accommodations']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@type='button' " +
                "and @data-testid='occupancy-config']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@id, 'fli')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@id, 'fli')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//span[text() = 'Авиабилеты + отели']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[. = 'Варианты досуга']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Авиабилеты + ')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class = 'e20caabacb']/li[2]")).isDisplayed());
    }

    @Test
    public void axesXPath_HW() {
        driver.get(ReadProperties.getUrl());

        Assert.assertTrue(driver.findElement(By.xpath("//h1/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//h1/parent::header")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//h1/ancestor::div")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//header/child::nav")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::nav")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='d7ba686b8a']/following::header")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='intro_header']/following-sibling::div")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='intro_header']/preceding::noscript")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bodyconstraint']/preceding-sibling::div")).isDisplayed());
    }
}
