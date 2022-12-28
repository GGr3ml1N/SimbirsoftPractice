package com.ggr3ml1n.classes.task6;

import java.util.ArrayList;

public class Faculty {
    private String nameOfFaculty;

    private Exams exam;
    private double averageMark;
    private ArrayList<Entrants> entrants = new ArrayList<>();

    public Faculty(String nameOfFaculty, Exams exam) {
        setNameOfFaculty(nameOfFaculty);
        setExam(exam);
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark() {
        for (Entrants entrant : entrants) {
            averageMark += entrant.getMark();
        }
        averageMark = averageMark/entrants.size();
    }

    public ArrayList<Entrants> getEntrants() {
        return entrants;
    }

    public void setEntrants(Entrants entrant) {
        entrants.add(entrant);
    }

    public Exams getExam() {
        return exam;
    }

    public void setExam(Exams exam) {
        this.exam = exam;
    }
}