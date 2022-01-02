package com.epam.izh.rd.online.service;

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
        int returnValue = -2;
        if (value1==value2) {
           returnValue = 0;
        }
        if (value1<value2) {
            returnValue = -1;
        }
        if (value1>value2) {
            returnValue = 1;
        }
        return returnValue;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if(value1<=value2) {
            value1=value2;
        }
        return value1;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = values[0];
        for(int i=1;i<values.length;i++) {
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int i =0; i<values.length ; i++){
            sum = sum + values[i];
        }
        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int numberOfEven = 0;
        for (int i = 0; i < values.length; i++){
            if(values[i]%2 == 0) {
                numberOfEven++;
            }
        }
        int[] even = new int[numberOfEven];
        int temp = 0;
        for (int i = 0; i < values.length; i++){
            if(values[i]%2 == 0) {
                even[temp] = values[i];
                temp++;
            }
        }
        return even;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int fact = 1;
        int temp = 0;
        while (initialVal>1) {
            fact = fact*initialVal;
            initialVal--;
        }
        return fact;
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
        int[] fibo = new int[number + 2];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<=number; i++) {
            fibo[i]=fibo[i-1] + fibo[i-2];
        }
        return fibo[number];
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        int[] sort = new int[values.length];

        if (values.length > 0) {
            for(int i = 0; i < values.length; i++) {
                sort[i] = values[i];
            }
            for(int i = 0; i < sort.length; i++) {
                for(int j = i+1; j < sort.length; j++) {
                    if(sort[j] < sort[i] ) {
                        int tempMin = sort[j];
                        sort[j] = sort[i];
                        sort[i] = tempMin;
                    }
                }
            }
        }
        return sort;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        boolean isPrimary = true;

        if (number > 3){
            for(int i = number-1; i > 1; i--) {
                if (number%i == 0) {
                    isPrimary = false;
                    i = 0;
                }
            }
        }
        return isPrimary;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int[] reverseArr = new int[values.length];

        if (values.length > 0) {
            int j = 0;
            for(int i = values.length -1 ; i >= 0; i--) {
                reverseArr[j] = values[i];
                j++;
            }
        }

        return reverseArr;

    }
}
