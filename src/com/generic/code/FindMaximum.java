package com.generic.code;

public class FindMaximum {
    public <T extends Comparable<T>> T findMaxInStringIntegerFloat(T firstposition, T secondposition, T thirdposition) {
        T max = firstposition;
        if (secondposition.compareTo(max) > 0) {
            max = secondposition;
        }
        if (thirdposition.compareTo(max) > 0) {
            max= thirdposition;
        }
        return max;
    }
}

