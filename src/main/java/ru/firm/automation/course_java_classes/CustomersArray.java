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

import java.util.Arrays;

public class CustomersArray {
    private int elementsNumber;
    private Customer[] customers;

    public CustomersArray() {
    }

    public CustomersArray(int elementsNumber) {
        this.elementsNumber = elementsNumber;
        customers = new Customer[elementsNumber];
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

    public void setCustomerCreditCardNumber(int index, int creditCardNumber) {
        customers[index].setCreditCardNumber(creditCardNumber);
    }

    public void setCustomerBankAccountNumber(int index, int bankAccountNumber) {
        customers[index].setBankAccountNumber(bankAccountNumber);
    }

    public void getCustomersInAlphabetOrder() {
        String[] surnames = new String[elementsNumber];
        for (int i = 0; i < surnames.length; i++) {
            surnames[i] = customers[i].getSurname();
        }

        System.out.println("\nInitial array:");
        for (int i = 0; i < elementsNumber; i++) {
            System.out.println(customers[i].toString());
        }

        System.out.println("\nThe customers in alphabet order:");
        Arrays.sort(customers);
        for (int i = 0; i < elementsNumber; i++) {
            System.out.println(customers[i].toString());
        }
    }

    public void getCustomersWhoseCardNumberInRange(int fromNumber, int toNumber) {
        System.out.println("\nCustomers, whose card number is in range " + fromNumber + "..." + toNumber);
        for (int i = 0; i < elementsNumber; i++) {
            if (customers[i].getCreditCardNumber() >= fromNumber && customers[i].getCreditCardNumber() <= toNumber) {
                System.out.println(customers[i].toString());
            }
        }
    }

}


