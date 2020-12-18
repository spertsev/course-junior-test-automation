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

        boolean numbersAreSorted = false;
        while (!numbersAreSorted) {
            numbersAreSorted = true;
            for (int i = 1; i < numbers.length; i++) {
                if (getCountsOfDigits(numbers[i]) < getCountsOfDigits(numbers[i - 1])) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                    numbersAreSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}
