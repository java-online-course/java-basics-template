package com.epam.izh.rd.online.service;

import java.lang.reflect.Array;

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
        if (value1 == value2) {
            return 0;
        }
        return Integer.compare(value1, value2);
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxValueFromArray = values[0];
        for (int value : values) {
            maxValueFromArray = Math.max(maxValueFromArray, value);
        }
        return maxValueFromArray;
    }


    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sumValues = 0;
        for (int value : values) {
            sumValues += value;
        }
        return sumValues;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int countForIndexArr = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                countForIndexArr++;
            }
        }
        int [] evenNumbersArray = new int [countForIndexArr];
        countForIndexArr = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                evenNumbersArray[countForIndexArr] = value;
                countForIndexArr++;
            }
        }

        return evenNumbersArray;


    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int factorial = 1;
        if (initialVal != 0) {
            for (int i = 1; i <= initialVal; i++) {
                factorial *= i;
            }
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
    public long calcFibonacci(int number) {
        int fibonacci = 0;
        int fibonacciFirstNumber = 0;
        int fibonacciSecondNumber = 1;
        if(number==0){
            fibonacci = fibonacciFirstNumber;
        } else if(number==1){
            fibonacci = fibonacciSecondNumber;
        } else {
            for (int i=2;i <= number; ++i){
                fibonacci = fibonacciFirstNumber + fibonacciSecondNumber;
                fibonacciFirstNumber = fibonacciSecondNumber;
                fibonacciSecondNumber = fibonacci;
            }
        }

        return fibonacci;
    }
    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < values.length; i++) {
                if (values[i] < values[i - 1]) {
                    int j = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = j;
                    isSorted = false;
                }
            }
        }
        return values;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        boolean primeNumber = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        for (int i = 0, j = values.length -1; i < values.length/2 ; i++, j--){
                int reverse = values[i];
                values[i] = values[j];
                values[j] = reverse;
            }
        return values;
    }
}
