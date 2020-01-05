package com.epam.izh.rd.online.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        return Math.max(value1,value2);
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i < values.length; i++) {
            arr.add(values[i]);
        }
        return Collections.max(arr);
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++){
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
        ArrayList<Integer> arr_buf = new ArrayList<>();

        for(int i = 0; i < values.length; i++){
            if ((values[i] % 2)==0){
                arr_buf.add(values[i]);
            }
        }

        int[] result = new int[arr_buf.size()];

        for (int i = 0; i < result.length; i++){
            result[i] = arr_buf.get(i);
        }

        return result;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int result = 1;
        for (int i = 1; i <= initialVal; ++i) {
            result *= i;
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
        if (0 == number){return 0;}
        else if (1 == number){return 1;}
            else {
                long a = 0;
                long b = 1;
                long c = 1;
                for (int i = 2; i < number; i++){
                    a = b;
                    b = c;
                    c = a + b;
                }
            return c;
        }
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        ArrayList<Integer> arr_buf = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++){
            arr_buf.add(values[i]);
        }
        Collections.sort(arr_buf);
        int[] result = new int[arr_buf.size()];
        for (int i = 0; i < arr_buf.size(); i++) {
            result[i] = arr_buf.get(i);
        }
        return result;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        int sqrtOfNumber = (int)Math.ceil(Math.sqrt(number));
        boolean result = true;
        for (int i = 2; i <= sqrtOfNumber; i++){
            if ((0 == (number % i))&&(number != sqrtOfNumber)){
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++){
            result[i] = values[values.length-i-1];
        }
        return result;
    }
}
