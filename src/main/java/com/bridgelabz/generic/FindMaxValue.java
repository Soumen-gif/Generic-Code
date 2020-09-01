package com.bridgelabz.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindMaxValue <E extends Comparable <E>>{
    E[] values;
    @SafeVarargs
    public FindMaxValue(E... values) {
        this.values = values;
    }

    public E findMaxValue() throws FindMaxException {
        if (values.length == 0) {
            throw new FindMaxException("Please enter some value there is no element");
        } else {
            Arrays.sort(values);
            printMax(values[values.length - 1]);
            return values[values.length - 1];
        }
    }

    /*
     *Method to print Max Value
     * @param is Generic Value
     */
    public void printMax(E value) {
        System.out.println("Max Value = " + value);
    }
}




