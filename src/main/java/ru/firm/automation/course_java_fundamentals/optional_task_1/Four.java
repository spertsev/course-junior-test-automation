package ru.firm.automation.course_java_fundamentals.optional_task_1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Four {
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = new int[n];
        int[] countsOfUniqueDigits = new int[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Input a number:");
            numbers[i] = scanner.nextInt();
            String currentNumberAsString = String.valueOf(numbers[i]);
            Set<Character> uniqueDigits = new HashSet<>();
            for (int j = 0; j < currentNumberAsString.length(); j++) {
                uniqueDigits.add(currentNumberAsString.charAt(j));
            }
            countsOfUniqueDigits[i] = uniqueDigits.size();
        }

        int minCountOfUniqueDigits = countsOfUniqueDigits[0];
        int indexOfMinCountOfUniqueDigitsElement = 0;
        for (int i = 1; i < n; i++) {
            if (countsOfUniqueDigits[i] < minCountOfUniqueDigits) {
                minCountOfUniqueDigits = countsOfUniqueDigits[i];
                indexOfMinCountOfUniqueDigitsElement = i;
            }
        }

        System.out.println("Number, that has minimum count of unique digits is '" + numbers[indexOfMinCountOfUniqueDigitsElement]);
    }

}
