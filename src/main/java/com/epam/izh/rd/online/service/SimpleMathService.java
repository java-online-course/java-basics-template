package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {

  /**
   * Метод возвращает 0, если value1 = value2. Метод возвращает -1, если value1 < value2. Метод
   * возвращает 1, если value1 > value2.
   * <p>
   * Например для (-1, -1) метод должен вернуть 0; Например для (-3, -1) метод должен вернуть -1;
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
   * Метод возвращает максимальное число из пары. Например для списка (-1, 2) метод должен вернуть
   * 2
   */
  @Override
  public int maxFrom(int value1, int value2) {
    return Math.max(value1, value2);
  }

  /**
   * Метод возвращает максимальное число из переданного массива. Например для списка {-1, -3, 4, 8,
   * 5, 22, -5} метод должен вернуть 22
   */
  @Override
  public int maxFrom(int[] values) {
    int max = values[0];
    for (int i = 1; i < values.length; i++) {
      max = Math.max(max, values[i]);
    }
    return max;
  }

  /**
   * Метод возвращает сумму чисел массива. Например для списка {-1, -3, 4, 8, 5, 22, -5} метод
   * должен вернуть 30
   */
  @Override
  public int sum(int[] values) {
    int sum = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    return sum;
  }

  /**
   * Метод фильтрует массив, оставляя только четные числа. Например для списка {-1, -3, 4, 8, 5, 22,
   * 17} метод должен вернуть {4, 8, 22}
   */
  @Override
  public int[] getEvenDigits(int[] values) {
    int j = 0;
    for (int i = 0; i < values.length; i++) {
      if (values[i] % 2 == 0) {
        j++;
      }
    }
    int nums[] = new int[j];
    int t = 0;
    for (int i = 0; i < values.length; i++) {
      if (values[i] % 2 == 0) {
        nums[t] = values[i];
        t++;
      }
    }
    return nums;
  }

  /**
   * Метод считает факториал из заданного числа. Например для числа 5 метод должен вернуть 120.
   * Факториал 0 должен быть равен 1.
   */
  @Override
  public long calcFactorial(int initialVal) {
    long factorial = 1;
    if (initialVal == 1 || initialVal == 0) {
      return 1;
    } else {
      for (int i = 2; i <= initialVal; i++) {
        factorial *= i;
      }
    }
    return factorial;
  }

  /**
   * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду
   * фибоначчи.
   * <p>
   * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих. Ряд
   * начинается 0 и 1. Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
   * <p>
   * Для числа 9 метод должен вернуть 34 Для числа 0 метод должен вернуть 0
   */
  @Override
  public long calcFibonacci(int number) {
    long numb1 = 0;
    long numb2 = 1;
    long numb3 = 0;
    if (number == 1) {
      return 1;
    }
    if (number > 1) {
      for (int i = 1; i < number; i++) {
        numb3 = numb1 + numb2;
        numb1 = numb2;
        numb2 = numb3;

      }
    }
    return numb3;
  }

  /**
   * Метод возвращает отсортированный по возрастанию массив. Например для массива {-1, -3, 4, 8, 5,
   * 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
   */
  @Override
  public int[] sort(int[] values) {
    boolean sorted = false;
    int temp;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < values.length - 1; i++) {
        if (values[i] > values[i + 1]) {
          temp = values[i];
          values[i] = values[i + 1];
          values[i + 1] = temp;
          sorted = false;
        }
      }
    }
    return values;
  }

  /**
   * Метод определяет, является ли заданное число простым. Простое число - число, которое делится
   * только на 1 и на само себя.
   * <p>
   * Например для числа 22 вернется false, а для числа 23 true.
   */
  @Override
  public boolean isPrimary(int number) {
    int temp;
    boolean isPrime = true;
    for (int i = 2; i < number; i++) {
      temp = number % i;
      if (temp == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Метод возвращает массив, в котором элементы расположены в обратном порядке.
   * <p>
   * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
   */
  @Override
  public int[] reverseArray(int[] values) {
    int[] arr = new int[values.length];
    int j = values.length - 1;
    for (int i = 0; i < values.length; i++) {
      arr[j] = values[i];
      j--;
    }
    return arr;
  }
}
