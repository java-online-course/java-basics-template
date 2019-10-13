package com.epam.izh.rd.online.service;

public interface IMathService {

    int maxFrom(int value1, int value2);

    int maxFrom(int[] values);

    int sum(int[] values);

    Integer[] getEvenDigits(int[] values);
}
