package ru.firm.automation.course_java_fundamentals.main_task;

/*
 *  1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input username:");
        userName = scanner.nextLine();
        System.out.print("Greetings, " + userName + "!");
    }
}