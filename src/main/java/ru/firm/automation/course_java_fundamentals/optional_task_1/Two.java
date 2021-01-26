package ru.firm.automation.course_java_fundamentals.optional_task_1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  2. Вывести числа в порядке возрастания (убывания) значений их длины.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Input a number:");
            numbers[i] = scanner.nextInt();
        }

        boolean areNumbersSorted = false;
        while (!areNumbersSorted) {
            areNumbersSorted = true;
            for (int i = 1; i < numbers.length; i++) {
                if (getCountsOfDigits(numbers[i]) < getCountsOfDigits(numbers[i - 1])) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                    areNumbersSorted = false;
                }
            }
        }
        System.out.println("The numbers in length ascending order: " + Arrays.toString(numbers));
        System.out.print("The numbers in length descending order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}
