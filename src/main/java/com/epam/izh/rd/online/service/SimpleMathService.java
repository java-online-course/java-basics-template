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
        return Integer.compare(value1, value2);
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value2, value1);
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max=values[0];
        for(int i=0; i < values.length; i++){
            if(max<values[i]){
                max=values[i];
            }
        }
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum=0;
        for(int i=0; i < values.length; i++){
            sum+=values[i];
        }

        return sum;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int count=0;
        for(int i=0; i < values.length; i++){
            if(Math.abs(values[i])%2==0){
                count++;
            }
        }
        int[] new_arr=new int[count];
        count=0;
        for(int i=0; i < values.length; i++){
            if(Math.abs(values[i])%2==0){
                new_arr[count]=values[i];
                count++;
            }
        }
        return new_arr;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        if(initialVal==0){
            return 1;
        }
        long res=1;
        for(int i=1;i<=initialVal;i++){
            res=res*i;

        }
        return res;
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
        if(number==0){return 0;}
        if(number==1){return 1;}

        number++;
        long[] Fib=new long[number];
        Fib[0]=0;
        Fib[1]=1;

        for(int i=2;i<number;i++){
            Fib[i]=Fib[i-1]+Fib[i-2];
        }
        return Fib[number-1];
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        int[] arr = new int[values.length];
        int[] temp= new int[values.length];
        /*arr=values;
        temp=values;*/
        for (int i=0;i< values.length;i++){
            arr[i]=values[i];
            temp[i]=values[i];
        }
        boolean trigger;

        while(true){
            trigger=true;
            for(int i=1;i< values.length;i++){
                if(arr[i-1]>arr[i]){
                    temp[i]=arr[i-1];
                    temp[i-1]=arr[i];
                    trigger=false;
                    break;
                }
            }
            for (int i=0;i< values.length;i++){
                arr[i]=temp[i];
            };
            if(trigger){
                break;
            }
        }
        return arr;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        boolean res=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                res=false;
                break;
            }
        }
        return res;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int[] arr=new int[values.length];

        for(int i=0;i< values.length;i++){
            arr[i]=values[values.length-1-i];
        }

        return arr;
    }
}
