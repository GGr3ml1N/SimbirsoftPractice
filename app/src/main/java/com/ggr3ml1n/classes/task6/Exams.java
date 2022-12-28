package com.ggr3ml1n.classes.task6;

public class Exams {
    private String nameOfExam;

    public Exams(String nameOfExam) {
        setNameOfExam(nameOfExam);
    }

    public String getNameOfExam() {
        return nameOfExam;
    }

    public void setNameOfExam(String nameOfExam) {
        this.nameOfExam = nameOfExam;
    }

    private double random(double min, double max) {
        max -= min;
        return (Math.random() * ++max) + min;
    }

    public double getResult(Entrants entrants){
        return this.random(0, entrants.getKnowledgeOfSubject());
    }
}