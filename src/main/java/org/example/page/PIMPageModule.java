package org.example.page;

import org.example.utils.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPageModule {

    WebDriver driver;
    public PIMPageModule(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement btnPIM;

    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmployee;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleName;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;

//    @FindBy(xpath = "//input[@name='lastName']")
//    private WebElement lastName;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement btnSave;

    @FindBy(xpath = "//a[text()='Employee List']")
    private WebElement empList;

    @FindBy(xpath = "//div[@role='table']//div[@class='oxd-table-body']//div[text()='aaRaj Kumar']")
    private WebElement firstAndMiddleName;



    public void PIM_OrangeHRM()
    {
        WaitHelpers.checkVisibilityofelement(driver,btnPIM);
        btnPIM.click();
    }

    public void addEmployee_OrangeHRM(String fname,String mName,String lName)
    {
        WaitHelpers.checkVisibilityofelement(driver,addEmployee);
        addEmployee.click();
        WaitHelpers.checkVisibilityofelement(driver,firstName);
        firstName.sendKeys(fname);
        middleName.sendKeys(mName);
        lastName.sendKeys(lName);
        btnSave.click();

    }

    public void verifyAddEmployee_OrangeHRM()
    {
        empList.click();
        if(firstAndMiddleName.getText().contains("aa sanju kumar"))
        {
            System.out.println("First and Middle name: "+firstAndMiddleName+ "Test case passed!!");
        }
        else
        {
            System.out.println("Name is not found!!");
        }


    }


}
