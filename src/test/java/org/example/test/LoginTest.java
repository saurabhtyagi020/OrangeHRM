package org.example.test;

import io.qameta.allure.Description;
import org.example.base.CommonToAll;
import org.example.driver.DriverManager;
import org.example.page.LoginPage;
import org.example.utils.PropertiesReader;
import org.testng.annotations.Test;

public class LoginTest extends CommonToAll
{
    @Description("Verify login with valid credentials")
    @Test
    public void login_testOrangeHRM()
    {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.login_OrangeHRM(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));
    }
}
