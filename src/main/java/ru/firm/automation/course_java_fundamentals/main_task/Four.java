package ru.firm.automation.course_java_fundamentals.main_task;

/*
 *  4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class Four {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;
        int argAsInt = 0;

        if (args.length == 0) {
            System.out.println("There are no the arguments");
            System.exit(0);
        }

        for (String arg : args) {
            try {
                argAsInt = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Type of '" + arg + "' argument is not integer. The caught exception: " + e.fillInStackTrace());
                continue;
            }
            sum = sum + argAsInt;
            multiplication = multiplication * argAsInt;
        }

        System.out.println("Sum of the integer arguments =" + sum);
        System.out.println("Multiplication of the integer arguments =" + multiplication);
    }
}
