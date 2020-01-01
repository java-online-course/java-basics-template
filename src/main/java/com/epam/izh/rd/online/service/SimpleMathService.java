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
    // DONE
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
    // DONE
    @Override
    public int maxFrom(int value1, int value2) {
        return value1 > value2 ? value1 : value2;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    // DONE
    @Override
    public int maxFrom(int[] values) {
        int lastMaxValue = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > lastMaxValue) {
                lastMaxValue = values[i];
            }
        }

        return lastMaxValue;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    // DONE
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int amountOfEvenDigits = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                amountOfEvenDigits++;
            }
        }

        int[] filteredValues = new int[amountOfEvenDigits];
        int position = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                filteredValues[position++] = values[i];
            }
        }
        return filteredValues;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    // DONE
    @Override
    public long calcFactorial(int initialVal) {
        long calculatedFactorial = 1;
        for (int i = initialVal; i > 0; i--) {
            calculatedFactorial *= (long) i;
        }
        return calculatedFactorial;
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
        if (number > 0) {
            int[] fibonacciValues = new int[number + 1];
            fibonacciValues[0] = 0;
            fibonacciValues[1] = 1;
            for (int i = 2; i <= number; i++) {
                fibonacciValues[i] = fibonacciValues[i - 1] + fibonacciValues[i - 2];
            }
            return fibonacciValues[fibonacciValues.length - 1];
        } else {
            return 0;
        }
    }

        /**
         * Метод возвращает отсортированный по возрастанию массив.
         * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
         */
        @Override
        public int[] sort ( int[] values){
            int i = 1;
            int temp;
            while (i < values.length) {
                if (i == 0 || values[i - 1] <= values[i]) {
                    i++;
                } else {
                    temp = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = temp;
                    i--;
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
        // DONE
        @Override
        public boolean isPrimary ( int number){
            int amountOfDividers = 2;
            for (int i = 2; i < 8; i++) {
                if (number == i) {
                    continue;
                } else if (number % i == 0) {
                    amountOfDividers++;
                }
            }
            return amountOfDividers == 2 ? true : false;
        }

        /**
         * Метод возвращает массив, в котором элементы расположены в обратном порядке.
         *
         * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
         */
        // DONE
        @Override
        public int[] reverseArray ( int[] values){
            int[] reversedArray = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                reversedArray[values.length - i - 1] = values[i];
            }
            return reversedArray;
        }
    }
