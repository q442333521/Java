package ncl.teach.test;

import ncl.teach.entity.SmartCard;
import org.junit.Test;
import ncl.teach.entity.Course;
import ncl.teach.myabstract.Student;
import ncl.teach.entity.StudentID;

import static org.junit.Assert.*;

public class CourseTest {
    private Course course = new Course();
    //private StudentID StudentID = new StudentID();
    private SmartCard application = new SmartCard();
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
        String str = StudentID.cstudentID();
        Student student = application.CreateStudent(str, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        String courses = "CSC8401,CSC8402,CSC8403,CSC8404,CSC8405";
        boolean b = new Course().EnoughCredits(courses, student);
        assertTrue(b);

        new Course().setCourse();
        String str1 = StudentID.cstudentID();
        Student student1 = application.CreateStudent(str1, "PGT", "John", "Doe", new Student.MyDate(30, 12, 1992));
        String courses1 = "CSC8401,CSC8402,CSC8403";
        boolean b1 = new Course().EnoughCredits(courses1, student1);
        assertFalse(b1);
    }
    @Test
    public void getSupervisor() {
        String str = StudentID.cstudentID();
        Student student = application.CreateStudent(str, "PGR", "John", "Doe", new Student.MyDate(30, 12, 1992));
        new Course().setSupervisor(student,1);
        String name = new Course().getSupervisor(student,1);
        assertEquals("Bill gates", name);
    }

}