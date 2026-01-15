package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTests {
    @Test
    public void testCreateTeacher() {
        Teacher teacher = new Teacher("Alice", "Math");
        assertEquals("Alice", teacher.getName());
        assertEquals("Math", teacher.getClassName());
    }

    @Test
    public void testGettersAndSetters() {
        Teacher teacher = new Teacher("Alice", "Math");
        teacher.setName("Bob");
        teacher.setClassName("Science");
        assertEquals("Bob", teacher.getName());
        assertEquals("Science", teacher.getClassName());
    }

    @Test
    public void testToString() {
        Teacher teacher = new Teacher("Alice", "Math");
        assertEquals("Alice (Math)", teacher.toString());
    }
    // Negative case with ClassName as Null as name

    @Test
    public void testClassNameIsNull() {
        try {
            Teacher teacher = new Teacher("Alice", null);
            teacher.toString();

            fail("Expected RuntimeException for null className");

        } catch (RuntimeException e) {
            assertEquals("Class name cannot be null", e.getMessage());
        }

    }
// Edge case with empty name and class name

    @Test
    public void testEmptyNameAndClassName() {
        Teacher teacher = new Teacher("", "");
        assertEquals("", teacher.getName());
        assertEquals("", teacher.getClassName());
        assertEquals(" ()", teacher.toString());
    }
}

