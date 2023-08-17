package steps;

import baseEntities.BaseStep_HW;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage_HW;

public class LoginStep_HW extends BaseStep_HW {

    public LoginStep_HW() {
        super();
    }

    public ProductsPage_HW successLogin_HW(User user) {
        loginPage_HW.login_HW(user);

        return productsPage_HW;
    }
}
