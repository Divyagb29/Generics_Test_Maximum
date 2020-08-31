package com.generic.test;


import com.generic.code.FindMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
    FindMaximum findMaximum;
    @Before
    public void setUp() throws Exception {
        findMaximum = new FindMaximum();
    }

    @Test
    public void testMaximunIntegerFirstPosition() {
        int maximumNumber =findMaximum.findMaxInteger(9,2,1);
        Assert.assertEquals(9, maximumNumber);
    }

    @Test
    public void testMaximunIntegerSecondPosition() {
        int maximumNumber =findMaximum.findMaxInteger(2,9,3);
        Assert.assertEquals(9, maximumNumber);
    }

    @Test
    public void testMaximunIntegerThirdPosition() {
        int maximumNumber =findMaximum.findMaxInteger(2,5,10);
        Assert.assertEquals(10, maximumNumber);
    }
}