package helper;

import lombok.extern.slf4j.Slf4j;
import models.User;
import models.UserData;
import utils.configuration.ReadProperties;

@Slf4j
public class DataHelper {

    public static User getStandardUser() {
        User user = new User();
        user.setUserName(ReadProperties.standardUserName());
        user.setPassword(ReadProperties.generalPassword());

        log.info(user.toString());
        return user;
    }

    public static User lockedOutUser() {
        User user = new User();
        user.setUserName(ReadProperties.lockedOutUserName());
        user.setPassword(ReadProperties.generalPassword());
        return user;
    }

    public static User problemUser() {
        User user = new User();
        user.setUserName(ReadProperties.problemUserName());
        user.setPassword(ReadProperties.generalPassword());
        return user;
    }

    public static User performanceGlitchUser() {
        User user = new User();
        user.setUserName(ReadProperties.performanceGlitchUserName());
        user.setPassword(ReadProperties.generalPassword());
        return user;
    }

    public static UserData getCommonUserData(){
        UserData userData = UserData.builder()
                .firstName("Mishka")
                .lastName("Kot")
                .postalCode(234)
                .build();

        return userData;
    }
}
