package org.example.test;

import io.qameta.allure.Description;
import org.example.base.CommonToAll;
import org.example.driver.DriverManager;
import org.example.page.PIMPageModule;
import org.example.utils.PropertiesReader;
import org.testng.annotations.Test;

public class PIMTest extends CommonToAll {


    @Description("Verify PIM Module")
    @Test(priority = 1)
    public void test_PIMOrangeHRM()
    {
        PIMPageModule pimPageModule = new PIMPageModule(DriverManager.getDriver());
        pimPageModule.PIM_OrangeHRM();
    }

    @Description("Verify add employee")
    @Test(priority = 2)
    public void test_addEmployeeOrangeHRM()
    {
        PIMPageModule pimPageModule = new PIMPageModule(DriverManager.getDriver());
        pimPageModule.addEmployee_OrangeHRM(PropertiesReader.readKey("firstname"),PropertiesReader.readKey("middlename"),PropertiesReader.readKey("lastname"));
    }
}
