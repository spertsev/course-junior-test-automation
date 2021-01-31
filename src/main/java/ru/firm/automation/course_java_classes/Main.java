package ru.firm.automation.course_java_classes;

/*
 *  Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(),
 *  toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора
 *  данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено
 *  несколько конструкторов.
 *
 *  Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 *  Создать массив объектов. Вывести:
 *  a) список покупателей в алфавитном порядке;
 *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int customersNumber = 7;
        CustomersArray customersArray = new CustomersArray(customersNumber);

        String[] surnames = {"Ivanov", "Petrov", "Sidorov"};
        String[] names = {"Ivan", "Petr", "Sidor"};
        String[] patronymics = {"Ivanovich", "Petrovich", "Sidorovich"};
        String[] residenceAddresses = {"Gagarina 10", "Gorkogo 11", "Minina 12"};
        for (int i = 0; i < customersNumber; i++) {
            customersArray.setCustomerId(i, i + 1000);
            customersArray.setCustomerSurname(i, surnames[ThreadLocalRandom.current().nextInt(0, surnames.length)]);
            customersArray.setCustomerName(i, names[ThreadLocalRandom.current().nextInt(0, names.length)]);
            customersArray.setCustomerPatronymic(i, patronymics[ThreadLocalRandom.current().nextInt(0, patronymics.length)]);
            customersArray.setCustomerResidenceAddress(i, residenceAddresses[ThreadLocalRandom.current().nextInt(0, residenceAddresses.length)]);
            customersArray.setCustomerCreditCardNumber(i, BigInteger.valueOf(1000000000000000L).add(BigInteger.valueOf(ThreadLocalRandom.current().nextInt(1, 99))));
            customersArray.setCustomerBankAccountNumber(i, ThreadLocalRandom.current().nextInt(555555555, 999999999));
        }

        customersArray.printCustomersInAlphabetOrder();
        customersArray.printCustomersWhoseCardNumberInRange(1000000000000000L, 1000000000000055L);
    }
}
