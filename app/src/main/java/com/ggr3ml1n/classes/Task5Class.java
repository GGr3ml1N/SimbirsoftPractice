package com.ggr3ml1n.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task5Class {
    int id;
    String lastName;
    String firstName;
    String patronymic;
    String address;
    int cardNumber;
    int debit;
    int credit;
    Task4Class timeOfLDN;
    Task4Class timeOfCityN;

    public Task5Class(int id,
                      String lastName, String firstName, String patronymic,
                      String address, int cardNumber,
                      int debit, int credit,
                      Task4Class timeOfLDN, Task4Class timeOfCityN) {
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

    public Task5Class() {
        this(0,
                "Ivanov", "Ivan", "Ivanovich",
                "Moskva, Pushkina, 1", 123456789,
                0, 0,
                new Task4Class(0, 0, 0), new Task4Class(0, 0, 0));
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

    public Task4Class getTimeOfLDN() {
        return timeOfLDN;
    }

    public void setTimeOfLDN(Task4Class timeOfLDN) {
        this.timeOfLDN = timeOfLDN;
    }

    public Task4Class getTimeOfCityN() {
        return timeOfCityN;
    }

    public void setTimeOfCityN(Task4Class timeOfCityN) {
        this.timeOfCityN = timeOfCityN;
    }

    public static void listOfCallersIncreasingLDConversation(Task4Class time, Task5Class... callers) {
        ArrayList<Task5Class> listOfCallers = new ArrayList<>(Arrays.asList(callers));

        for (Task5Class caller : listOfCallers) {
            if (caller.timeOfLDN.formatToSeconds().getTimeInSeconds() > time.formatToSeconds().getTimeInSeconds()) {
                System.out.println(caller);
            }
        }

    }

    public static void listOfCallersWhoUsedLDConversation(Task5Class... callers) {
        ArrayList<Task5Class> listOfCallers = new ArrayList<>(Arrays.asList(callers));

        for (Task5Class caller : listOfCallers) {
            if (caller.timeOfLDN.formatToSeconds().getTimeInSeconds() > 0) {
                System.out.println(caller);
            }
        }
    }

    public static void sortedListOfCallers(Task5Class... callers) {
        ArrayList<Task5Class> listOfCallers = new ArrayList<>(Arrays.asList(callers));
        listOfCallers.sort(Comparator.comparing(Task5Class::getLastName));

        for (Task5Class caller : listOfCallers) {
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
