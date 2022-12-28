package com.ggr3ml1n.classes.task6;

public class Teacher {
    private String login;
    private String password;

    public Teacher(String login, String password) {
        setLogin(login);
        setPassword(password);
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

    public void setMark(Faculty faculty) {
        for (Entrants entrant : faculty.getEntrants()) {
            if (entrant.getResult() >= 50.0 && entrant.getResult() < 65) {
                entrant.setMark(3.0);
            }
            if (entrant.getResult() >= 65 && entrant.getResult() < 80) {
                entrant.setMark(4.0);
            }
            if (entrant.getResult() >= 80 && entrant.getResult() <= 100) {
                entrant.setMark(5.0);
            }
            if (entrant.getResult() < 50) {
                entrant.setMark(2.0);
            }
        }
    }
}
