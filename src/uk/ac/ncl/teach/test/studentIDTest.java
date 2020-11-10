package uk.ac.ncl.teach.test;

import org.junit.Test;
import uk.ac.ncl.teach.Module.Student;
import uk.ac.ncl.teach.Module.studentID;

import static org.junit.Assert.*;

public class studentIDTest {
    @Test
    public void StudentIDCorrectTest() {
        studentID StudnetRegId;
        String str = studentID.cstudentID();
        StudnetRegId = studentID.valueOf(str);
        assertNotNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("z9999");
        assertNotNull(StudnetRegId);
    }
    @Test
    public void WrongFormatTest() {
        studentID StudnetRegId;
        // check for identifiers with the wrong format, for what values we have wrong instantiation of the class
        StudnetRegId = studentID.valueOf("a");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("abcde");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("abcd1");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("abc12");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("ab123");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("12345");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("1234a");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("aaaaaaaaaaa");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("11111111111`");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("aaaaaaaaaaa11111111111");
        assertNull(StudnetRegId);
        // check for unique identifiers
        studentID.valueOf("a2222");
        StudnetRegId = studentID.valueOf("a2222");
        assertNull(StudnetRegId);
    }
    @Test
    public void TestGetPartOfStudentID() {
        final String s;
        s = Student.GetPartOfStudentID(studentID.cstudentID());
        System.out.println(s);
    }

}