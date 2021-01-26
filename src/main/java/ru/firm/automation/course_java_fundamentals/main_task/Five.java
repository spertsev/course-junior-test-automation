package ru.firm.automation.course_java_fundamentals.main_task;

/*
 *  5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

import java.util.Scanner;
import java.time.Month;

public class Five {
    public static void main(String[] args) {
        boolean isProgramWorking = true;
        Scanner scanner = new Scanner(System.in);

        while (isProgramWorking) {
            System.out.print("Input a month number:");
            int numberOfMonth = scanner.nextInt();
            try {
                System.out.println(Month.of(numberOfMonth));
                isProgramWorking = false;
            } catch (Exception e) {
                System.out.println("The number you've input is wrong, please try again");
            }
        }
    }
}
