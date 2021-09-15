package com.epam.izh.rd.online.service;


import java.util.Arrays;

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
        if (value1 == value2) {
            return 0;
        } else if (value1 < value2) {
            return -1;
        } else {
            return 1;
        }
    }


    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 == value2) {
            return value1;
        } else if (value1 < value2) {
            return value2;
        } else {
            return value1;
        }
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
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
        int summa = 0;
        for (int i = 0; i < values.length; i++) {
            summa += values[i];

        }
        return summa;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int numberCounter = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                numberCounter++;
            }
        }
        int[] evenArray = new int[numberCounter];
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenArray[j] = (int) values[i];
                j++;
            }

        }
        return evenArray;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */

        @Override
        public long calcFactorial(int initialVal) {
            int result = 1;
            for (int i = 1; i <= initialVal; i++) {
                result *= i;
            }
            return result;
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
        return -1L;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        Arrays.sort(values);
        return values;
    }
    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     * * <p>
     * * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        {
            for (int i = 2; i < number; i++)  //бежим по циклу начиная от 2 и до самого числа не включительно
            {
                if (number % i == 0)  //если остаток от деления числа на значение шага цикла равен нулю, то
                {
                    return false;  //вернуть false, переданное число простым не является
                }
            }
            //если же ни одного значения, удоволетворяющего условию выше, не было найдено, то
            return true;  //вернуть true, переданное число простое
        }

    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     * <p>
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

