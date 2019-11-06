package com.epam.izh.rd.online;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Providers {

    private Providers() {

    }

    public static Stream<Arguments> testSumProvider() {
        return Stream.of(
                arguments(new int[]{1, 2}, 3),
                arguments(new int[]{-6, 5, -2, 78}, 75),
                arguments(new int[]{5, -7, 3, 7, 3, -1, 4, 3}, 15)
        );
    }

    public static Stream<Arguments> testGetEvenDigitsProvider() {
        return Stream.of(
                arguments(new int[]{2}, new int[]{1, 2}),
                arguments(new int[]{-6, -2, 78}, new int[]{-6, 5, -2, 78}),
                arguments(new int[]{}, new int[]{5, -7, 3, 7, 3, -1, 3})
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
                arguments(new int[]{-1, -3, 4, 8, 5, 22, -5}, new int[]{-5, -3, -1, 4, 5, 8, 22}),
                arguments(new int[]{3, 4, 3, 4}, new int[]{3, 3, 4, 4})
        );
    }

    public static Stream<Arguments> testIsPrimaryProvider() {
        return Stream.of(
                arguments(1, true),
                arguments(4, false),
                arguments(5, true),
                arguments(10, false),
                arguments(21, false),
                arguments(23, true)
        );
    }

    public static Stream<Arguments> testReverseArrayProvider() {
        return Stream.of(
                arguments(new int[]{-1, -3, 4, 8, 5, 22, -5}, new int[]{-5, 22, 5, 8, 4, -3, -1}),
                arguments(new int[]{4, 4, 5, 5, 2, 6}, new int[]{6, 2, 5, 5, 4, 4})
        );
    }

    public static Stream<Arguments> testRemoveStringProvider() {
        return Stream.of(
                arguments("Hello, hello, hello, how low?", ", he", "Hellollollo, how low"),
                arguments("Ahahahahaha", "ha", "A"),
                arguments("London is the capital of Great Britain", "Russia", "London is the capital of Great Britain")
        );
    }

    public static Stream<Arguments> testIsQuestionStringProvider() {
        return Stream.of(
                arguments("Hello, hello, hello, how low?", true),
                arguments("Hello, hello, hello!", false),
                arguments("", false)
        );
    }

    public static Stream<Arguments> testConcatenateProvider() {
        return Stream.of(
                arguments(new String[]{"Smells", " ", "Like", " ", "Teen", " ", "Spirit"}, "Smells Like Teen Spirit"),
                arguments(new String[]{"", ""}, "")
        );
    }

    public static Stream<Arguments> testToJumpCaseProvider() {
        return Stream.of(
                arguments("Load Up On Guns And Bring Your Friends", "lOaD Up oN GuNs aNd bRiNg yOuR FrIeNdS"),
                arguments("", "")
        );
    }

    public static Stream<Arguments> testIsPalindromeProvider() {
        return Stream.of(
                arguments("а роза упала на лапу Азора", true),
                arguments("я не палиндром!", false),
                arguments("", false)
        );
    }
}
