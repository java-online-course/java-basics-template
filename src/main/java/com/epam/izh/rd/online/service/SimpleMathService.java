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
        int i;
        if (value1 == value2) {
            i = 0;
        } else if ( value1 < value2){
            i = -1;
        } else  {
            i = 1;
        } return i;
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
        int o = values[0];
        for (int i = 1; i < values.length; i++){
            o = Math.max(o, values[i]);
        } return o;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum = sum + value;
        }
        return sum;
    }


    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int n = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                n++; // Узнал длину массива
            }
        }
        int[] newValue = new int[n];
        int index = 0;
        for (int i = 0; i < n+1; i++){
            if (values.length < 1){
                return values;
            } else if (values[i]%2 == 0){
                newValue[index] = values[i]; // Если число четное, присваиваем его значение в индекс нового массива
                index++;
            }
        }
        return newValue;
   }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int result = 1;
        for (int i = 1; i <= initialVal; i ++) {
            result = result * i;
        } return result;
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
        long[] array = new long[number + 2];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= number; i++){
            array[i] = array[i - 1] + array[i -2];
        }
        return array[number];
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i + 1]) {
                    isSorted = false;

                    buf = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = buf;
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
        if (number <=2){
            return true;}
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false; }
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
        int n = values.length;
        int temp;
        for (int i = 0; i < n/2; i++){
            temp = values[n - i - 1];
            values[n - i - 1] = values[i];
            values[i] = temp;
        }
        return values;
    }
}
