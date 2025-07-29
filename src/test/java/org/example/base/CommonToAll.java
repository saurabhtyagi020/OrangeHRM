package org.example.base;

import org.example.driver.DriverManager;
import org.testng.annotations.*;

public class CommonToAll {

    @BeforeSuite
    public void setUp()
    {
        DriverManager.init();
    }
//
//    @AfterSuite
//    public void tearDown()
//    {
//        DriverManager.down();
//    }

}
