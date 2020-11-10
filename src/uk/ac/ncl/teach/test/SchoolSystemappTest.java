package uk.ac.ncl.teach.test;

import org.junit.Before;
import org.junit.Test;
import uk.ac.ncl.teach.Module.SchoolSystemapp;
import uk.ac.ncl.teach.Module.studentID;
import uk.ac.ncl.teach.Module.Student;

public class SchoolSystemappTest  {
    private SchoolSystemapp a = new SchoolSystemapp();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void noOfStudents() {
        String strId= "UG";
        String StudnetRegId;
        StudnetRegId = "a1235";
        a.registerStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        StudnetRegId = "a1234";
        a.registerStudent(StudnetRegId, "UG", "John1", "Doe1", new Student.MyDate(30, 12, 1992));

        int no = a.noOfStudents(strId);
        System.out.println(no);
    }

    @Test
    public void registerStudent() {

        // check for identifiers with the wrong format, for what values we have wrong instantiation of the class


         String StudnetRegId = "a1237";
        //Student student1 = a.createStudent("StudnetRegId", "UG", "John", "Doe", new MyDate(30, 12, 1992));

        a.registerStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        a.showAllStudent();
    }

    @Test
    public void amendStudentData() {

        // check for identifiers with the wrong format, for what values we have wrong instantiation of the class


        String StudnetRegId = "a1238";
        a.registerStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        a.showAllStudent();
        a.amendStudentData(StudnetRegId, "PGT", "Kate", "Wang", new Student.MyDate(11, 11, 1991));
        a.showAllStudent();
    }

    @Test
    public void terminateStudent() {

        // check for identifiers with the wrong format, for what values we have wrong instantiation of the class


        String StudnetRegId = "a1239";
        a.registerStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        StudnetRegId = "a0001";
        a.registerStudent(StudnetRegId, "PGT", "Kate", "Wang", new Student.MyDate(11, 11, 1991));

        a.showAllStudent();
        a.terminateStudent(studentID.valueOf(StudnetRegId));
        a.showAllStudent();


    }
}