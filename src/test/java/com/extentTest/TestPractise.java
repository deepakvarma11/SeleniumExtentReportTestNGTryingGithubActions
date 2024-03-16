package com.extentTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPractise extends TestBase {

    @Test
    public void test01(){
        System.out.println("Inside test01");
        Assert.assertTrue(true);
    }

    @Test
    public void test02(){
        System.out.println("inside test02");
        Assert.assertTrue(false);
    }
}
