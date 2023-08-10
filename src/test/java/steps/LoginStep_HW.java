package steps;

import baseEntities.BaseStep_HW;
import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage_HW;

public class LoginStep_HW extends BaseStep_HW {

    static Logger logger = LogManager.getLogger(LoginStep_HW.class);

    public LoginStep_HW(WebDriver driver) {
        super(driver);
    }

    public ProductsPage_HW successLogin_HW(User user) {
        loginPage_HW.loginNormal(user);

        logger.info("User is successfully logged in");
        return productsPage_HW;
    }
}
