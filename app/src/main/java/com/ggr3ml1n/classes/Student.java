package com.ggr3ml1n.classes;

public class Student {

    private String firstName;
    private String lastName;
    private String patronymic;
    private int yearOfBirth;
    private int course;
    private int numberOfGroup;
    private int markMath;
    private int markLanguage;
    private int markPhys;
    private int markBiology;
    private int markPE;

    public static final int GROUP1 = 1;
    public static final int GROUP2 = 2;
    public static final int GROUP3 = 3;

    public Student() {

    }

    public Student(
            String firstName,
            String lastName,
            String patronymic,
            int yearOfBirth,
            int course, int numberOfGroup,
            int markMath,
            int markLanguage,
            int markPhys,
            int markBiology,
            int markPE) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = (yearOfBirth > 1990 && yearOfBirth < 2005) ? yearOfBirth : 2000;
        this.course = (course >= 1 && course <= 5) ? course : 3;
        this.numberOfGroup = numberOfGroup;
        this.markMath = (markMath >= 1 && markMath <= 5) ? markMath : 3;
        this.markLanguage = (markLanguage >= 1 && markLanguage <= 5) ? markLanguage : 3;
        this.markPhys = (markPhys >= 1 && markPhys <= 5) ? markPhys : 3;
        this.markBiology = (markBiology >= 1 && markBiology <= 5) ? markBiology : 3;
        this.markPE = (markPE >= 1 && markPE <= 5) ? markPE : 3;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = (yearOfBirth > 1990 && yearOfBirth < 2005) ? yearOfBirth : 2000;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = (course >= 1 && course <= 5) ? course : 3;
    }

    public Integer getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public Integer getMarkMath() {
        return markMath;
    }

    public void setMarkMath(int markMath) {
        this.markMath = (markMath >= 1 && markMath <= 5) ? markMath : 3;
    }

    public Integer getMarkLanguage() {
        return markLanguage;
    }

    public void setMarkLanguage(int markLanguage) {
        this.markLanguage = (markLanguage >= 1 && markLanguage <= 5) ? markLanguage : 3;

    }

    public Integer getMarkPhys() {
        return markPhys;
    }

    public void setMarkPhys(int markPhys) {
        this.markPhys = (markPhys >= 1 && markPhys <= 5) ? markPhys : 3;
    }

    public Integer getMarkBiology() {
        return markBiology;
    }

    public void setMarkBiology(int markBiology) {
        this.markBiology = (markBiology >= 1 && markBiology <= 5) ? markBiology : 3;
    }

    public Integer getMarkPE() {
        return markPE;
    }

    public void setMarkPE(int markPE) {
        this.markPE = (markPE >= 1 && markPE <= 5) ? markPE : 3;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", course=" + course +
                ", numberOfGroup=" + numberOfGroup +
                ", markMath=" + markMath +
                ", markLanguage=" + markLanguage +
                ", markPhys=" + markPhys +
                ", markBiology=" + markBiology +
                ", markPE=" + markPE +
                '}';
    }


}
