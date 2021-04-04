package ru.firm.automation.course_java_collections.optional_task;

/*
 *  2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        String numberAsString;
        Scanner scanner = new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder reversedNumber = new StringBuilder();

        System.out.print("Input a number:");
        numberAsString = scanner.nextLine();
        for (int i = 0; i <= numberAsString.length() - 1; i++) {
            stack.push(numberAsString.charAt(i));
        }
        while (!stack.isEmpty()) {
            reversedNumber.append(stack.pop());
        }
        System.out.println("Reversed number:" + reversedNumber);
    }
}
