package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.MathService;
import com.epam.izh.rd.online.service.SimpleMathService;

public class JavaBasics {
    public static void main(String[] args) {
        SimpleMathService secondex = new SimpleMathService();
        System.out.println(secondex.calcFibonacci(9));
    }
}
