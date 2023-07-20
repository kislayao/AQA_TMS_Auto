package utils.configuration;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getUrlHW() {
        return properties.getProperty("urlHW");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static String username() {
        return properties.getProperty("username");
    }

    public static String usernameHW() {
        return properties.getProperty("usernameHW");
    }

    public static String password() {
        return properties.getProperty("password");
    }

    public static String passwordHW() {
        return properties.getProperty("passwordHW");
    }

    public static boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public static String firstName() {
        return properties.getProperty("firstName");
    }

    public static String lastName() {
        return properties.getProperty("lastName");
    }

    public static String postalCode() {
        return properties.getProperty("postalCode");
    }

    public static String standardUserName() {
        return properties.getProperty("standardUserName");
    }

    public static String lockedOutUserName() {
        return properties.getProperty("lockedOutUserName");
    }

    public static String problemUserName() {
        return properties.getProperty("problemUserName");
    }

    public static String performanceGlitchUserName() {
        return properties.getProperty("performanceGlitchUserName");
    }

    public static String generalPassword() {
        return properties.getProperty("generalPassword");
    }
}