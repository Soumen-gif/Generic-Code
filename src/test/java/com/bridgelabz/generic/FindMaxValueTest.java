package com.bridgelabz.generic;
import com.bridgelabz.generic.FindMaxValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static java.lang.StrictMath.E;
public class FindMaxValueTest {
    @Test
    public void whenGiven_No_InFirstPosition_should_ReturnSameNo() {
        Integer[] integerValues = {10, 5, 2};
        Integer max = new FindMaxValue<>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void whenGiven_No_InSecondPosition_should_ReturnSameNo() {
        Integer[] integerValues = {5, 10, 2};
        Integer max = new FindMaxValue<>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void whenGiven_No_InThirdPosition_should_ReturnSameNo() {
        Integer[] integerValues = {2, 5, 10};
        Integer max = new FindMaxValue<>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 10, max);
    }


}
