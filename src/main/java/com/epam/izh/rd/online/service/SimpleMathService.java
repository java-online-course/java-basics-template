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
        if(value1 < value2) {
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
        return (value1 > value2) ? value1 : value2;  // скобки необязательны, но с ними нагляднее.
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = values[0];
        for (int i : values) {
            if (i > max) max = i;
        }
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int res = 0;
        for (int i : values) {
            res += i;
        }
        return res;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {

        //находим длину нового массива и инициализируем его.
        int newArrayLength = 0;
        for (int i : values) {
            if(i % 2 == 0 ) newArrayLength++;
        }
        int[] newArray = new int[newArrayLength];

        //заполняем новый массив
        int currentIndex = 0;
        for (int i : values) {
            if(i % 2 == 0 ) {
                newArray[currentIndex] = i;
                currentIndex++;
            }
        }
        return newArray;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        if (initialVal == 0)
            return 1;
        return calcFactorial(initialVal - 1) * initialVal;
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
        int num1 = 0;
        int num2 = 1;
        int res;
        if (number == 0)
            return 0;
        for (int i = 2; i <= number; i++) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        return num2;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int t = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = t;
                    flag++;
                }
            }
            if (flag == 0) break;
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
        for (int i=2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
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
        int[] newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[values.length - 1 - i] = values[i];
        }
        return newValues;
    }
}
