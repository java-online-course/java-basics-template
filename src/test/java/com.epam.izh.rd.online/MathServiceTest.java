package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.MathService;
import com.epam.izh.rd.online.service.SimpleMathService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {

    private static MathService mathService;

    @BeforeAll
    static void setup() {
        mathService = new SimpleMathService();
    }

    @Test
    @DisplayName("Тест метода MathService.maxFrom(int value1, int value2)")
    void testMaxFrom() {
        assertEquals(2, mathService.maxFrom(-10, 2));
    }

    @Test
    @DisplayName("Тест метода MathService.maxFrom(int[] values)")
    void testMaxFromArray() {
        assertEquals(8, mathService.maxFrom(new int[] {1, 3, 5, 7, 8}));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testSumProvider")
    @DisplayName("Тест метода MathService.sum(int[] values)")
    void testSum(int[] param, int expected) {
        assertEquals(expected, mathService.sum(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testGetEvenDigitsProvider")
    @DisplayName("Тест метода MathService.getEvenDigits(int[] values)")
    void testGetEvenDigits(int[] param, int[] expected) {
        assertEquals(expected, mathService.getEvenDigits(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testCalcFactorialProvider")
    @DisplayName("Тест метода MathService.calcFactorial(int initialVal)")
    void testCalcFactorial(int param, int expected) {
        assertEquals(expected, mathService.calcFactorial(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testCalcFibonacciProvider")
    @DisplayName("Тест метода MathService.calcFibonacci(int number)")
    void testCalcFibonacci(int param, int expected) {
        assertEquals(expected, mathService.calcFibonacci(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testSortProvider")
    @DisplayName("Тест метода MathService.sort(int[] arr)")
    void testSort(int[] param, int[] expected) {
        assertEquals(expected, mathService.sort(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testIsPrimaryProvider")
    @DisplayName("Тест метода MathService.isPrimary(int number)")
    void testIsPrimary(int param, boolean expected) {
        assertEquals(expected, mathService.isPrimary(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testReverseArrayProvider")
    @DisplayName("Тест метода MathService.reverseArray(int[] arr)")
    void testIsPrimary(int[] param, int[] expected) {
        assertEquals(expected, mathService.reverseArray(param));
    }
}
