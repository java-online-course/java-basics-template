package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.SimpleMathService;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        SimpleMathService simpleMathService = new SimpleMathService();
        System.out.println(simpleMathService.calcFibonacci(9));
    }
}
