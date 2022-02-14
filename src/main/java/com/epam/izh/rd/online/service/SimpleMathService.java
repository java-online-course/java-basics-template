package com.epam.izh.rd.online.service;

import java.math.BigInteger;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     * <p>
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        if (value1 < value2) {
            return -1;
        } else if (value1 == value2) {
            return 0;
        }
        return 1;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        }
        return value2;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int count = 0, index = 0;
        for (int item : values) {
            if (item % 2 == 0)
                count++;
        }
        int[] even = new int[count];
        for (int elem : values) {
            if (elem % 2 == 0) {
                even[index++] = elem;
            }
        }
        return even;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long result = 1;
        for (int factor = 2; factor <= initialVal; factor++) {
            result *= factor;
        }
        return result;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     * <p>
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     * <p>
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        return number == 0 || number == 1
                ? number
                : calcFibonacci(number - 1) + calcFibonacci(number - 2);
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */

    @Override
    public int[] sort(int[] values) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i + 1]) {
                    isSorted = false;
                    temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
        return values;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * <p>
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * <p>
     * <p>
     * Например для числа 22 вернется false, а для числа 23 true.
     */

    @Override
    public boolean isPrimary(int number) {
        if (number == 0 || number == 1)
            return true;
        return div(number, 2);
    }

    private static boolean div(int number, int divider) {
        if (number == divider)
            return true;
        if (number % divider == 0)
            return false;
        else
            return div(number, divider + 1);
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * <p>
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */

    @Override
    public int[] reverseArray(int[] values) {
        int temp;
        for (int i = values.length - 1, j = 0; i >= values.length / 2; i--, j++) {
            temp = values[j];
            values[j] = values[i];
            values[i] = temp;
        }
        return values;
    }
}
