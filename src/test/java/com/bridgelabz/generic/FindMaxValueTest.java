package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxValueTest {
    FindMaxValue findMaxValue=null;
    @Before
    public void createObject()
    {
         findMaxValue= new FindMaxValue();
    }
    @Test
    public void whenGivenNo_InFirstPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(40,findMaxValue.findMaxInt(40,20,10));
    }
    @Test
    public void whenGivenNo_InSecondPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(40,findMaxValue.findMaxInt(20,40,10));
    }
    @Test
    public void whenGivenNo_InThirdPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(40,findMaxValue.findMaxInt(10,20,40));
    }

}
