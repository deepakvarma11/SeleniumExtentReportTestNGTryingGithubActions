package com.extentTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

    @Test
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test
    public void test02(){
        Assert.assertTrue(false);
    }
}
