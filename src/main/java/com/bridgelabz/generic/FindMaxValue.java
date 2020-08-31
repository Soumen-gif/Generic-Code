package com.bridgelabz.generic;

public class FindMaxValue {

        public  <Generic extends Comparable >Generic findMaximumValue(Generic arr[])
        {
            Generic max = arr[0];
            for (int i =0 ; i< arr.length ; i++)
            {
                if( max.compareTo(arr[i]) <0 )
                    max = arr[i];
            }
            return max;
        }
}
