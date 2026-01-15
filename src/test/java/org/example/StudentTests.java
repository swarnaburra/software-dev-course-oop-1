package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {
    @Test
    public void testCreateStudent() {
        Student student = new Student("Alice", 90.0, 0);
        assertEquals("Alice", student.getName());
        assertEquals(90.0, student.getGrade(), 0.0);
        assertEquals(0, student.getDaysAbsent());
    }

    @Test
    public void testGettersAndSetters() {
        Student student = new Student("Alice", 90.0, 0);
        student.setName("Bob");
        student.setGrade(80.0);
        student.setDaysAbsent(1);
        assertEquals("Bob", student.getName());
        assertEquals(80.0, student.getGrade(), 0.0);
        assertEquals(1, student.getDaysAbsent());
    }

    @Test
    public void testToString() {
        Student student = new Student("Alice", 90.0, 0);
        assertEquals("Alice 90.0", student.toString());
    }

    @Test
    public void testAddAbsence() {
        Student student = new Student("Alice", 90.0, 0);
        student.addAbsence();
        assertEquals(1, student.getDaysAbsent());
    }

    @Test
    public void testAddBonusPoints() {
        Student student = new Student("Alice", 90.0, 0);
        student.addBonusPoints(5.0);
        assertEquals(95.0, student.getGrade(), 0.0);
    }

    // Negative Test Case

    @Test

    public void testDaysAbsentIsNegative(){

        try{
            Student student = new Student("Alice", 90.0, -1);

            fail("Expected RuntimeException for negative daysAbsent");
        } catch (RuntimeException e) {
            assertEquals("Days absent cannot be negative", e.getMessage());
        }

    }

    // Edge Test Case
    @Test
    public void testStudentZeroGradeAndAbsences() {
        Student student = new Student("Charlie", 0.0, 0);
        assertEquals("Charlie", student.getName());
        assertEquals(0.0, student.getGrade(), 0.0);
        assertEquals(0, student.getDaysAbsent());
        assertEquals("Charlie 0.0", student.toString());
    }

}
