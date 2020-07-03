package com.epam.izh.rd.online.service;
import java.util.*;
public class SimpleMathService implements MathService {


    @Override
    public int compare(int value1, int value2) {
        return Integer.compare(value1, value2);
    }


    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }


    @Override
    public int maxFrom(int[] values) {
        int num = values[0];
        for(int x : values) {
            if(num < x) {
                num = x;
            }
        }
       return num;
    }


    @Override
    public int sum(int[] values) {
        int num = 0;
        for(int x : values) {
             num += x;
        }
        return num;
    }


    @Override
    public int[] getEvenDigits(int[] values) {
        ArrayList<Integer> array = new ArrayList<>();
for(int x : values) {
    if(x%2 == 0) {
        array.add(x);
    }
}
        int[] array1 = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            array1[i] = array.get(i);
        }
        return array1;
    }


    @Override
    public long calcFactorial(int initialVal) {
        if((initialVal==1)||(initialVal==0)) {
                return 1;
            } else {
                return initialVal*calcFactorial(initialVal-1);
            }

    }


    @Override
    public long calcFibonacci(int number) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(0,1));

        if ((number == 0)||(number == 1)) {
            return number;
        } else {
            for (int i = 2; i < number; i++) {
                array.add(i, (array.get(i - 1) + array.get(i - 2)));
            }
            return array.get(number-1) + array.get(number-2);
        }
    }


    @Override
    public int[] sort(int[] values) {
         Arrays.sort(values);
               return values;
    }


    @Override
    public boolean isPrimary(int number) {
        if ((number!=2)&&((number%2==0)||(number%3==0))) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public int[] reverseArray(int[] values) {
ArrayList<Integer> array = new ArrayList<>();

for(int i = 0; i < values.length; i++) {
    array.add(values[i]);
}
        Collections.reverse(array);

        int[] array1 = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            array1[i] = array.get(i);
        }
        return array1;
    }
}
