package com.epam.izh.rd.online.service;

import java.util.Arrays;

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
        return value1 > value2 ? 1 : (value1 < value2 ? -1 : 0);
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return value1 >= value2 ? value1 : value2;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            maxValue = maxFrom(maxValue, value);
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
        for (int element : values) {
            sum += element;
        }
        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int[] evenNumbers = new int[values.length];
        int evenNumbersCount = 0;
        for (int i = 0, j = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenNumbers[j] = values[i];
                j++;
                evenNumbersCount++;
            }
        }
        int[] evenNumbersTrimmedArray = new int[evenNumbersCount];
        System.arraycopy(evenNumbers, 0, evenNumbersTrimmedArray, 0, evenNumbersCount);
        return evenNumbersTrimmedArray;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        if (initialVal > 1) {
            return initialVal * calcFactorial(--initialVal);
        } else {
            return 1;
        }
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
     * Algorithm complexity O(log(n))
     */
    @Override
    public long calcFibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        long[] matrixResult = new long[]{0, 1, 1, 1};
        long[] matrix2 = new long[]{1, 0, 0, 1};
        while (number > 1) {
            if (number % 2 == 1) {
                matrix2 = multiplyMatrices(matrixResult, matrix2);
            }
            matrixResult = multiplyMatrices(matrixResult, matrixResult);
            number /= 2;
        }
        matrixResult = multiplyMatrices(matrixResult, matrix2);
        return matrixResult[1];
    }

    /**
     * Method for multiplying matrices.
     */

    public long[] multiplyMatrices(long[] matrix1, long[] matrix2) {
        long[] resultMatrix = new long[4];
        resultMatrix[0] = matrix1[0] * matrix2[0] + matrix1[1] * matrix2[2];
        resultMatrix[1] = matrix1[0] * matrix2[1] + matrix1[1] * matrix2[3];
        resultMatrix[2] = matrix1[2] * matrix2[0] + matrix1[3] * matrix2[2];
        resultMatrix[3] = matrix1[2] * matrix2[1] + matrix1[3] * matrix2[3];
        return resultMatrix;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        return new int[]{};
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     * <p>
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        return false;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        return new int[]{};
    }
}
