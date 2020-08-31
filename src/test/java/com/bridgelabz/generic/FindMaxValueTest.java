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
    public void whenGivenNoInArray_InFirstPosition_Shold_ReturnSameNumber()
    {
        Integer arr[] = {10,5,2};
        Assert.assertSame(10,findMaxValue.findMaximumValue(arr));
    }
    @Test
    public void whenGivenNoInArray_InSecondPosition_Should_ReturnSameNumber()
    {
        Integer arr[] = {5,10,2};
        Assert.assertSame(10,findMaxValue.findMaximumValue(arr));
    }
    @Test
    public void whenGivenNoInArray_InThirdPosition_Should_ReturnSameNumber()
    {
        Integer arr[] = {2,5,10};
        Assert.assertSame(10,findMaxValue.findMaximumValue(arr));
    }
    @Test
    public void whenGivenFloatNoInArray_InFirstPosition_Should_ReturnSameNumber()
    {
        Float arr[] = {10.5f,5.5f,2.5f};
        Assert.assertEquals(10.5f,findMaxValue.findMaximumValue(arr),0.0);
    }
    @Test
    public void whenGivenFloatNoInArray_InSecondPosition_Should_ReturnSameNumber()
    {
        Float arr[] = {5.5f,10.5f,2.5f};
        Assert.assertEquals(10.5f,findMaxValue.findMaximumValue(arr),0.0);
    }
    @Test
    public void whenGivenFloatNoInArray_InThirdPosition_Should_ReturnSameNumber()
    {

        Float arr[] = {2.5f,5.5f,10.5f};
        Assert.assertEquals(10.5,findMaxValue.findMaximumValue(arr),0.0);
    }

    @Test
    public void whenGivenStringInArray_InFirstPosition_Should_ReturnSameString()
    {
        String arr[] = {"watermelon" , "apple"  , "banana"};
        Assert.assertEquals("watermelon",findMaxValue.findMaximumValue(arr));
    }
    @Test
    public void whenGivenStringInArray_InSecondPosition_thenReturnSameString()
    {
        String arr[] = { "apple"  , "watermelon" , "banana"};
        Assert.assertEquals("watermelon",findMaxValue.findMaximumValue(arr));
    }
    @Test
    public void whenGivenString_InThirdPosition_thenReturnSameString()
    {
        String arr[] = { "apple"  , "banana" , "watermelon"};
        Assert.assertEquals("watermelon",findMaxValue.findMaximumValue(arr));
    }
}

