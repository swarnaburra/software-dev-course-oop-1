package org.example;

public class Student {
    private String name;
    private double grade;
    private int daysAbsent;

    public Student(String name, double grade, int daysAbsent) {
        this.name = name;
        this.grade = grade;
        this.daysAbsent = daysAbsent;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    public String toString() {
        return name + " " + grade;
    }

    // Add a void method called addAbsence that increments the daysAbsent field by 1.
    public void addAbsence() {
        daysAbsent +=1;
    }

    // Add a void method called addBonusPoints that takes a double parameter bonusPoints and adds it to the grade field.
public void addBonusPoints(double bonusPoints){
        grade += bonusPoints;

}
}
