package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedDriver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        return new ChromeDriver(getOptions());
    }

    public ChromeOptions getOptions() {
        // класс ChromeOptions позволяет добавлять параметрв до момента инициализации
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false); // запускает браузер без визуальноц части. Работает только в памяти, визуально не виден
        // так же позволяет проверить работоспособность тестов перед запуском на удаленной машине
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--silent");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        return chromeOptions;
    }
}
