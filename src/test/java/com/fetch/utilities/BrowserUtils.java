package com.fetch.utilities;

import org.junit.Assert;

public class BrowserUtils {

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

}
