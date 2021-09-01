package com.epam.izh.rd.online;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Providers {

    private Providers() {

    }

    public static Stream<Arguments> testCompare() {
        return Stream.of(
                arguments(-10, -1, -1),
                arguments(0, 0, 0),
                arguments(3, 3, 0),
                arguments(33, 2, 1)
        );
    }

    public static Stream<Arguments> testSumProvider() {
        return Stream.of(
                arguments(new int[]{}, 0),
                arguments(new int[]{1, 2}, 3),
                arguments(new int[]{-6, 5, -2, 78}, 75),
                arguments(new int[]{5, -7, 3, 7, 3, -1, 4, 3}, 17)
        );
    }

    public static Stream<Arguments> testGetEvenDigitsProvider() {
        return Stream.of(
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{1, 2}, new int[]{2}),
                arguments(new int[]{-6, 5, -2, 78}, new int[]{-6, -2, 78}),
                arguments(new int[]{5, -7, 3, 7, 3, -1, 3}, new int[]{})
        );
    }

    public static Stream<Arguments> testCalcFactorialProvider() {
        return Stream.of(
                arguments(5, 120),
                arguments(0, 1),
                arguments(8, 40320),
                arguments(9, 362880)
        );
    }

    public static Stream<Arguments> testCalcFibonacciProvider() {
        return Stream.of(
                arguments(0, 0),
                arguments(1, 1),
                arguments(2, 1),
                arguments(3, 2),
                arguments(4, 3),
                arguments(5, 5),
                arguments(7, 13),
                arguments(11, 89)
        );
    }

    public static Stream<Arguments> testSortProvider() {
        return Stream.of(
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{-1, -3, 4, 8, 5, 22, -5}, new int[]{-5, -3, -1, 4, 5, 8, 22}),
                arguments(new int[]{3, 4, 3, 4}, new int[]{3, 3, 4, 4})
        );
    }

    public static Stream<Arguments> testIsPrimaryProvider() {
        return Stream.of(
                arguments(2, true),
                arguments(4, false),
                arguments(5, true),
                arguments(10, false),
                arguments(21, false),
                arguments(23, true),
                arguments(7349, true)
        );
    }

    public static Stream<Arguments> testReverseArrayProvider() {
        return Stream.of(
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{-1, -3, 4, 8, 5, 22, -5}, new int[]{-5, 22, 5, 8, 4, -3, -1}),
                arguments(new int[]{4, 4, 5, 5, 2, 6}, new int[]{6, 2, 5, 5, 4, 4})
        );
    }
}
