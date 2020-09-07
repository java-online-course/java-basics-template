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
        if (value1 > value2) {
            return 1;

        } else if (value1 < value2) {
            return -1;

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
        int r = 0;
        if (value1 > value2) {
            r = value1;
            return r;
        } else if (value1 < value2) {
            r = value2;
            return r;
        }
        return r;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int k = values[0];
        for (int i = 0; i <= (values.length-1); i++) {
            if (values[i] > k) {
                k = values[i];
            }
        }
        return k;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int r = 0;
        for (int i = 0; i <= (values.length - 1); i++) {
            r += values[i];
        }
        return r;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int a = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                a++;
            }
        }
        int[] mas = new int[a];
        int b = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                mas[b] = values[i];
                b++;
            }
        }
        return mas;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int r = 1;
        int z = 1;
        do {
            z = z * r;
            r++;
        } while (r <= initialVal);
        return z;
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
        int k = 1;
        int m = 1;
        int t = number;
        if (number < 2) {
            return number;

        } else if (number == 2) {
            return (number - 1);

        } else if (number >= 3) {
            for(int i = 3; i <= t; i++) {
                number = k + m;
                k = m;
                m = number;
            }
        }
        return number;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        if (values.length < 1) {
            return new int[]{};

        } else {
            for (int i = 0; i < values.length; i++) {
                int kmin = values[i];
                int smin = i;

                for (int j = i + 1; j < values.length; j++) {
                    if (values[j] < kmin) {
                        kmin = values[j];
                        smin = j;
                    }
                }
                if (i != smin) {
                    int tmp = values[i];
                    values[i] = values[smin];
                    values[smin] = tmp;
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
        if (number < 4) {
            return true;

        } else if (number % 2 == 0) {
            return false;

        } else {
            for (int i = 3; i * i <= number; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            return true;
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
        if (values.length < 1) {
            return new int[]{};

        } else {
             for (int i = 0; i < (values.length / 2); i++) {
                int tmp = values[i];
                values[i] = values[values.length - i - 1];
                values[values.length - i - 1] = tmp;
            }
        return values;
        }
    }
}