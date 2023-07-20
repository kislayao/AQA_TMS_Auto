package steps;

import baseEntities.BaseStep_HW;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage_HW;

public class LoginStep_HW extends BaseStep_HW {

    public LoginStep_HW(WebDriver driver) {
        super(driver);
    }

    public ProductsPage_HW successLogin_HW(String usernameHW, String pswHW) {
        loginPage_HW.login_HW(usernameHW, pswHW);

        return productsPage_HW;
    }
}
