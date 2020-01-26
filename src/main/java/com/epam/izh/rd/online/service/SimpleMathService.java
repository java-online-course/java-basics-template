package com.epam.izh.rd.online.service;

import java.util.Arrays;

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
        return Integer.compare(value1, value2);
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 < value2){
            return value2;
        } else if (value1 > value2){
            return value1;
        } else{
            return 0;
        }
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        Arrays.sort(values);
        return values[values.length-1];
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int m = 0;
        for (int value : values) {
            m += value;
        }
        return m;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        for (int i = 0; i < values.length; i++){
            if (!(values[i] % 2 == 0)){
                values[i] = 0;
            }
        }
        int m;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0 && i != values.length-1) {
                m = values[i + 1];
                values[i + 1] = values[i];
                values[i] = m;
            }
        }
        int t = 0;
        for (int value : values) {
            if (value != 0) {
                t++;
            }
        }
        int [] array = new int[t];
        System.arraycopy(values, 0, array, 0, t);
        return array;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int result = 1;
        for (int i = 1; i <= initialVal; i++){
            result = result * i;
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
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        else{
            return calcFibonacci(number - 1) + calcFibonacci(number - 2);
        }
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        boolean it = true;
        while (it) {
            it = false;
            for (int i = 1; i < values.length; i++) {
                if (values[i] < values[i - 1]) {
                    int m = values[i - 1];
                    values[i - 1] = values[i];
                    values[i] = m;
                    it = true;
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
        boolean isSimple = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        for (int i = 0; i < values.length/2; i++) {
            int m = values[values.length - 1 - i];
            values[values.length - 1 - i] = values[i];
            values[i] = m;
        }
        return values;
    }
}
