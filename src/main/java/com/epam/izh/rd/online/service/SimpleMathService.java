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
        if(value1==value2){
            return 0;
        }else{
            return value1>value2 ? 1:-1;
        }

    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if(value1>value2){
            return value1;
        }else{
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
        for (int i=0; i < values.length; i++){
            maxValue = maxValue > values[i] ? maxValue : values[i];
        }
        return maxValue;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum=0;
        for(int element:values){
            sum+=element;
        }
        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int quantity = 0;
        for (int i=0;i<values.length;i++){
            quantity = values[i]%2==0? quantity+1:quantity;
        }
        int[] evenValues  = new int[quantity];
        int position = 0;
        for (int i=0; i<values.length; i++){
            if (values[i]%2==0){
                evenValues[position]=values[i];
                position++;
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
        int valueForMultiply = initialVal-1;
        while(valueForMultiply>0){
            initialVal= initialVal*valueForMultiply;
            valueForMultiply--;
        }
        initialVal = initialVal == 0 ? 1 : initialVal;
        return initialVal;
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
        if (number>0) {
            int[] fibonacciValues = new int[number + 1];
            fibonacciValues[0] = 0;
            fibonacciValues[1] = 1;
            for (int i = 2; i <= number; i++) {
                fibonacciValues[i] = fibonacciValues[i - 1] + fibonacciValues[i - 2];
            }
            return fibonacciValues[fibonacciValues.length - 1];
        }else{
            return 0;
        }
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        for(int outside=values.length-1;outside>=1;outside--){
            for (int inside=0;inside<outside;inside++){
                if(values[inside]>values[inside+1]){
                    int placeForSwap = 0;
                    placeForSwap = values[inside+1];
                    values[inside+1]=values[inside];
                    values[inside]=placeForSwap;
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
        int counter = 2;
        for (int i = 2; i < 11; i++) {
            if (number == i) {
                continue;
            } else if (number % i == 0) {
                counter++;
            }
        }if (counter > 2) {
            return false;
        }
        else {
            return true;
        }

    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {

        int[] reverseValues = new int[values.length];
        int position = values.length - 1;
        for (int i = 0; i < values.length; i++){
            reverseValues[i] = values[position- i];
        }

                return reverseValues;
    }
}
