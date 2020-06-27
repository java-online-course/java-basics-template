package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.SimpleMathService;

import java.util.Arrays;

public class JavaBasics {
    public static void main(String[] args) {
        int[] a = {-1, -3, 4, 8, 5, 22, 17};
        SimpleMathService sms = new SimpleMathService();
        System.out.println(Arrays.toString(sms.getEvenDigits(a)));
    }
}
