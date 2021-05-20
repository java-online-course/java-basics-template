package com.epam.izh.rd.online.service;

import static java.lang.Math.sqrt;

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
        if (value1 == value2) {
            return 0;}
        else if (value1 < value2) {
            return -1;}
        else {
            return 1;}

    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 > value2) {
            return value1; }
        else {
            return value2;
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
        int sumArray = 0;
        for (int i=0; i < values.length; i++){
            sumArray +=values[i];
        }
        return sumArray;
    }

    /**
     @@ -49,7 +73,21 @@ public int sum(int[] values) {
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int countOfEven = 0;
        for (int i =0; i < values.length; i++){
            if (values[i] % 2 == 0) {
                countOfEven++;
            }
        }
        int[] evenArray = new int[countOfEven];
        for (int i = 0, j = 0; i < values.length; i++){
            if (values[i] % 2 == 0){
                evenArray[j] = values[i];
                j++;
            }
        }

        return  evenArray;
    }

    /**
     @@ -59,7 +97,11 @@ public int sum(int[] values) {
     */
    @Override
    public long calcFactorial(int initialVal) {
        if (initialVal <= 1) {
            return 1;
        } else {
            return initialVal * calcFactorial(initialVal - 1);
        }
    }

    /**
     @@ -74,7 +116,13 @@ public long calcFactorial(int initialVal) {
     */
    @Override
    public long calcFibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else  {
            return calcFibonacci(number - 1) + calcFibonacci(number - 2);
        }
    }

    /**
     @@ -83,7 +131,20 @@ public long calcFibonacci(int number) {
     */
    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++){
            int min = values[i];
            int minId = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < min) {
                    min = values[j];
                    minId = j;
                }
            }
            int temp = values[i];
            values[i] = min;
            values[minId] = temp;
        }
        return values;
    }

    /**
     @@ -94,16 +155,27 @@ public long calcFibonacci(int number) {
     */
    @Override
    public boolean isPrimary(int number) {
        for (int i = 2; i <= sqrt(number); i++){
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
        int[] reverseArray = new int[values.length];
        int reveseCaunt = values.length - 1;
        for (int i = 0; i < values.length; i++){
            reverseArray[reveseCaunt] = values[i];
            reveseCaunt--;
        }
        return reverseArray;

    }
}