package com.epam.izh.rd.online.service;

import java.util.ArrayList;

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
        if (value1==value2) return 0;
        return (value1<value2)? -1: 1;
        }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
       return (value1<value2)? value2 : value1;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values)
    {
        int max=0;
        for (int i=0;i<values.length-1;i++) {
            if (values[i] > values[i + 1]) {
                max = values[i];
            } else max = values[i + 1];

        }
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int s=0;
        for (int arr:values) {
            s+=arr;
        }
        return s;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int j = 0;
        int d = 0;
        for (int i=0;i<values.length;i++) {
            if (values[i] % 2 == 0) {
                j++;
            }
        }
        int myArray[] =new int[j];
        for(int i=0;i<values.length;i++){
            if (values[i] % 2 == 0){
                myArray[d]=values[i];
                d++;
            }
        }
        return myArray;
    }




    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long result;
        if(initialVal==0) return 1;
        result = calcFactorial(initialVal-1)*initialVal;
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
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return calcFibonacci(number - 1) + calcFibonacci(number - 2);
        }
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        int temp = 0;
        for (int i=0; i<values.length; i++) {
            boolean isChanged = false;
            for (int j = values.length-1; j > i; j--) {
                if (values[j] < values[j-1]) {
                    temp = values[j];
                    values[j]=values[j-1];
                    values[j-1] = temp;
                    isChanged = true;
                }
            }
          if (!isChanged) { break;}
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
        if (number>2&&number%2 == 0){
            return false;
        }
        for (int i=2; i<number;i++) {
            if (number % i == 0) return false;
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
        int arry[] = new int[values.length];
        int  j = 0;
        {
            for (int i = values.length - 1; i >= 0; i--, j++) {
                arry[i] = values[j];

            }


//        int j = values.length-1;
//        int temp=0;
//        for (int i = 0;i<values.length/2;i++,j--){
//            temp = values[i];
//            values[i] = values[j];
//            values[j] = temp;

        }
        return arry;
    }
}
