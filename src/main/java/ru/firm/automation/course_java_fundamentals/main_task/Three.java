package ru.firm.automation.course_java_fundamentals.main_task;

/*
 *  3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number of random numbers:");
        int amountOfNumbers = scanner.nextInt();
        int[] numbers = new int[amountOfNumbers];

        for (int i = 0; i < amountOfNumbers; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt();
            System.out.println(numbers[i]);
        }
        for (int number : numbers) {
            System.out.print(number);
        }
    }
}