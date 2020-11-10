package uk.ac.ncl.teach.test;

import org.junit.Test;

import uk.ac.ncl.teach.students.*;
import uk.ac.ncl.teach.schoolSystem.SchoolSystemapp;

import static org.junit.Assert.assertNotNull;

public class StudentTest {
    private SchoolSystemapp app = new SchoolSystemapp();

    @Test
    public void GetPartOfStudentIDTest() {
        studentID StudnetRegId;

        StudnetRegId = studentID.valueOf("a1234");
        assertNotNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("z9999");
        assertNotNull(StudnetRegId);
    }
    @Test
    public void getStudentID() {
    }

    @Test
    public void isTankFull() {
    }

    @Test
    public void getCurrentFuelCapacity() {
    }

    @Test
    public void addFuel() {
    }

    @Test
    public void drive() {
    }

    @Test
    public void startJourney() {
    }

    @Test
    public void isActive() {
    }

    @Test
    public void activate() {
    }

    @Test
    public void deactivate() {
    }

    @Test
    public void getType() {
    }

    @Test
    public void testToString() {
    }
}