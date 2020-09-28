package com.epam.myproj;

import org.junit.Assert;
import org.junit.Test;

public class FirstClassTest {

    @Test
    public void getStringTest() {
        Assert.assertEquals("Test", new FirstClass().getString());
    }
}
