package ru.firm.automation.course_java_collections.optional_task;

/*
 *  1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class One {
    public static void main(String[] args) {
        File file = new File("src/main/java/ru/firm/automation/course_java_collections/optional_task/file.txt");
        List<String> list = new ArrayList<>();
        StringBuilder resultBuilder = new StringBuilder("");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            exit(4);
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (int i = list.size() - 1; i >= 0; i--) {
                resultBuilder.append(list.get(i) + "\n");
            }
            resultBuilder.deleteCharAt(resultBuilder.length() - 1);
            fileWriter.write(resultBuilder.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
