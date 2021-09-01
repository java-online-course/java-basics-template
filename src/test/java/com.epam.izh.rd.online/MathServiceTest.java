package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.MathService;
import com.epam.izh.rd.online.service.SimpleMathService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MathServiceTest {

    private static MathService mathService;

    @BeforeAll
    static void setup() {
        mathService = new SimpleMathService();
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testCompare")
    @DisplayName("Тест метода MathService.compare(int value1, int value2)")
    void testCompare(int value1, int value2, int expected) {
        assertEquals(expected, mathService.compare(value1, value2), "Для входных параметров: " + value1 + " " + value2);
    }

    @Test
    @DisplayName("Тест метода MathService.maxFrom(int value1, int value2)")
    void testMaxFrom() {
        assertEquals(2, mathService.maxFrom(-10, 2), "Для входных параметров: " + -10 + " " + 2);
    }

    @Test
    @DisplayName("Тест метода MathService.maxFrom(int[] values)")
    void testMaxFromArray() {
        int[] param = {1, 3, 5, 7, 8};
        assertEquals(8, mathService.maxFrom(param), "Для входных параметров: " + Arrays.toString(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testSumProvider")
    @DisplayName("Тест метода MathService.sum(int[] values)")
    void testSum(int[] param, int expected) {
        assertEquals(expected, mathService.sum(param), "Для входных параметров: " + Arrays.toString(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testGetEvenDigitsProvider")
    @DisplayName("Тест метода MathService.getEvenDigits(int[] values)")
    void testGetEvenDigits(int[] param, int[] expected) {
        assertArrayEquals(expected, mathService.getEvenDigits(param), "Для входных параметров: " + Arrays.toString(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testCalcFactorialProvider")
    @DisplayName("Тест метода MathService.calcFactorial(int initialVal)")
    void testCalcFactorial(int param, int expected) {
        assertEquals(expected, mathService.calcFactorial(param), "Для входого параметра: " + param);
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testCalcFibonacciProvider")
    @DisplayName("Тест метода MathService.calcFibonacci(int number)")
    void testCalcFibonacci(int param, int expected) {
        assertEquals(expected, mathService.calcFibonacci(param), "Для входого параметра: " + param);
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testSortProvider")
    @DisplayName("Тест метода MathService.sort(int[] arr)")
    void testSort(int[] param, int[] expected) {
        assertArrayEquals(expected, mathService.sort(param), "Для входных параметров: " + Arrays.toString(param));
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testIsPrimaryProvider")
    @DisplayName("Тест метода MathService.isPrimary(int number)")
    void testIsPrimary(int param, boolean expected) {
        assertEquals(expected, mathService.isPrimary(param), "Для входого параметра: " + param);
    }

    @ParameterizedTest
    @MethodSource("com.epam.izh.rd.online.Providers#testReverseArrayProvider")
    @DisplayName("Тест метода MathService.reverseArray(int[] arr)")
    void testIsPrimary(int[] param, int[] expected) {
        assertArrayEquals(expected, mathService.reverseArray(param), "Для входных параметров: " + Arrays.toString(param));
    }
}
