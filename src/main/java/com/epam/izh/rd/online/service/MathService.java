package com.epam.izh.rd.online.service;

public interface MathService {

    int compare(int value1, int value2);

    int maxFrom(int value1, int value2);

    int maxFrom(int[] values);

    int sum(int[] values);

    int[] getEvenDigits(int[] values);

    long calcFactorial(int initialVal);

    long calcFibonacci(int number);

    int[] sort(int[] values);

    boolean isPrimary(int number);

    int[] reverseArray(int[] values);
}
