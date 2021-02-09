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
import java.util.Arrays;

public class CustomersArray {
    private int arrayElementsNumber;
    private Customer[] customers;

    public CustomersArray() {
    }

    public CustomersArray(int arrayElementsNumber) {
        this.arrayElementsNumber = arrayElementsNumber;
        customers = new Customer[arrayElementsNumber];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
        }
    }

    public void setCustomerId(int index, int id) {
        customers[index].setId(id);
    }

    public void setCustomerSurname(int index, String surname) {
        customers[index].setSurname(surname);
    }

    public void setCustomerName(int index, String name) {
        customers[index].setName(name);
    }

    public void setCustomerPatronymic(int index, String patronymic) {
        customers[index].setPatronymic(patronymic);
    }

    public void setCustomerResidenceAddress(int index, String residenceAddress) {
        customers[index].setResidenceAddress(residenceAddress);
    }

    public void setCustomerCreditCardNumber(int index, BigInteger creditCardNumber) {
        customers[index].setCreditCardNumber(creditCardNumber);
    }

    public void setCustomerBankAccountNumber(int index, int bankAccountNumber) {
        customers[index].setBankAccountNumber(bankAccountNumber);
    }

    public void printCustomersInAlphabetOrder() {
        System.out.println("\nThe customers in alphabet order:");
        Arrays.sort(customers);
        for (int i = 0; i < arrayElementsNumber; i++) {
            System.out.println(customers[i].toString());
        }
    }

    public void printCustomersWhoseCardNumberInRange(long startNumber, long endNumber) {
        System.out.println("\nCustomers, whose card number is in range " + startNumber + "..." + endNumber);
        boolean isCustomerWhoseCardNumberInRange = false;

        for (int i = 0; i < arrayElementsNumber; i++) {
            BigInteger currentCreditCardNumber = customers[i].getCreditCardNumber();
            if (currentCreditCardNumber.compareTo(BigInteger.valueOf(startNumber)) >= 0 && currentCreditCardNumber.compareTo(BigInteger.valueOf(endNumber)) <= 0) {
                System.out.println(customers[i].toString());
                isCustomerWhoseCardNumberInRange = true;
            }
        }
        if (!isCustomerWhoseCardNumberInRange) {
            System.out.println("There are no such customers");
        }
    }

    public void printCustomersArray() {
        System.out.println("\nInitial array:");
        for (int i = 0; i < arrayElementsNumber; i++) {
            System.out.println(customers[i].toString());
        }
    }

}


