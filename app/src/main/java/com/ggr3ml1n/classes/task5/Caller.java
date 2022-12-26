package com.ggr3ml1n.classes.task5;

import com.ggr3ml1n.classes.task4.Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
      V

      Класс Абонент: Идентификационный номер, Фамилия, Имя, Отчество, Адрес,
      Номер кредитной карточки, Дебет, Кредит, Время междугородных и городских переговоров;
      Конструктор; Методы: установка значений атрибутов, получение значений атрибутов,
      вывод информации. Создать массив объектов данного класса.
      Вывести сведения относительно абонентов, у которых время городских переговоров
      превышает заданное.  Сведения относительно абонентов, которые пользовались
      междугородной связью. Список абонентов в алфавитном порядке.
     */
public class Caller {
    int id;
    String lastName;
    String firstName;
    String patronymic;
    String address;
    int cardNumber;
    int debit;
    int credit;
    Time timeOfLDN;
    Time timeOfCityN;

    public Caller(int id,
                  String lastName, String firstName, String patronymic,
                  String address, int cardNumber,
                  int debit, int credit,
                  Time timeOfLDN, Time timeOfCityN) {
        setId(id);
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
        setAddress(address);
        setCardNumber(cardNumber);
        setDebit(debit);
        setCredit(credit);
        setTimeOfLDN(timeOfLDN);
        setTimeOfCityN(timeOfCityN);
    }

    public Caller() {
        this(0,
                "Ivanov", "Ivan", "Ivanovich",
                "Moskva, Pushkina, 1", 123456789,
                0, 0,
                new Time(0, 0, 0), new Time(0, 0, 0));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException();
        } else {
            this.id = id;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        if (cardNumber < 0) {
            throw new IllegalArgumentException();
        } else {
            this.cardNumber = cardNumber;
        }
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Time getTimeOfLDN() {
        return timeOfLDN;
    }

    public void setTimeOfLDN(Time timeOfLDN) {
        this.timeOfLDN = timeOfLDN;
    }

    public Time getTimeOfCityN() {
        return timeOfCityN;
    }

    public void setTimeOfCityN(Time timeOfCityN) {
        this.timeOfCityN = timeOfCityN;
    }

    public static void listOfCallersIncreasingLDConversation(Time time, Caller... callers) {
        ArrayList<Caller> listOfCallers = new ArrayList<>(Arrays.asList(callers));

        for (Caller caller : listOfCallers) {
            if (caller.timeOfLDN.formatToSeconds().getTimeInSeconds() > time.formatToSeconds().getTimeInSeconds()) {
                System.out.println(caller);
            }
        }

    }

    public static void listOfCallersWhoUsedLDConversation(Caller... callers) {
        ArrayList<Caller> listOfCallers = new ArrayList<>(Arrays.asList(callers));

        for (Caller caller : listOfCallers) {
            if (caller.timeOfLDN.formatToSeconds().getTimeInSeconds() > 0) {
                System.out.println(caller);
            }
        }
    }

    public static void sortedListOfCallers(Caller... callers) {
        ArrayList<Caller> listOfCallers = new ArrayList<>(Arrays.asList(callers));
        listOfCallers.sort(Comparator.comparing(Caller::getLastName));

        for (Caller caller : listOfCallers) {
            System.out.println(caller);
        }
    }

    @Override
    public String toString() {
        return "Task5Class{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", debit=" + debit +
                ", credit=" + credit +
                ", timeOfLDN=" + timeOfLDN +
                ", timeOfCityN=" + timeOfCityN +
                '}';
    }
}
