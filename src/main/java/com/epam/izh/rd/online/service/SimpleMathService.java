package com.epam.izh.rd.online.service;

import java.util.Arrays;

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
        if (value1 == value2) {
           return 0;
        }else if (value1 < value2){
           return -1;
        }else{
            return 1;
        }
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 > value2){
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
        int max = 0;

        for (int i = 0; i<values.length; i++){
            int element = values [i];
            if (element >= max){
                max = element;
            }
        }return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int summa = 0;

        for (int i = 0; i < values.length; i++){
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

        int a = 0;

        for (int i = 0; i < values.length; i++){
            if (values[i] % 2==0) {
                a++;
            }
        }//System.out.println(a)

        int[] massiv = new int [a];
        //System.out.println(massiv.length);

        int c=0;

        for (int i=0; i<values.length; i++){
            if (values[i] % 2==0){
                massiv [c] = values[i];
                c++;
            }

        }
        //System.out.println(Arrays.toString(massiv));
        return massiv;

    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int rez = 1;
        int i;
        for (i=1; i<=initialVal; i++){
            rez = rez * i;
        };

        return rez;
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
        /*int[] arr = new int [number+1];

        arr[0]=0;
        arr[1]=1;

        for (int i=2; i<=number; i++)
            arr[i] = arr [i-1] + arr [i-2];
        return  arr[number];*/

        if (number <= 1){
            return number;

        }return calcFibonacci(number - 1) + calcFibonacci(number - 2);
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
         int a;
         for (int i=0; i<values.length; i++){

             for (int j=0; j<values.length; j++){

                 if (j==values.length-1){
                     break;
                 }else if (values[j] > values[j+1]){
                     a = values [j+1];
                     values [j+1] = values [j];
                     values [j] = a;
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

        int n = 7400;
        int [] arr = new int [n];
        boolean [] arrBin = new boolean[n];


        for (int i = 0; i<n; i++){
            arr[i]=i;
            if (arr[i]!=1){
                arrBin[i] = true;
            }

        }
        for (int j = 2; j*j<n; j++){

            for (int k = j*j; k<n; k+=j){
                arrBin[k] = false;
                arr[k]=1;
            }
        }arrBin[1] = true;//for (int i = 0; i<n; i++){


        return arrBin[number];

        }



    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {

        int[] arr = new int [values.length];
        int j = values.length - 1;

        for (int i=0; i<values.length; i++){
            if (j<0){
                break;
            }else {
                arr[j] = values [i];
                j--;
            }

        }

        return arr;
    }
}
