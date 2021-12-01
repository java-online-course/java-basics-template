package com.epam.izh.rd.online.service;

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
        if (value1 < value2) {
            return -1;
        } else if (value1 > value2) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 == value2) {         // А если занения переменных равны?
            return 0;
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
        int maximumValue = values[0];                                   // Проверку начнём с 1 значения массива
        for (int maxIndex = 0; maxIndex < values.length; maxIndex++) {
            if (maximumValue <= values[maxIndex]) {
                maximumValue = values[maxIndex];
            }
        }
        return maximumValue;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int totSum = 0;
        for (int i = 0; i < values.length; i++)
            totSum += values[i];
        return totSum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int evenDigitsCounter = 0;                      // Тут сколько чётных чисел

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenDigitsCounter++;
            }
        }

        int evenDigits[] = new int[evenDigitsCounter]; // Тут результирующий массив
        int c = 0;                                     // Тут счётчик индекса для результирующего массива

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenDigits[c] = values[i];
                c++;
            }
        }
        return evenDigits;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long factorial = 1;
        for (int c = 1; c <= initialVal; c++) {
            factorial *= c;
        }
        return factorial;
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
        if (number == 0) {  // защита от нуля
            return 0;
        }

        long a = 0;
        long fibonacci = 1;

        for (int i = 2; i <= number; i++) { // складываем и сохраняем
            long n = a + fibonacci;
            a = fibonacci;
            fibonacci = n;
        }
        return fibonacci;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        for (int i = values.length - 1; i > 0; i--) {   // каждый проход уменьшает сравниваемую область массива
            for (int j = 0; j < i; j++) {               // с помощью временной переменной переставляем максимальное
                if (values[j] > values[j + 1]) {        // значение правее
                    int buffer = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = buffer;
                }
            }
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
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {

        int buffer[] = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            buffer[i] = values[values.length - 1 - i];
        }
        return buffer;
    }
}
