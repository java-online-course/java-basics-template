package com.epam.izh.rd.online.service;

import java.awt.dnd.DropTarget;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     *
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        if (value1 >= value2) {
            return value1 == value2 ? 0 : 1;
        } else {
            return -1;
        }
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 >= value2) {
            return value1;
        } else {
            return value2;
        }
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxNumber = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxNumber <= values[i]) {
                maxNumber = values[i];
            }
        }
        return maxNumber;
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
        int n = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                n++;
            }
        }
        int[] evenNumbers = new int[n];
        for (int j = 0, m = 0; j < values.length; j++) {
            if (values[j] % 2 == 0) {
                evenNumbers[m] = values[j];
                m++;
            }
        }
        return evenNumbers;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long result = 1;
        for (int i = 0; i < initialVal; i++) {
            result *= (i + 1);
        }
        return result;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        long result = 0;
        long[] arr1 = new long[number + 1];
        if (number != 0) {
            arr1[1] = 1;
            result = 1;
            for (int i = 1; i < number; i++) {
                arr1[i + 1] = arr1[i] + arr1[i - 1];
                result = arr1[i + 1];
            }
        }
        return result;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        int[] arr1 = new int[values.length];
        for (int n = 0; n < values.length; n++) {
            arr1[n] = values[n];
        }
        for (int i = arr1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr1[j] >= arr1[j + 1]) {
                    int var = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = var;
                }
            }
        }
        return arr1;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        int n = 3;
        if (number > n) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int j = values.length;
        int[] arr1 = new int[j];
        for (int i = 0; i < values.length; i++) {
            arr1[i] = values[j - 1];
            j--;
        }
        return arr1;
    }
}
