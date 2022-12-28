package com.ggr3ml1n.classes.task6;


public class Entrants {
    private String lastName;
    private String firstName;
    private String city;
    private int age;
    private String login;
    private String password;
    private double knowledgeOfSubject;
    private double result;
    private double mark;

    public Entrants(String lastName, String firstName, String city, int age, String login, String password, double knowledgeOfSubject) {
        setLastName(lastName);
        setFirstName(firstName);
        setCity(city);
        setAge(age);
        setLogin(login);
        setPassword(password);
        setKnowledgeOfSubject(knowledgeOfSubject);
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 50) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getKnowledgeOfSubject() {
        return knowledgeOfSubject;
    }

    public void setKnowledgeOfSubject(double knowledgeOfSubject) {
        this.knowledgeOfSubject = knowledgeOfSubject;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        if (result < 0 || result>100) {
            throw new IllegalArgumentException();
        } else {
            this.result = result;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void singUp(Faculty faculty){
        faculty.setEntrants(this);
    }

    public void passExam(Faculty faculty) {
        if (faculty.getEntrants().contains(this)) {
            result = faculty.getExam().getResult(this);
        } else {
            throw new IllegalArgumentException("Студент не зарегистрирован на факультете");
        }
    }
}
