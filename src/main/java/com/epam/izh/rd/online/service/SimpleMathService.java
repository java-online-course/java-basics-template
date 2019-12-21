package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {

    @Override
    public int compare(int value1, int value2) {
        if (value1 > value2) {
            return 1;
        }
        if (value1 < value2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }

    @Override
    public int maxFrom(int[] values) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        int resArraySize = 0;
        int[] result;
        for (int value : values) {
            if ((value % 2) == 0) {
                resArraySize++;
            }
        }
        result = new int[resArraySize];
        for (int i = 0, j = 0; i < values.length; i++) {
            if ((values[i] % 2) == 0) {
                result[j] = values[i];
                j++;
            }
        }
        return result;
    }

    @Override
    public long calcFactorial(int initialVal) {
        if (initialVal > 0) {
            return initialVal * calcFactorial(initialVal - 1);
        } else {
            return 1;
        }
    }

    @Override
    public long calcFibonacci(int number) {
        return (long) (Math.pow((Math.sqrt(5) + 1) / 2, number) / Math.sqrt(5) + 0.5);
    }

    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
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

    @Override
    public boolean isPrimary(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int[] reverseArray(int[] values) {
        int tmp;
        for (int i = 0; i < values.length / 2; i++) {
            tmp = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - i - 1] = tmp;
        }
        return values;
    }
}