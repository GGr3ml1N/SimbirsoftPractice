package com.ggr3ml1n.classes.task6;

public class SystemOfUniversity {
    public static boolean isPassed(Entrants entrants, Faculty faculty) {
        if (entrants.getMark() >= faculty.getAverageMark()) {
            System.out.println("Абитуриент " + entrants.getLastName() + " " + entrants.getLastName() + " поступил на " + faculty.getNameOfFaculty());
            return true;
        } else {
            System.out.println("Абитуриент " + entrants.getLastName() + " " + entrants.getLastName() + " не поступил на " + faculty.getNameOfFaculty());
            return false;
        }
    }
}
