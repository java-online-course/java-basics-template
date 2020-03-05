package com.epam.izh.rd.online.service;

import java.util.Arrays;

public class SimpleMathService<numberFibonacci> implements MathService {

    private int[] sort;

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
        if (value1 == value2) {
            return 0;
        } else if (value1 < value2) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        int maxValue;
        if (value1 != value2) {
            return (Math.max(value1, value2));
        } else {
            maxValue = value1 = value2;
            return maxValue;
        }
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
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
        int summa = 0;
        if (values.length != 0) {
            for (int i = 0; i < values.length; i++) {
                summa = summa + values[i];
            }
        }
        return summa;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int j = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                j++;
            }
        }
        int[] evenValues = new int[j];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenValues[index] = values[i];
                index++;
            }
        }
        return evenValues;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int factorial = 1;
        for (int i = 1; i <= initialVal; i++) {
            factorial = factorial * i;
        }
        return factorial;
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
    public int calcFibonacci(int number) {
        int[] arrayNumbers = new int[number + 1];
        int numberFibonacci = 0;
        if (arrayNumbers.length > 2) {
            arrayNumbers[0] = 0;
            arrayNumbers[1] = 1;

            for (int i = 2; i <= number; i++) {
                arrayNumbers[i] = arrayNumbers[i - 1] + arrayNumbers[i - 2];
                numberFibonacci = arrayNumbers[i];
            }
            return numberFibonacci;
        }
        numberFibonacci = number;
        return numberFibonacci;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @SuppressWarnings("rawtypes")
    @Override
    public int[] sort(int[] values) {
        boolean notSorted = false;
        while (!notSorted) {
            notSorted = true;
            for (int i = 1; i < values.length; i++) {
                if (values[i] < values[i - 1]) {
                    int temprorary = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = temprorary;
                    notSorted = false;
                }
            }
        }
        return values;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     * <p>
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        boolean notsimpleNum = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return notsimpleNum;
            }
        }
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int[] reverseArr = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            reverseArr[values.length - i-1] = values[i];
        }
        return reverseArr;
    }
}
