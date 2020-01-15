package com.epam.izh.rd.online.service;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class SimpleMathService implements MathService {

    @Override
    public int compare(int value1, int value2) {
        return Integer.compare(value1, value2);
    }

    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }

    /**
     * Я бы могла кидать исключение, если длина массива = 0, но, думаю, раз
     * в тестах такого случая нет, то не стоит заморачиваться
     */
    @Override
    public int maxFrom(int[] values) {
        return stream(values).max().orElse(Integer.MIN_VALUE);
    }

    @Override
    public int sum(int[] values) {
        return stream(values).sum();
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        return stream(values).filter(i -> i % 2 == 0).toArray();
    }

    @Override
    public long calcFactorial(int initialVal) {
        return (initialVal > 1) ? calcFactorial(initialVal - 1) * initialVal : 1;
    }

    @Override
    public long calcFibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        return (number != 1) ? calcFibonacci(number - 2) + calcFibonacci(number - 1) : 1;
    }

    @Override
    public int[] sort(int[] values) {
        Arrays.sort(values);
        return values;
    }

    //вообще я бы взяла либу com.google.common.math.IntMath
    @Override
    public boolean isPrimary(int number) {
        BigInteger b = new BigInteger(String.valueOf(number));
        return b.isProbablePrime(1);
    }


    @Override
    public int[] reverseArray(int[] values) {
        List<Integer> list = Arrays.stream(values).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
