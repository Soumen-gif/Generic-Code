package com.bridgelabz.generic;

public class FindMaxValue {
    public int findMaxInt(Integer a, Integer b, Integer c)
    {
        if(a.compareTo(b) > 0  && b.compareTo(c) > 0)
            return a;
        else if(b.compareTo(c) > 0)
            return b;
        else
            return c;
    }
    public float findMaxFloatValue(Float a, Float b, Float c)
    {
        if(a.compareTo(b) > 0 && b.compareTo(c) > 0)
            return a;
        else if (b.compareTo(c) > 0)
            return b;
        else
            return c;
    }
    public String findMaxStringValue(String a, String b, String c)
    {
        if(a.length() > b.length() && b.length() > c.length())
            return a;
        else if (b.length() > a.length())
            return b;
        else
            return c;
    }

}
