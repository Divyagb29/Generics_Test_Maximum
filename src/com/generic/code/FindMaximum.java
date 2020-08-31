package com.generic.code;

public class FindMaximum {
    public Integer findMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        return max;
    }
    public Float findMaxFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max= thirdNumber;
        }
        return max;
    }
    public String getMaxString(String firstString, String secondString, String thirdString)
    {
        if(firstString.length() > secondString.length() && secondString.length() > thirdString.length()) {
            return firstString;
        }
        if (secondString.length() > 0) {
            return secondString;
        }
        else {
            return thirdString;
        }
    }

}
