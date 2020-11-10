package ncl.teach.test;

import org.junit.Test;
import ncl.teach.entity.Student;
import ncl.teach.entity.StudentID;

import static org.junit.Assert.*;

public class StudentIDTest {
    private StudentID StudentID = new StudentID();
    @Test
    public void StudentIDCorrectTest() {
        StudentID StudnetRegId;
        String str = StudentID.cstudentID();
        StudnetRegId = StudentID.valueOf(str);
        assertNotNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("z9999");
        assertNotNull(StudnetRegId);
    }
    @Test
    public void WrongFormatTest() {
        StudentID StudnetRegId;
        // check for identifiers with the wrong format, for what values we have wrong instantiation of the class
        StudnetRegId = StudentID.valueOf("a");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("abcde");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("abcd1");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("abc12");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("ab123");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("12345");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("1234a");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("aaaaaaaaaaa");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("11111111111`");
        assertNull(StudnetRegId);
        StudnetRegId = StudentID.valueOf("aaaaaaaaaaa11111111111");
        assertNull(StudnetRegId);
        // check for unique identifiers
        StudentID.valueOf("a2222");
        StudnetRegId = StudentID.valueOf("a2222");
        assertNull(StudnetRegId);
    }
    @Test
    public void TestGetPartOfStudentID() {
        final String s;
        s = Student.GetPartOfStudentID(StudentID.cstudentID());
        System.out.println(s);
    }

}