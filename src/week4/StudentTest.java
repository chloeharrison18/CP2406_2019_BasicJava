package week4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test void basicTest() {
        Student student = new Student();

        // Test setters and getter methods.
        int testId = 1;
        student.setId(testId);
        int getId = student.getId();
        assertEquals(testId, getId);

        int testCreditHours = 12;
        student.setCreditHours(testCreditHours);
        int getCreditHours = student.getCreditHours();
        assertEquals(testCreditHours, getCreditHours);

        int testPoints = 2;
        student.setPoints(testPoints);
        int getPoints = student.getPoints();
        assertEquals(testPoints, getPoints);
    }

    @ Test void checkGPA() {
        Student student = new Student();

        // Set values to test calculating GPA.
        int testId = 1;
        student.setId(testId);
        int testCreditHours = 12;
        student.setCreditHours(testCreditHours);
        int testPoints = 2;
        student.setPoints(testPoints);

        // Test GPA calculation.
        double studentGpa = student.gpa();
    }

    @Test void initialiser() {
        Student student = new Student();

        // Test default constructor.
        int id = student.getId();
        assertEquals(9999, id);

        int creditHours = student.getCreditHours();
        assertEquals(3, creditHours);

        int points = student.getPoints();
        assertEquals(12, points);
    }
}