package org.example;

public class Teacher {
    // You'll need to implement this class:

    // Add private fields for name and className
    private String name;
    private String className;

    // Add a constructor that takes a name and className and initializes the corresponding fields
    public Teacher(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // Add getter methods for name and className
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }


    // Add setter methods for name and className
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Add a toString method that returns the teacher's name and className in the following format:
    // name (className)

    @Override
    public String toString() {
        return name + " ("+className+")";
    }
}
