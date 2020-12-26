package ru.firm.automation.course_java_fundamentals.optional_task_1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[n];
        int[] lengthsOfNumbers = new int[n];
        Scanner scanner = new Scanner(System.in);
        int sumLength = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Input a number:");
            numbers[i] = scanner.nextInt();
            lengthsOfNumbers[i] = getCountsOfDigits(numbers[i]);
            sumLength = sumLength + lengthsOfNumbers[i];
        }
        double averageLength = (double) sumLength / n;
        System.out.println("The average length is " + averageLength);
        System.out.println("Numbers that have length lower than the average:");
        for (int i = 0; i < n; i++) {
            if (lengthsOfNumbers[i] < averageLength) {
                System.out.println(numbers[i] + ", its length is " + lengthsOfNumbers[i]);
            }
        }
        System.out.println("Numbers that have length greater than the average:");
        for (int i = 0; i < n; i++) {
            if (lengthsOfNumbers[i] > averageLength) {
                System.out.println(numbers[i] + ", its length is " + lengthsOfNumbers[i]);
            }
        }
    }

    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

}
