package com.extentTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {


    @BeforeSuite
    public void setup() {
        System.out.println("setup");
    }


    @AfterSuite
    public void teardown() {
        System.out.println("teardown");
    }
}
