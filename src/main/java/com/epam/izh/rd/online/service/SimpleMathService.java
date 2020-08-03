package com.epam.izh.rd.online.service;

import com.google.common.math.IntMath;
import com.google.common.math.LongMath;

import java.util.Arrays;

public class SimpleMathService implements MathService {
    @Override
    public int compare(int value1, int value2) {
        if(value1 == value2)
            return 0;
        return value1 < value2 ? -1 : 1;
    }

    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }

    @Override
    public int maxFrom(int[] values) {
        return Arrays.stream(values).max().getAsInt();
    }

    @Override
    public int sum(int[] values) {
        return Arrays.stream(values).sum();
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        return Arrays.stream(values)
                .filter(i -> i % 2 == 0)
                .toArray();
    }

    @Override
    public long calcFactorial(int initialVal) {
        return LongMath.factorial(initialVal);
    }

    @Override
    public long calcFibonacci(int number) {
        return (long) ((Math.pow((( 1 + Math.sqrt(5)) / 2), number) - Math.pow(((1 - Math.sqrt(5)) / 2), number)) / Math.sqrt(5));
    }

    @Override
    public int[] sort(int[] values) {
        return Arrays.stream(values).sorted().toArray();
    }

    @Override
    public boolean isPrimary(int number) {
        return IntMath.isPrime(number);
    }

    @Override
    public int[] reverseArray(int[] values) {
        return reverseArrays(values);
    }

    private int[] reverseArrays(int[] values) {
        int arrayLength = values.length;
        int middle = arrayLength / 2;
        for(int i = 0; i < middle; i++) {
            int changeableVariable = values[i];
            values[i] = values[arrayLength - i - 1];
            values[arrayLength - i - 1] = changeableVariable;
        }
        return values;
    }
}
