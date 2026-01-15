package org.example;

public class Student {
    private String name;
    private double grade;
    private int daysAbsent;

    public Student(String name, double grade, int daysAbsent) {
        if (grade < 0) {
            throw new RuntimeException("Grade cannot be negative");
        }
        if (daysAbsent < 0) {
            throw new RuntimeException("Days absent cannot be negative");
        }
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
        if (grade < 0) {
            throw new RuntimeException("Grade cannot be negative");
        }
        this.grade = grade;
    }

    public int getDaysAbsent() {

        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) {
      if (daysAbsent < 0) {
          throw new RuntimeException("Days absent cannot be negative");
      }
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
