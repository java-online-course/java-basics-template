package com.epam.izh.rd.online.service;

import java.util.Arrays;

public class MathService implements IMathService {

    /**
     * Реализовать функционал получения максимального числа.
     * Например для списка (-1, 2) метод должен вернуть 2
     * Для списка (-6, -8) метод должен вернуть -6
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return -1;
    }

    /**
     * Реализовать функционал получения максимального числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        return -1;
    }

    /**
     * Реализовать функционал получения суммы чисел.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        return -1;
    }

    /**
     * Реализовать функционал получения списка четных чисел.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public Integer[] getEvenDigits(int[] values) {
        return new Integer[]{-1};
    }
}
