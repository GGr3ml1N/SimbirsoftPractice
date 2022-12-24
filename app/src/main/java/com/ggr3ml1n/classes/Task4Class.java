package com.ggr3ml1n.classes;

/*
      IV

      Составить описание класса для представления времени.
      Предусмотреть возможности установки времени и изменения его отдельных полей
      (час, минута, секунда) с проверкой допустимости вводимых значений.
      В случае недопустимых значений полей выбрасываются исключения.
      Создать методы изменения времени на заданное количество часов, минут и секунд.
     */
public class Task4Class {
    private int seconds;
    private int minutes;
    private int hours;

    public Task4Class(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Task4Class() {
        this(0, 0, 0);
    }

    public Task4Class(int seconds) {
        this(0, 0, seconds);
    }

    public Task4Class(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException();
        } else {
            this.seconds = seconds;
        }

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException();
        } else {
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (seconds < 0 || seconds > 23) {
            throw new IllegalArgumentException();
        } else {
            this.hours = hours;
        }
    }

    public void addSeconds(int seconds) {
        this.seconds += seconds;

        this.minutes += this.seconds / 60;
        this.seconds = this.seconds % 60;

        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;

        this.hours = this.hours / 24;
    }

    public void addMinutes(int minutes) {
        addSeconds(minutes * 60);
    }

    public void addHours(int hours) {
        addSeconds(hours * 3600);
    }

    @Override
    public String toString() {
        return "hh:mm:ss" + hours + ":" + minutes + ":" + seconds;
    }
}
