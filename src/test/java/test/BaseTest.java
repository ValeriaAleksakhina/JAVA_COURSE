package test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

public class BaseTest {

    private static void selLocalDriver(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;

    }

    @BeforeEach
    public void setDriver(){
        selLocalDriver();
    }

    @AfterEach
    public void closeDriver(){
        Selenide.closeWebDriver();
    }
}
