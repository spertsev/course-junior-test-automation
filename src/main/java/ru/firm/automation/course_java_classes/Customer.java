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

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String residenceAddress;
    private BigInteger creditCardNumber;
    private int bankAccountNumber;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronymic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Customer(int id, String surname, String name, String patronymic, String residenceAddress, BigInteger creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.residenceAddress = residenceAddress;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(BigInteger creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", residenceAddress='" + residenceAddress + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

}
