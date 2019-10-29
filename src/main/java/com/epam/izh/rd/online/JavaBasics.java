package com.epam.izh.rd.online;


import com.epam.izh.rd.online.service.SimpleMathService;
import com.epam.izh.rd.online.service.SimpleTextService;

import java.util.Arrays;

/**
 * В данном классе проверяется корректность реализованных вами методов.
 * Текст для проверки уже задан.
 *
 * Результаты работы методов будут проверены с ответами.
 * Если метод реализован неверно, в консоль будет выведена ошибка.
 */
public class JavaBasics {

    public static void main(String[] args) {

        boolean practiseMadeCorrectly = true;

        // --------------------------- MathService --------------------------- //

        SimpleMathService mathService = new SimpleMathService();

        // --------------------------- maxFrom --------------------------- //

        Integer maxFromValues = mathService.maxFrom(3_000, 4_000);
        Integer correctValue = 4_000;

        if (!maxFromValues.equals(correctValue)) {
            System.out.println(String.format("Метод maxFrom работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", maxFromValues, correctValue));
            practiseMadeCorrectly = false;
        }


        maxFromValues = mathService.maxFrom(-3_000, -4_000);
        correctValue = -3_000;

        if (!maxFromValues.equals(correctValue)) {
            System.out.println(String.format("Метод maxFrom работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", maxFromValues, correctValue));
            practiseMadeCorrectly = false;
        }


        maxFromValues = mathService.maxFrom(33, 33);
        correctValue = 33;

        if (!maxFromValues.equals(correctValue)) {
            System.out.println(String.format("Метод maxFrom работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", maxFromValues, correctValue));
            practiseMadeCorrectly = false;
        }


        maxFromValues = mathService.maxFrom(-8_000_000, 5_000_000);
        correctValue = 5_000_000;

        if (!maxFromValues.equals(correctValue)) {
            System.out.println(String.format("Метод maxFrom работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", maxFromValues, correctValue));
            practiseMadeCorrectly = false;
        }

        // --------------------------- maxFrom --------------------------- //

        maxFromValues = mathService.maxFrom(new int[]{-1, 2, 3, -4, 5, -0, 9_000_000});
        correctValue = 9_000_000;

        if (!maxFromValues.equals(correctValue)) {
            System.out.println(String.format("Метод maxFrom работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", maxFromValues, correctValue));
            practiseMadeCorrectly = false;
        }


        maxFromValues = mathService.maxFrom(new int[]{3, -3});
        correctValue = 3;

        if (!maxFromValues.equals(correctValue)) {
            System.out.println(String.format("Метод maxFrom работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", maxFromValues, correctValue));
            practiseMadeCorrectly = false;
        }

        // --------------------------- sum --------------------------- //

        Integer sum = mathService.sum(new int[]{-1, -3, 3, -4, 5, -0, 9_000_000});
        correctValue = 9_000_000;

        if (!sum.equals(correctValue)) {
            System.out.println(String.format("Метод sum работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", sum, correctValue));
            practiseMadeCorrectly = false;
        }


        sum = mathService.sum(new int[]{});
        correctValue = 0;

        if (!sum.equals(correctValue)) {
            System.out.println(String.format("Метод sum работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", sum, correctValue));
            practiseMadeCorrectly = false;
        }

        // --------------------------- getEvenDigits --------------------------- //

        int[] evenDigits = mathService.getEvenDigits(new int[]{-1, -3, 3, -4, 5, 6, 14});
        int[] correctEvenDigits = new int[]{-4, 6, 14};

        if (!Arrays.equals(evenDigits, correctEvenDigits)) {
            System.out.println(String.format("Метод getEvenDigits работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", Arrays.toString(evenDigits), Arrays.toString(correctEvenDigits)));
            practiseMadeCorrectly = false;
        }


        evenDigits = mathService.getEvenDigits(new int[]{-1, -3, 3, -7, 5, 9, 17});

        if (evenDigits.length != 0) {
            System.out.println(String.format("Метод getEvenDigits работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", Arrays.toString(evenDigits), Arrays.toString(new Integer[]{})));
            practiseMadeCorrectly = false;
        }

        evenDigits = mathService.getEvenDigits(new int[]{});

        if (evenDigits.length != 0) {
            System.out.println(String.format("Метод getEvenDigits работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", Arrays.toString(evenDigits), Arrays.toString(new Integer[]{})));
            practiseMadeCorrectly = false;
        }

        // --------------------------- TextService --------------------------- //

        SimpleTextService textService = new SimpleTextService();

        // --------------------------- toJumpCase --------------------------- //

        String jumpCaseString = textService.toJumpCase("Load Up On Guns And Bring Your Friends");
        String correctJumpCaseString = "lOaD Up oN GuNs aNd bRiNg yOuR FrIeNdS";

        if (!jumpCaseString.equals(correctJumpCaseString)) {
            System.out.println(String.format("Метод toJumpCase работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", jumpCaseString, correctJumpCaseString));
            practiseMadeCorrectly = false;
        }

        jumpCaseString = textService.toJumpCase("");
        correctJumpCaseString = "";

        if (!jumpCaseString.equals(correctJumpCaseString)) {
            System.out.println(String.format("Метод toJumpCase работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", jumpCaseString, correctJumpCaseString));
            practiseMadeCorrectly = false;
        }


        jumpCaseString = textService.toJumpCase("123... 123... Start!");
        correctJumpCaseString = "123... 123... sTaRt!";

        if (!jumpCaseString.equals(correctJumpCaseString)) {
            System.out.println(String.format("Метод toJumpCase работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", jumpCaseString, correctJumpCaseString));
            practiseMadeCorrectly = false;
        }

        // --------------------------- isQuestionString --------------------------- //

        boolean isQuestionString = textService.isQuestionString("Hello, hello, hello, how low?");

        if (!isQuestionString) {
            System.out.println(String.format("Метод isQuestionString работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", false, true));
            practiseMadeCorrectly = false;
        }

        isQuestionString = textService.isQuestionString("Hello, hello, hello!");

        if (isQuestionString) {
            System.out.println(String.format("Метод isQuestionString работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", true, false));
            practiseMadeCorrectly = false;
        }

        // --------------------------- concatenate --------------------------- //

        String resultString = textService.concatenate("Smells", " ", "Like", " ", "Teen", " ", "Spirit");
        String correctResultString = "Smells Like Teen Spirit";

        if (!resultString.equals(correctResultString)) {
            System.out.println(String.format("Метод concatenate работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", resultString, correctResultString));
            practiseMadeCorrectly = false;
        }

        resultString = textService.concatenate("", "", "");
        correctResultString = "";

        if (!resultString.equals(correctResultString)) {
            System.out.println(String.format("Метод concatenate работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", resultString, correctResultString));
            practiseMadeCorrectly = false;
        }

        // --------------------------- removeString --------------------------- //

        resultString = textService.removeString("Hello, hello, hello, how low?", ", he");
        correctResultString = "Hellollollo, how low?";

        if (!resultString.equals(correctResultString)) {
            System.out.println(String.format("Метод removeString работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", resultString, correctResultString));
            practiseMadeCorrectly = false;
        }

        resultString = textService.removeString("Hello, hello, hello, how low?", " ");
        correctResultString = "Hello,hello,hello,howlow?";

        if (!resultString.equals(correctResultString)) {
            System.out.println(String.format("Метод removeString работает неверно. Текущее значение = %s. " +
                    "Ожидаемое значение = %s.", resultString, correctResultString));
            practiseMadeCorrectly = false;
        }


        if (practiseMadeCorrectly) {
            System.out.println("Практика сделана верно");
        } else {
            System.out.println("Практика сделана неверно");
        }
    }

}
