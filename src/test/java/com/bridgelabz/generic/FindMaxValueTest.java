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
        Assert.assertEquals(10,findMaxValue.findMaxInt(10,5,2));
    }
    /*@Test
    public void whenGivenNo_InSecondPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(10,findMaxValue.findMaxInt(5,10,2));
    }
    @Test
    public void whenGivenNo_InThirdPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(10,findMaxValue.findMaxInt(10,5,2));
    }
    @Test
    public void whenGivenFloatNo_InFirstPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(10.5f,findMaxValue.findMaxFloatValue(10.5f,5.5f,2.5f), 0.0f);
    }
    @Test
    public void whenGivenFloatNo_InSecondPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(10.5f,findMaxValue.findMaxFloatValue(5.5f,10.5f,2.5f),0.0f);
    }
    @Test
    public void whenGivenFloatNo_InThirdPosition_Should_ReturnSameNumber()
    {
        Assert.assertEquals(10.5f,findMaxValue.findMaxFloatValue(5.5f,2.5f,10.5f),0.0f);
    }
    @Test
    public void whenGiven_String_InFirstPosition_Should_ReturnSameString()
    {
        Assert.assertEquals("Watermelon",findMaxValue.findMaxStringValue("Watermelon","Banana","Apple"));
    }
    @Test
    public void whenGiven_String_InSecondPosition_Should_ReturnSameString()
    {
        Assert.assertEquals("Watermelon",findMaxValue.findMaxStringValue("Banana","Watermelon","Apple"));
    }
    @Test
    public void whenGiven_String_InThirdPosition_Should_ReturnSameString() {
        Assert.assertEquals("Watermelon", findMaxValue.findMaxStringValue("Banana", "Apple", "Watermelon"));
    }*/

}
