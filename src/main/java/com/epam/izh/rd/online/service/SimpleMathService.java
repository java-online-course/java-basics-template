package com.epam.izh.rd.online.service;

import java.util.ArrayList;
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
        int res = 2;
        if (value1 == value2) res = 0;
        else if (value1 < value2) res = -1;
        else if (value1 > value2) res = 1;
        return res;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        int res = 0;
        if (value1 > value2) res = value1;
        if (value1 < value2) res = value2;
        return res;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int res = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = values.length - 1; j > values[0]; j--) {
                if (values[i] > values[j]) res = values[i];
            }
        }
        return res;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int res = 0;
        for (int i : values) res += i;
        return res;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                arrayList.add(values[i]);
            }
        }
        int[] arr = new int[arrayList.size()];
        for(Integer i: arrayList) {
            arr[count] = i;
            count++;
        }
        return arr;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long res = 1;
        if (initialVal == 0) {
            return 1;
        } else {
            while (initialVal != 0) {
                res *= initialVal;
                initialVal--;
            }
        }
        return res;
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
        ArrayList<Integer> arrayList= new ArrayList<>();
        int count1 = 0;
        int count2 = 1;
        arrayList.add(count1);
        arrayList.add(count2);
        int res;
        for(int i = 0; i < 100; i++){
            res = count1 + count2;
            arrayList.add(res);
            count1 = count2;
            count2 = res;
        }
        return arrayList.get(number);
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int min = values[i];
            int minI = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < min) {
                    min = values[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = values[i];
                values[i] = values[minI];
                values[minI] = tmp;
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
        if(number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int[] arr = new int[values.length];
        int count = 0;
        for(int i = values.length-1; i >= 0; i--) {
            arr[count] = values[i];
            count++;
        }
        return arr;
    }
}
