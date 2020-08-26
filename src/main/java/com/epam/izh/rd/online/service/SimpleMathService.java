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
        if (value1 == value2) return 0;
        if (value1 < value2) return -1;
        return 1;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return value1 > value2 ? value1 : value2;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++)
            if(max < values[i])
                max = values[i];
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++)
            sum += values[i];
        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0)
                count++;
        }

        int[] ans = new int[count];
        count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                ans[count] = values[i];
                count++;
            }
        }
        values = ans;
        return values;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long ans = 1L;
        for (long i = 2; i <= (long)initialVal; i++)
            ans *= i;
        return ans;
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
        if(number == 0) return 0;
        long a = 1L, b = 1L, c, temp;
        int tempNum = 1;
        while (number > tempNum){
            c = a + b;
            temp = a; a = b; b = temp;
            temp = b; b = c; c = temp;
            tempNum++;
        }
        return a;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {

        int temp;
        for(int i = 0; i < values.length; i++){
            for(int j = i + 1; j < values.length; j++) {
                if (values[i] > values[j]) {
                    //values[i] ^= values[j] ^= values[i] ^= values[j];
                    temp = values[i]; values[i] = values[j]; values[j] = temp;
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
        for (int i = 2; i <= Math.round(Math.sqrt(number)); i++){
            if(number % i == 0)
                return false;
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
        if(values.length == 0)
            return new int[]{};
        int temp;
        for(int i = 0; i <= Math.round(values.length / 2); i++){
            temp = values[i]; values[i] = values[values.length - i - 1]; values[values.length - i - 1] = temp;
        }
        return values;
    }
}
