package ru.firm.automation.course_java_fundamentals.optional_task_1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int n = 3;
        int[] numbers = new int[n];
        int[] lengthsOfNumbers = new int[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Input a number:");
            numbers[i] = scanner.nextInt();
            lengthsOfNumbers[i] = getCountsOfDigits(numbers[i]);
        }

        int maxLength = lengthsOfNumbers[0];
        int minLength = lengthsOfNumbers[0];
        int indexOfMaxLengthElement = 0;
        int indexOfMinLengthElement = 0;
        for (int i = 1; i < n; i++) {
            if (lengthsOfNumbers[i] > maxLength) {
                maxLength = lengthsOfNumbers[i];
                indexOfMaxLengthElement = i;
            }
            if (lengthsOfNumbers[i] < minLength) {
                minLength = lengthsOfNumbers[i];
                indexOfMinLengthElement = i;
            }
        }

        System.out.println("The maximum length number is '" + numbers[indexOfMaxLengthElement] + "', its length is '" + lengthsOfNumbers[indexOfMaxLengthElement] + "'");
        System.out.println("The minimum length number is '" + numbers[indexOfMinLengthElement] + "', its length is '" + lengthsOfNumbers[indexOfMinLengthElement] + "'");
    }

    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}
