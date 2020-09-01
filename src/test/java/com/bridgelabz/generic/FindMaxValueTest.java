package com.bridgelabz.generic;
import org.junit.Assert;
import org.junit.Test;
public class FindMaxValueTest {
    @Test
    public void whenGivenNo_InFirstPosition_Should_ReturnSameNumber() throws FindMaxException {
        Integer max = new FindMaxValue<>(10, 5, 2).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void whenGivenNo_InSecond_Position_Should_ReturnSameNumber() throws FindMaxException {
        Integer max = new FindMaxValue<>(5, 10, 2).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void whenGivenNo_InThirdPosition_Should_ReturnSameNumber() throws FindMaxException {
        Integer max = new FindMaxValue<>(2, 5, 10).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void whenGivenNo_InFourth_Position_Should_ReturnSameNumber() throws FindMaxException {
        Integer max = new FindMaxValue<>(2, 4, 5, 10).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }
    @Test
    public void whenGivenFloatNo_InFirst_Position_Should_ReturnSameNumber() throws FindMaxException {
        Float max = new FindMaxValue<>(10f, 2f, 5f).findMaxValue();
        Assert.assertEquals((Float) 10f, max);
    }

    @Test
    public void whenGivenFloatNo_InSecond_Position_Should_ReturnSameNumber() throws FindMaxException {
        Float max = new FindMaxValue<>(2f, 10f, 5f).findMaxValue();
        Assert.assertEquals((Float) 10f, max);
    }

    @Test
    public void whenGivenFloatNo_InThird_Position_Should_ReturnSameNumber() throws FindMaxException {
        Float max = new FindMaxValue<>(2f, 5f, 10f).findMaxValue();
        Assert.assertEquals((Float) 10f, max);
    }

    @Test
    public void whenGivenFloatNo_InFourt_Position_Should_ReturnSameNumber() throws FindMaxException {
        Float max = new FindMaxValue<>(2f, 4f, 5f, 10f).findMaxValue();
        Assert.assertEquals((Float) 10f, max);
    }
    @Test
    public void whenGivenString_InFirst_Position_Should_ReturnSameString() throws FindMaxException {
        String max = new FindMaxValue<>("Watermelon", "Pineapple", "Banana").findMaxValue();
        Assert.assertEquals("Watermelon", max);
    }

    @Test
    public void whenGivenString_InSecond_Position_Should_ReturnSameString() throws FindMaxException {
        String max = new FindMaxValue<>("Pineapple", "Watermelon", "Banana").findMaxValue();
        Assert.assertEquals("Watermelon", max);
    }

    @Test
    public void whenGivenString_InThird_Position_Should_ReturnSameString() throws FindMaxException {
        String max = new FindMaxValue<>("Pineapple", "Banana", "Watermelon").findMaxValue();
        Assert.assertEquals("Watermelon", max);
    }

    @Test
    public void whenGivenString_InFourt_Position_Should_ReturnSameString() throws FindMaxException {
        String max = new FindMaxValue<>("Chiku", "Banana", "Pineapple", "Watermelon").findMaxValue();
        Assert.assertEquals("Watermelon", max);
    }
}
