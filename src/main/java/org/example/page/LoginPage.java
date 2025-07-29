package org.example.page;

import org.example.utils.PropertiesReader;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSubmit;

    public void login_OrangeHRM(String user,String password)
    {
        driver.get(PropertiesReader.readKey("url"));
        WaitHelpers.checkVisibilityofelement(driver,userName);
        userName.sendKeys(user);
        userPassword.sendKeys(password);
        btnSubmit.click();
    }




}
