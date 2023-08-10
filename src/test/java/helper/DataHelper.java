package helper;

import models.User;
import models.UserData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.configuration.ReadProperties;


public class DataHelper {

    static Logger logger = LogManager.getLogger(DataHelper.class);

    public static User getStandardUser() {
        User user = new User();
        user.setUserName(ReadProperties.standardUserName());
        user.setPassword(ReadProperties.generalPassword());

        logger.info(user.toString());
        return user;
    }

    public static User lockedOutUser() {
        User user = new User();
        user.setUserName(ReadProperties.lockedOutUserName());
        user.setPassword(ReadProperties.generalPassword());

        logger.info(user.toString());
        return user;
    }

    public static User problemUser() {
        User user = new User();
        user.setUserName(ReadProperties.problemUserName());
        user.setPassword(ReadProperties.generalPassword());

        logger.info(user.toString());
        return user;
    }

    public static User performanceGlitchUser() {
        User user = new User();
        user.setUserName(ReadProperties.performanceGlitchUserName());
        user.setPassword(ReadProperties.generalPassword());

        logger.info(user.toString());
        return user;
    }

    public static UserData getCommonUserData(){
        UserData userData = UserData.builder()
                .firstName("Mishka")
                .lastName("Kot")
                .postalCode(234)
                .build();

        logger.info(userData.toString());
        return userData;
    }
}
