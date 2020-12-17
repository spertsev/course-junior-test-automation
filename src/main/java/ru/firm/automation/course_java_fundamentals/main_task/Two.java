package ru.firm.automation.course_java_fundamentals.main_task;

/*
 *  2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class Two {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There are no the arguments");
            System.exit(0);
        }
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i]);
        }
    }
}