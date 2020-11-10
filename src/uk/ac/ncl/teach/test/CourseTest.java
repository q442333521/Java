package uk.ac.ncl.teach.test;

import org.junit.Test;
import uk.ac.ncl.teach.Module.SmartCard;
import uk.ac.ncl.teach.Module.Course;
import uk.ac.ncl.teach.Module.Student;
import uk.ac.ncl.teach.Module.studentID;

import static org.junit.Assert.*;

public class CourseTest {
    private Course course = new Course();

    @Test
    public void getAllCourse() {
         Course c =new Course();
         c.setCourse();
        String str = c.getCourse();
        //assertNotEquals(null, str);
    }
    @Test
    public void getCourse() {
        new Course().setCourse();
        String courseno = "CSC8409";
        int num = new Course().getCourseGrade(courseno);
        assertEquals(20, num);
    }
    @Test
    public void TestEnoughCredits() {

        new Course().setCourse();
        String str = studentID.cstudentID();
        Student student = SmartCard.CreateStudent(str, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        String courses = "CSC8401,CSC8402,CSC8403,CSC8404,CSC8405";
        boolean b = new Course().EnoughCredits(courses, student);
        assertTrue(b);

        new Course().setCourse();
        String str1 = studentID.cstudentID();
        Student student1 = SmartCard.CreateStudent(str1, "PGT", "John", "Doe", new Student.MyDate(30, 12, 1992));
        String courses1 = "CSC8401,CSC8402,CSC8403";
        boolean b1 = new Course().EnoughCredits(courses1, student1);
        assertFalse(b1);
    }
    @Test
    public void getSupervisor() {
        String str = studentID.cstudentID();
        Student student = SmartCard.CreateStudent(str, "PGR", "John", "Doe", new Student.MyDate(30, 12, 1992));
        new Course().setSupervisor(student,1);
        String name = new Course().getSupervisor(student,1);
        assertEquals("Bill gates", name);
    }

}