package com.epam.izh.rd.online.service;
class test{

   static public int[] reverseArray(int[] values) {
       int arry[] = new int[values.length];
       int  j = 0;
       {
            for (int i = values.length - 1; i >= 0; i--, j++) {
                arry[i] = values[j];

            }
        }
        return arry;
    }


    public static void main(String[] args) {
       test.reverseArray(new int[]{-1,-3,4,8,5,22,-5} );
    }
}



