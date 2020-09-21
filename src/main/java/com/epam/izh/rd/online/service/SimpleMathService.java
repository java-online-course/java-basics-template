package com.epam.izh.rd.online.service;

import java.util.ArrayList;

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
        if (value1 == value2){
            return 0;
        }
        if (value1 < value2){
            return -1;
        }
        if (value1 > value2){
            return 1;
        }
    return -2;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 > value2){
            return value1;
        }else return value2;


    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxZ = 0;
        for (int i = 0; i < values.length; i++) {
            maxZ = values[i];
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < maxZ) {
                    maxZ = values[j];
                }
            }
        }
        return maxZ;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int rez = 0;
        for (int i = 0; i < values.length; i++) {
            rez = rez + values[i];
        }
        return rez;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }
        int[] rezArr = new int[count];
        int i = 0;
        for (int j = 0; j < values.length; j++) {
            int rez = values[j];
            if (rez % 2 == 0) {
                rezArr[i]=rez;
                i++;
            }
        }
        return rezArr;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int rez = 1;//!0=1
        for (int i = 1; i <= initialVal; i++) {
            rez = rez * i;
        }
        return rez;
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
        int pre=0, next=1, result=0;
        for (int i = 0; i < number; i++) {
            result = pre + next;
            pre = next;
            next = result;
        }
        return pre;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int minZnach = values[i];
            int minId = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < minZnach) {
                    minZnach = values[j];
                    minId = j;
                }
            }
            int temp = values[i];
            values[i] = minZnach;
            values[minId] = temp;
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
        if (number == 1) // 1 - не простое число
            return false;
        // перебираем возможные делители от 2 до sqrt(n)
        for (int d = 2; d * d <= number; d++) {
            // если разделилось нацело, то составное
            if (number % d == 0)
                return false;
        }
        // если нет нетривиальных делителей, то простое
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        for (int i = 0; i < values.length / 2; i++) {
            int tmp = values[i];
            values[i] = values[values.length - i - 1];
            values[values.length - i - 1] = tmp;
        }
        return values;
    }
}